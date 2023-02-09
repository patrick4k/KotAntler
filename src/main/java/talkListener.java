// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link talkParser}.
 */
public interface talkListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link talkParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(talkParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link talkParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(talkParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link talkParser#statment}.
	 * @param ctx the parse tree
	 */
	void enterStatment(talkParser.StatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link talkParser#statment}.
	 * @param ctx the parse tree
	 */
	void exitStatment(talkParser.StatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link talkParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(talkParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link talkParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(talkParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link talkParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(talkParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link talkParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(talkParser.PrintContext ctx);
}