package scalar

class Reference(private val value: String): SecondaryScalar(value) {
    override fun toString(): String {
        return "Ref($value)"
    }

    override fun asNumber(): Number {
        TODO("Not yet implemented")
    }

    override fun asStr(): Str {
        TODO("Not yet implemented")
    }

    override fun asBool(): Bool {
        TODO("Not yet implemented")
    }

    override fun negate() {
        TODO("Not yet implemented")
    }

    override fun asBoolean(): Boolean {
        return super.asBoolean()
    }
}