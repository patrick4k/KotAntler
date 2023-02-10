package scalar

class Bool(private var value: Boolean): SecondaryScalar(value) {

    override fun asNumber(): Number {
        return Number(if (this.value) 1.0 else 0.0)
    }

    override fun asStr(): Str {
        return Str(this.toString())
    }

    override fun asBool(): Bool {
        return this
    }

    override fun negate() {
        this.value = !this.value
    }

    override fun asBoolean(): Boolean {
        return this.value
    }

    override fun toString(): String {
        return value.toString()
    }

    override fun plusSecondary(scalar: SecondaryScalar): Scalar {
        when (scalar) {
            is Bool -> return Bool(this.value || scalar.asBoolean())
        }
        return super.plusSecondary(scalar)
    }

    override fun minSecondary(scalar: SecondaryScalar): Scalar {
        when (scalar) {
            is Bool -> return Bool(this.value || !scalar.asBoolean())
        }
        return super.plusSecondary(scalar)
    }

    override fun multSecondary(scalar: SecondaryScalar): Scalar {
        when (scalar) {
            is Bool -> return Bool(this.value && scalar.asBoolean())
        }
        return super.plusSecondary(scalar)
    }

}
