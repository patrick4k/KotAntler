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
	 * Enter a parse tree produced by the {@code strExpr}
	 * labeled alternative in {@link talkParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStrExpr(talkParser.StrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code strExpr}
	 * labeled alternative in {@link talkParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStrExpr(talkParser.StrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link talkParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParExpr(talkParser.ParExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link talkParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParExpr(talkParser.ParExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addSubExpr}
	 * labeled alternative in {@link talkParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExpr(talkParser.AddSubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addSubExpr}
	 * labeled alternative in {@link talkParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExpr(talkParser.AddSubExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negExpr}
	 * labeled alternative in {@link talkParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNegExpr(talkParser.NegExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negExpr}
	 * labeled alternative in {@link talkParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNegExpr(talkParser.NegExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code absExpr}
	 * labeled alternative in {@link talkParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAbsExpr(talkParser.AbsExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code absExpr}
	 * labeled alternative in {@link talkParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAbsExpr(talkParser.AbsExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multDivExpr}
	 * labeled alternative in {@link talkParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultDivExpr(talkParser.MultDivExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multDivExpr}
	 * labeled alternative in {@link talkParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultDivExpr(talkParser.MultDivExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link talkParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPowExpr(talkParser.PowExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link talkParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPowExpr(talkParser.PowExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code keywordExpr}
	 * labeled alternative in {@link talkParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterKeywordExpr(talkParser.KeywordExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code keywordExpr}
	 * labeled alternative in {@link talkParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitKeywordExpr(talkParser.KeywordExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numExpr}
	 * labeled alternative in {@link talkParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumExpr(talkParser.NumExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numExpr}
	 * labeled alternative in {@link talkParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumExpr(talkParser.NumExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link talkParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(talkParser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link talkParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(talkParser.IdExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link talkParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(talkParser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link talkParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(talkParser.PrintExprContext ctx);
}