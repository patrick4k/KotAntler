
fun main() {
    val sc1 = Number(123)
    val sc2 = Number(0.5)

    println(sc1.plus(sc2))
}

abstract class Scalar(private var value: Any) {
    abstract override fun toString(): String

//     Number
    abstract fun plus(scalar: Number): Scalar
    abstract fun min(scalar: Number): Scalar
    abstract fun mult(scalar: Number): Scalar
    abstract fun div(scalar: Number): Scalar
    abstract fun pow(scalar: Number): Scalar
    
//    String
    abstract fun plus(scalar: Str): Scalar
    abstract fun min(scalar: Str): Scalar
    abstract fun mult(scalar: Str): Scalar
    abstract fun div(scalar: Str): Scalar
    abstract fun pow(scalar: Str): Scalar
    

    fun asDouble(): Double {
        return value as Double
    }

    fun asString(): String {
        return value as String
    }

}

/*NUMBER*/

fun Number(value: Int): Number { /*Secondary Constructor (INT -> Number)*/
    return Number(value.toDouble())
}

class Number(private var value: Double): Scalar(value) { /*Primary Constructor (Double -> Number*/

    override fun toString(): String {
        return value.toString()
    }

    override fun plus(scalar: Number): Scalar {
        return Number(value + scalar.asDouble())
    }

    override fun plus(scalar: Str): Scalar {
        TODO("Not yet implemented")
    }

    override fun min(scalar: Number): Scalar {
        TODO("Not yet implemented")
    }

    override fun min(scalar: Str): Scalar {
        TODO("Not yet implemented")
    }

    override fun mult(scalar: Number): Scalar {
        TODO("Not yet implemented")
    }

    override fun mult(scalar: Str): Scalar {
        TODO("Not yet implemented")
    }

    override fun div(scalar: Number): Scalar {
        TODO("Not yet implemented")
    }

    override fun div(scalar: Str): Scalar {
        TODO("Not yet implemented")
    }

    override fun pow(scalar: Number): Scalar {
        TODO("Not yet implemented")
    }

    override fun pow(scalar: Str): Scalar {
        TODO("Not yet implemented")
    }


}

class Str(private var value: String): Scalar(value) {
    override fun toString(): String {
        return value
    }

    override fun plus(scalar: Number): Scalar {
        TODO("Not yet implemented")
    }

    override fun plus(scalar: Str): Scalar {
        TODO("Not yet implemented")
    }

    override fun min(scalar: Number): Scalar {
        TODO("Not yet implemented")
    }

    override fun min(scalar: Str): Scalar {
        TODO("Not yet implemented")
    }

    override fun mult(scalar: Number): Scalar {
        TODO("Not yet implemented")
    }

    override fun mult(scalar: Str): Scalar {
        TODO("Not yet implemented")
    }

    override fun div(scalar: Number): Scalar {
        TODO("Not yet implemented")
    }

    override fun div(scalar: Str): Scalar {
        TODO("Not yet implemented")
    }

    override fun pow(scalar: Number): Scalar {
        TODO("Not yet implemented")
    }

    override fun pow(scalar: Str): Scalar {
        TODO("Not yet implemented")
    }

}
