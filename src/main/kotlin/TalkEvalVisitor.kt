import scalar.*
import scalar.Number
import talkParser.DescopeStatContext
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

    override fun visitDeclaration(ctx: talkParser.DeclarationContext?): Scalar {
        ctx?.ID()?.forEach { Program.setNewVar(it.text, Null()) }

        ctx?.assignId()?.forEach {
            when (it) {
                is talkParser.AssignExpressionContext -> {
                    Program.setNewVar(it.ID()?.text!!, Null())
                    visitAssignExpression(it)
                }
                is talkParser.AssignPointerContext -> {
                    Program.setNewVar(it.ID(0)?.text!!, Null())
                    visitAssignPointer(it)
                }
            }
        }
        return Void()
    }

    override fun visitAssignExpression(ctx: talkParser.AssignExpressionContext?): Scalar {
        val varValue = visit(ctx?.expression())
        Program.setVar(ctx?.ID()?.text!!, varValue)
        return varValue
    }

    override fun visitAssignPointer(ctx: talkParser.AssignPointerContext?): Scalar {
        val varValue = Program.getVar(ctx?.ID(1)?.text!!)
        Program.setVar(ctx.ID(0)?.text!!, varValue)
        return varValue
    }

    override fun visitExprStat(ctx: talkParser.ExprStatContext?): Scalar {
        return visit(ctx?.expression())
    }

    override fun visitDeclarionStat(ctx: talkParser.DeclarionStatContext?): Scalar {
        return visitDeclaration(ctx?.declaration())
    }

    override fun visitAssignmentExpr(ctx: talkParser.AssignmentExprContext?): Scalar {
        return visit(ctx?.assignId())
    }

    override fun visitEndlStat(ctx: talkParser.EndlStatContext?): Scalar {
        // TODO visit endl ?
        return super.visitEndlStat(ctx)
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

    override fun visitIfExpr(ctx: talkParser.IfExprContext?): Scalar {
        if (visit(ctx?.expression(0)).asBoolean())
            return visit(ctx?.expression(1))
        val elseExpr = ctx?.expression(2)
        if (elseExpr != null) return visit(elseExpr)
        return Null()
    }

    override fun visitBlock(ctx: talkParser.BlockContext?): Scalar {
        Program.enterScope()
        for (stat in ctx?.statment()!!) {
            if (stat is DescopeStatContext) {
                Program.exitScope()
                return visit(stat.expression())
            }
            visit(stat)
        }
        Program.exitScope()
        return Null()
    }

    override fun visitDescopeStat(ctx: talkParser.DescopeStatContext?): Scalar {
        if (ctx?.expression() != null) return visit(ctx.expression())
        return Null()
    }

    override fun visitBlockExpr(ctx: talkParser.BlockExprContext?): Scalar {
        return visitBlock(ctx?.block())
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
        return Program.getVar(ctx?.ID()?.text!!)
    }
}
