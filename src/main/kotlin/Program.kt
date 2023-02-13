import scalar.Null
import scalar.Scalar
import java.lang.RuntimeException

class Program {
    companion object {

        private var scopes = ArrayList<HashMap<String, Scalar>>()

        private var stopOnError = true

        private lateinit var program: Program

        fun getVar(varName: String): Scalar {
            for (i in scopes.lastIndex downTo 0) {
                if (scopes[i].containsKey(varName))
                    return scopes[i][varName]!!
            }
            throwError("Could not resolve identifier", varName)
            return Null()
        }

        fun enterScope() {
            this.scopes.add(HashMap())
        }

        fun exitScope() {
            this.scopes.removeLast()
        }

        fun setVar(varName: String, varValue: Scalar) {
            for (scope in scopes.reversed()) {
                if (scope[varName] != null) {
                    scope[varName] = varValue
                    return
                }
            }
            throwError("Variable called but undeclared",varName)
        }

        fun setNewVar(varName: String, varValue: Scalar) {
            if (this.scopes.last()[varName] != null)
                throwError("Cannot redeclare variable", "$varName = $varValue")
            this.scopes.last()[varName] = varValue
        }

        fun set(): Program {
            program = Program()
            enterScope()
            return program
        }

        fun get(): Program {
            return program
        }

        fun throwError(): Null {
            return throwError("Unknown Exception")
        }

        fun throwError(msg: String): Null {
            if (stopOnError) {
                throw RuntimeException(msg)
            }
            println("$msg\n")
            return Null()
        }

        fun throwError(msg: String, codeSnip: String): Null {
            return throwError("$msg\n\t---> $codeSnip")
        }

    }
}
