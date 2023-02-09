// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link talkParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface talkVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link talkParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(talkParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link talkParser#statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatment(talkParser.StatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link talkParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(talkParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link talkParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(talkParser.PrintContext ctx);
}