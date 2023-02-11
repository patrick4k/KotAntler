import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTree

fun main(args: Array<String>) {
//    val lexer = talkLexer(CharStreams.fromFileName("src/main/resources/test.talk"))
    val lexer = talkLexer(CharStreams.fromFileName("src/main/resources/var.talk"))
    val parser = talkParser(CommonTokenStream(lexer))
    val tree: ParseTree = parser.program()
    val visitor = TalkEvalVisitor()
    val treeVisit = visitor.visit(tree)

    println("COMPLETE")
}
