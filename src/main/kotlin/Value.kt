class Scalar(val value: Any?) {
    fun asBoolean(): Boolean? {
        return value as Boolean?
    }

    fun asDouble(): Double? {
        return value as Double?
    }

    fun asString(): String {
        return value as String
    }

    val isDouble: Boolean
        get() = value is Double

    override fun hashCode(): Int {
        return if (value == null) {
            0
        } else value.hashCode()
    }

    override fun equals(o: Any?): Boolean {
        if (value === o) {
            return true
        }
        if (value == null || o == null || o.javaClass != this.javaClass) {
            return false
        }
        val that = o as Scalar
        return value == that.value
    }

    override fun toString(): String {
        return value.toString()
    }

    companion object {
        var VOID = Scalar(Any())
    }
}
