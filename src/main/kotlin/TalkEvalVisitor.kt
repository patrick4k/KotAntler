import scalar.*
import scalar.Number
import talkParser.NegExprContext

class TalkEvalVisitor : talkBaseVisitor<Scalar>() {
    companion object {
        private lateinit var program: Program
    }
    override fun visitProgram(ctx: talkParser.ProgramContext?): Scalar {
        program = Program.set()
        ctx?.statment()?.forEach { visit(it) }
        return Null()
    }

    override fun visitStatment(ctx: talkParser.StatmentContext?): Scalar {
        ctx?.children?.forEach {visit(it)}
        return Null()
    }

    override fun visitNegExpr(ctx: talkParser.NegExprContext?): Scalar {
        if (ctx?.expression() is NegExprContext)
            Program.throwError("Cannot negate on negate expression",ctx.text)
        val expr = visit(ctx?.expression())
        expr.negate()
        return expr
    }

    override fun visitKeywordExpr(ctx: talkParser.KeywordExprContext?): Scalar {
        when (ctx?.text) {
            "true" -> return Bool(true)
            "false" -> return Bool(false)
            "null" -> return Null()
        }
        return super.visitKeywordExpr(ctx)
    }

    override fun visitParExpr(ctx: talkParser.ParExprContext?): Scalar {
        return visit(ctx?.expression())
    }

    override fun visitAbsExpr(ctx: talkParser.AbsExprContext?): Scalar {
        val expr = visit(ctx?.expression())
        if (!expr.asBool().asBoolean()) expr.negate()
        return expr
    }

    override fun visitPrintExpr(ctx: talkParser.PrintExprContext?): Scalar {
        val out = visit(ctx?.expression())
        println("${ctx?.expression()?.text} = $out")
        return out
    }

    override fun visitAddSubExpr(ctx: talkParser.AddSubExprContext?): Scalar {
        when (ctx?.op?.text) {
            "+" -> return visit(ctx.expression(0)).plus(visit(ctx.expression(1)))
            "-" -> return visit(ctx.expression(0)).min(visit(ctx.expression(1)))
        }
        return super.visitAddSubExpr(ctx)
    }

    override fun visitStrExpr(ctx: talkParser.StrExprContext?): Scalar {
        return Str(ctx?.text?.removeSurrounding("\"")!!)
    }

    override fun visitMultDivExpr(ctx: talkParser.MultDivExprContext?): Scalar {
        when (ctx?.op?.text) {
            "*" -> return visit(ctx.expression(0)).mult(visit(ctx.expression(1)))
            "/" -> return visit(ctx.expression(0)).div(visit(ctx.expression(1)))
        }
        return Null()
    }

    override fun visitPowExpr(ctx: talkParser.PowExprContext?): Scalar {
        return visit(ctx?.expression(0)).pow(visit(ctx?.expression(1)))
    }

    override fun visitNumExpr(ctx: talkParser.NumExprContext?): Scalar {
        return Number(ctx?.NUMBER()?.text?.toDouble()!!)
    }

    override fun visitIdExpr(ctx: talkParser.IdExprContext?): Scalar {
        // TODO add variable declaration
        return Null()
    }
}
