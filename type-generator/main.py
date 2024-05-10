import os
from typing import Optional, Tuple

from tree_sitter import Parser, Language
import tree_sitter_typescript as ts_typescript
from src import ModelVisitor, EnumVisitor

parser = Parser()
parser.set_language(Language(ts_typescript.language_typescript(), "TypeScript"))
dir = "../src/main/java/cl/emilym/jlemmy/model/"

def generate_types():
    files = os.listdir("lemmy-js-client/src/types/")
    if not os.path.exists(dir):
        os.makedirs(dir)

    for file in files:
        if file.endswith("Id.ts"):
            continue
        with open(f"lemmy-js-client/src/types/{file}", "r") as f:
            print(file)
            result = parse_model(f.read())
            if result is None:
                continue
            with open(f"{dir}/{result[0]}.java", "w") as f:
                f.write(result[1])


def parse_model(model_contents: str) -> Optional[Tuple[str, str]]:
    tree = parser.parse(bytes(model_contents, "utf-8"))
    print(tree.root_node.sexp())
    if "export type" in model_contents:
        visitor = EnumVisitor(tree)
        result = visitor.build()
        return visitor.enum_name, result
    if "export interface" in model_contents:
        visitor = ModelVisitor(tree)
        result = visitor.build()
        return visitor.class_name, result
    return None


# Press the green button in the gutter to run the script.
if __name__ == '__main__':
    generate_types()
