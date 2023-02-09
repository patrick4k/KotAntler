import org.antlr.v4.runtime.ANTLRFileStream
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTree

fun main(args: Array<String>) {
    val lexer = talkLexer(ANTLRFileStream("C:\\Users\\Patrick\\Documents\\Code\\SE300\\KotAntler\\src\\test\\talk\\test.talk"))
    val parser = talkParser(CommonTokenStream(lexer))
    val tree: ParseTree = parser.program()
    val visitor = talkEvalVisitor()
    val treeVisit = visitor.visit(tree)

    println(treeVisit.asString())

    println("Done")

}
