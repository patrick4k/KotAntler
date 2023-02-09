package scalar

abstract class SecondaryScalar(value: Any?): Scalar(value) {

    override fun plus(scalar: Number): Scalar {
        return asNumber().plus(scalar)
    }

    override fun plus(scalar: Str): Scalar {
        return asStr().plus(scalar)
    }

    override fun min(scalar: Number): Scalar {
        return asNumber().min(scalar)
    }

    override fun min(scalar: Str): Scalar {
        return asStr().min(scalar)
    }

    override fun mult(scalar: Number): Scalar {
        return asNumber().mult(scalar)
    }

    override fun mult(scalar: Str): Scalar {
        return asStr().mult(scalar)
    }

    override fun div(scalar: Number): Scalar {
        return asNumber().div(scalar)
    }

    override fun div(scalar: Str): Scalar {
        return asStr().div(scalar)
    }

    override fun pow(scalar: Number): Scalar {
        return asNumber().pow(scalar)
    }

    override fun pow(scalar: Str): Scalar {
        return asStr().pow(scalar)
    }

}
