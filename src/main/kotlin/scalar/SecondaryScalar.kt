package scalar

abstract class SecondaryScalar(value: Any?): Scalar(value) {
    
    override fun plus(scalar: Number): Scalar {
        return asNumber().plus(scalar)
    }

    override fun plus(scalar: Str): Scalar {
        return asStr().plus(scalar)
    }
    
    open fun plusSecondary(scalar: SecondaryScalar): Scalar {
        return Null();
    }

    override fun min(scalar: Number): Scalar {
        return asNumber().min(scalar)
    }

    override fun min(scalar: Str): Scalar {
        return asStr().min(scalar)
    }

    open fun minSecondary(scalar: SecondaryScalar): Scalar {
        return Null();
    }

    override fun mult(scalar: Number): Scalar {
        return asNumber().mult(scalar)
    }

    override fun mult(scalar: Str): Scalar {
        return asStr().mult(scalar)
    }

    open fun multSecondary(scalar: SecondaryScalar): Scalar {
        return Null();
    }

    override fun div(scalar: Number): Scalar {
        return asNumber().div(scalar)
    }

    override fun div(scalar: Str): Scalar {
        return asStr().div(scalar)
    }

    open fun divSecondary(scalar: SecondaryScalar): Scalar {
        return Null();
    }

    override fun pow(scalar: Number): Scalar {
        return asNumber().pow(scalar)
    }

    override fun pow(scalar: Str): Scalar {
        return asStr().pow(scalar)
    }

    open fun powSecondary(scalar: SecondaryScalar): Scalar {
        return Null();
    }

}
