import scalar.Null
import java.lang.RuntimeException

class Program {
    companion object {

        private var stopOnError = true

        private lateinit var program: Program

        fun set(): Program {
            program = Program()
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
            return throwError("$msg\n\tInvalid operation -> $codeSnip")
        }

    }
}
