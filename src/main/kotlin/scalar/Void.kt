package scalar

class Void : SecondaryScalar(null) {
    override fun toString(): String {
        return "VOID"
    }

    override fun asNumber(): Number {
        return Number(0.0)
    }

    override fun asStr(): Str {
        return Str("")
    }

    override fun asBool(): Bool {
        return Bool(false)
    }

    override fun negate() { }
}
