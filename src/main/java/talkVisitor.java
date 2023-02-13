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
	 * Visit a parse tree produced by the {@code exprStat}
	 * labeled alternative in {@link talkParser#statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStat(talkParser.ExprStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code descopeStat}
	 * labeled alternative in {@link talkParser#statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescopeStat(talkParser.DescopeStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declarionStat}
	 * labeled alternative in {@link talkParser#statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarionStat(talkParser.DeclarionStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code endlStat}
	 * labeled alternative in {@link talkParser#statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndlStat(talkParser.EndlStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link talkParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(talkParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignExpression}
	 * labeled alternative in {@link talkParser#assignId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExpression(talkParser.AssignExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignPointer}
	 * labeled alternative in {@link talkParser#assignId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignPointer(talkParser.AssignPointerContext ctx);
	/**
	 * Visit a parse tree produced by {@link talkParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(talkParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignmentExpr}
	 * labeled alternative in {@link talkParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpr(talkParser.AssignmentExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code strExpr}
	 * labeled alternative in {@link talkParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrExpr(talkParser.StrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addSubExpr}
	 * labeled alternative in {@link talkParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubExpr(talkParser.AddSubExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code absExpr}
	 * labeled alternative in {@link talkParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsExpr(talkParser.AbsExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code keywordExpr}
	 * labeled alternative in {@link talkParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeywordExpr(talkParser.KeywordExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numExpr}
	 * labeled alternative in {@link talkParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumExpr(talkParser.NumExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link talkParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpr(talkParser.ParExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negExpr}
	 * labeled alternative in {@link talkParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegExpr(talkParser.NegExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifExpr}
	 * labeled alternative in {@link talkParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExpr(talkParser.IfExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multDivExpr}
	 * labeled alternative in {@link talkParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultDivExpr(talkParser.MultDivExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockExpr}
	 * labeled alternative in {@link talkParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockExpr(talkParser.BlockExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link talkParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowExpr(talkParser.PowExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link talkParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExpr(talkParser.PrintExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link talkParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpr(talkParser.IdExprContext ctx);
}