package scalar

import Program
import kotlin.math.pow

class Number(private var value: Double): Scalar(value) {
    override fun toString(): String {
        return value.toString()
    }

    override fun asNumber(): Number {
        return this
    }

    override fun asStr(): Str {
        return Str(this.value.toString())
    }

    override fun asBool(): Bool {
        return Bool(this.value > 0)
    }

    override fun negate() {
        this.value *= -1
    }

    /*PLUS*/
    override fun plus(scalar: Number): Scalar {
        return Number(this.value + scalar.value)
    }

    override fun plus(scalar: Str): Scalar {
        return Str("$this$scalar")
    }

    /*MIN*/
    override fun min(scalar: Number): Scalar {
        return Number(this.value - scalar.value)
    }

    override fun min(scalar: Str): Scalar {
        return this.asStr().min(scalar)
    }

    /*MULT*/
    override fun mult(scalar: Number): Scalar {
        return Number(this.value * scalar.value)
    }

    override fun mult(scalar: Str): Scalar {
        return scalar.plus(this)
    }

    /*DIV*/
    override fun div(scalar: Number): Scalar {
        return Number(this.value / scalar.value)
    }

    override fun div(scalar: Str): Scalar {
        return this.asStr().div(scalar)
    }

    /*POW*/
    override fun pow(scalar: Number): Scalar {
        return Number(this.value.pow(scalar.value))
    }

    override fun pow(scalar: Str): Scalar {
        return this.asStr().pow(scalar)
    }
}
