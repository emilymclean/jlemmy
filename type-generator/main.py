from tree_sitter import Parser, Language
import tree_sitter_typescript as ts_typescript
from visitor import TypescriptVisitor

_package_statement = "package cl.emilym.jlemmy;"

parser = Parser()
parser.set_language(Language(ts_typescript.language_typescript(), "TypeScript"))

def parse_model(model_contents: str):
    tree = parser.parse(bytes(model_contents, "utf-8"))
    print(TypescriptVisitor(tree).build())



# Press the green button in the gutter to run the script.
if __name__ == '__main__':
    with open("lemmy-js-client/src/types/CreateSite.ts", "r") as f:
        parse_model(f.read())
