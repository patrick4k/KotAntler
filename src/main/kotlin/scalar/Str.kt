package scalar

class Str(private var value: String): Scalar(value) {
    override fun toString(): String {
        return value
    }

    override fun asNumber(): Number {
        return if (value == "") Number(0.0) else Number(1.0)
    }

    override fun asStr(): Str {
        return this
    }

    override fun asBool(): Bool {
        return Bool(this.value != "")
    }

    override fun negate() {
        this.value = this.value.reversed()
    }

    override fun plus(scalar: Number): Scalar {
        return this.plus(scalar.asStr())
    }

    override fun plus(scalar: Str): Scalar {
        return Str("$this$scalar")
    }

    override fun min(scalar: Number): Scalar {
        return this.min(scalar.asStr())
    }

    override fun min(scalar: Str): Scalar {
        return Str(this.value.replaceFirst(Regex(scalar.toString()), ""))
    }

    override fun mult(scalar: Number): Scalar {
        if (scalar.asDouble() <= 0) return Str("")
        var string = ""
        for (i in 1..scalar.asDouble().toInt())
            string += this.value
        return Str(string)
    }

    override fun mult(scalar: Str): Scalar {
        TODO("What happens when you multiply two strings together")
    }

    override fun div(scalar: Number): Scalar {
        return this.div(scalar.asStr())
    }

    override fun div(scalar: Str): Scalar {
        return Str(this.value.replace(Regex(scalar.toString()), ""))
    }

    override fun pow(scalar: Number): Scalar {
        return this.pow(scalar.asStr())
    }

    override fun pow(scalar: Str): Scalar {
        return Str(Regex(scalar.value).findAll(this.value).first().value)
    }
}
