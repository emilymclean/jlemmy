from abc import ABC
from typing import List, Mapping, Callable

from tree_sitter import Tree, Node


class Visitor(ABC):
    _encoding = "utf-8"
    _number_type = "long"

    tree: Tree

    def __init__(self, tree: Tree):
        self.tree = tree

    def build(self) -> str:
        self._accept(self.tree.root_node)
        return self._generate()

    def _generate(self) -> str:
        pass

    def _accept(self, node: Node):
        node_type = node.type
        visit_name = f"visit_{node_type}"
        if hasattr(self, visit_name) and callable(getattr(self, visit_name)):
            getattr(self, visit_name)(node)
        else:
            self._accept_list(node.children)

    def _accept_list(self, nodes: List[Node]):
        for node in nodes:
            self._accept(node)