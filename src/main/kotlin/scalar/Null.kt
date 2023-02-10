package scalar

class Null(): SecondaryScalar(value = null) {

    override fun asNumber(): Number {
        return Number(0.0)
    }

    override fun asStr(): Str {
        return Str(this.toString())
    }

    override fun asBool(): Bool {
        return Bool(false)
    }

    override fun negate() {
        // Do nothing
    }

    override fun toString(): String {
        return "null"
    }

}
