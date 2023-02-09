package scalar

import Program

abstract class Scalar(private var value: Any?) {
    abstract override fun toString(): String

    abstract fun asNumber(): Number
    abstract fun asStr(): Str

    fun asDouble(): Double {
        return value as Double
    }

    fun asString(): String {
        return value as String
    }

//     Number
    protected abstract fun plus(scalar: Number): Scalar
    protected abstract fun min(scalar: Number): Scalar
    protected abstract fun mult(scalar: Number): Scalar
    protected abstract fun div(scalar: Number): Scalar
    protected abstract fun pow(scalar: Number): Scalar
    
//    String
    protected abstract fun plus(scalar: Str): Scalar
    protected abstract fun min(scalar: Str): Scalar
    protected abstract fun mult(scalar: Str): Scalar
    protected abstract fun div(scalar: Str): Scalar
    protected abstract fun pow(scalar: Str): Scalar
    
//    Secondary Scalars
    protected fun plus(scalar: SecondaryScalar): Scalar {
        return when (this) {
            is Number -> this.plus(scalar.asNumber())
            is Str -> this.plus(scalar.asStr())
            else -> Null()
        }
    }
    protected fun min(scalar: SecondaryScalar): Scalar {
        return when (this) {
            is Number -> this.min(scalar.asNumber())
            is Str -> this.min(scalar.asStr())
            else -> Null()
        }
    }
    protected fun mult(scalar: SecondaryScalar): Scalar {
        return when (this) {
            is Number -> this.mult(scalar.asNumber())
            is Str -> this.mult(scalar.asStr())
            else -> Null()
        }
    }
    protected fun div(scalar: SecondaryScalar): Scalar {
        return when (this) {
            is Number -> this.div(scalar.asNumber())
            is Str -> this.div(scalar.asStr())
            else -> Null()
        }
    }
    protected fun pow(scalar: SecondaryScalar): Scalar {
        return when (this) {
            is Number -> this.pow(scalar.asNumber())
            is Str -> this.pow(scalar.asStr())
            else -> Null()
        }
    }


    /*
        Map types for each operation using smart cast
        - Need this for operating across two different types
        - Cannot use patter specific visitors since ID may lead to conflicting types
    */

    fun plus(scalar: Scalar): Scalar {
        when (scalar) {
            is Number-> return this.plus(scalar)
            is Str-> return this.plus(scalar)
            is Bool -> return this.plus(scalar)
            is Null -> return this.plus(scalar)
        }
        Program.throwError("Null expression")
        return Null()
    }

    fun min(scalar: Scalar): Scalar {
        when (scalar) {
            is Number-> return this.min(scalar)
            is Str-> return this.min(scalar)
            is Bool -> return this.min(scalar)
            is Null -> return this.min(scalar)
        }
        return Null()
    }

    fun mult(scalar: Scalar): Scalar {
        when (scalar) {
            is Number -> return this.mult(scalar)
            is Str-> return this.mult(scalar)
            is Bool -> return this.mult(scalar)
            is Null -> return this.mult(scalar)
        }
        return Null()
    }

    fun div(scalar: Scalar): Scalar {
        when (scalar) {
            is Number -> return this.div(scalar)
            is Str-> return this.div(scalar)
            is Bool -> return this.div(scalar)
            is Null -> return this.div(scalar)
        }
        return Null()
    }

    fun pow(scalar: Scalar): Scalar {
        when (scalar) {
            is Number -> return this.pow(scalar)
            is Str-> return this.pow(scalar)
            is Bool -> return this.pow(scalar)
            is Null -> return this.pow(scalar)
        }
        return Null()
    }

}
