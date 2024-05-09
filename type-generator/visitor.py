import datetime
import textwrap
from typing import List

from tree_sitter import Tree, Node
import util

class Property(object):
    api_name: str
    java_name: str
    cap_java_name: str
    type: str

    def __init__(self, api_name: str, java_name: str, cap_java_name: str, type: str):
        self.api_name = api_name
        self.java_name = java_name
        self.cap_java_name = cap_java_name
        self.type = type


class TypescriptVisitor(object):
    _encoding = "utf-8"
    _number_type = "long"
    _indent_char = "\t"

    tree: Tree
    _class_name = ""
    _properties: List[Property] = []

    def __init__(self, tree: Tree):
        self.tree = tree

    def build(self) -> str:
        self._accept(self.tree.root_node)
        return f"""
// This class was generated on {datetime.datetime.now(datetime.timezone.utc)}, do not modify it directly
package cl.emilym.jlemmy.model

public class {self._class_name} {{
{textwrap.indent(self._generate_property_list(), self._indent_char)}

{textwrap.indent(self._generate_constructor(), self._indent_char)}

{textwrap.indent(self._generate_get_and_sets(), self._indent_char)}
}}
        """.strip()

    def _generate_property_list(self) -> str:
        lines = []
        for prop in self._properties:
            serialized_line = f"@SerializedName(\"{prop.api_name}\")" if prop.java_name != prop.api_name else ""
            lines.append(f"""
{serialized_line}
private {prop.type} {prop.java_name};
            """.strip())

        return "\n".join(lines)

    def _generate_constructor(self) -> str:
        return f"""
public {self._class_name}({", ".join([f"{prop.type} {prop.java_name}" for prop in self._properties])}) {{
{textwrap.indent(self._generate_constructor_assignments(), self._indent_char)}
}}
        """.strip()

    def _generate_constructor_assignments(self) -> str:
        return "\n".join([f"this.{prop.java_name} = {prop.java_name}" for prop in self._properties])

    def _generate_get_and_sets(self) -> str:
        return "\n\n".join([f"""
public {prop.type} get{prop.cap_java_name}() {{
    return {prop.java_name};
}}

public void set{prop.cap_java_name}({prop.type} {prop.java_name}) {{
    this.{prop.java_name} = {prop.java_name};
}}
        """.strip() for prop in self._properties])

    def _accept(self, node: Node):
        if node.grammar_name == "interface_declaration":
            self.visit_interface_declaration(node)
        elif node.grammar_name == "property_signature":
            self.visit_property_signature(node)
        elif node.grammar_name == "type_annotation":
            self.visit_type_annotation(node)
        elif node.grammar_name == "generic_type":
            self.visit_generic_type(node)
        else:
            self._accept_list(node.children)

    def _accept_list(self, nodes: List[Node]):
        for node in nodes:
            self._accept(node)

    def visit_interface_declaration(self, node: Node):
        self._class_name = node.child_by_field_name("name").text.decode(self._encoding)
        self._accept_list(node.children)

    def visit_property_signature(self, node: Node):
        name = node.child_by_field_name("name").text.decode(self._encoding)

        self._properties.append(Property(
            name,
            util.to_lower_camel_case(name),
            util.to_camel_case(name),
            "Object"
        ))
        self._accept_list(node.children)

    def visit_type_annotation(self, node: Node):
        type_identifier = node.child(1).text.decode(self._encoding)
        if "<" in type_identifier:
            return self._accept(node.child(1))

        last_idx = len(self._properties) - 1

        self._properties[last_idx].type = self._normalize_type(type_identifier)

    def visit_generic_type(self, node: Node):
        last_idx = len(self._properties) - 1
        type_identifier = node.child(0).text.decode(self._encoding)
        type_parameter = self._normalize_type(node.child(1).child(1).text.decode(self._encoding))

        if type_identifier == "Array":
            out_type = f"{type_parameter}[]"
        else:
            raise f"Unhandled Type {type_identifier}!"

        self._properties[last_idx].type = out_type

    def _normalize_type(self, type_identifier: str) -> str:
        if type_identifier.endswith("Id"):
            return self._number_type
        elif type_identifier == "number":
            return self._number_type
        elif type_identifier == "string":
            return "String"

        return type_identifier