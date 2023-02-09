package scalar

class Bool(private var value: Boolean): SecondaryScalar(value) {

    override fun asNumber(): Number {
        return Number(if (this.value) 1.0 else 0.0)
    }

    override fun asStr(): Str {
        return Str(this.toString())
    }

    override fun toString(): String {
        return value.toString()
    }

}
