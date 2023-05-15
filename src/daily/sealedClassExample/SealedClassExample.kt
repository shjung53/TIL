package sealedClassExample

sealed class CafeMenu {
}

class Coffee : CafeMenu() {
    override fun equals(other: Any?): Boolean {
        return this === other
    }

    override fun hashCode(): Int {
        return System.identityHashCode(this)
    }
}

object Tea : CafeMenu() {
}
class Ade : CafeMenu() {
    override fun equals(other: Any?): Boolean {
        return this === other
    }

    override fun hashCode(): Int {
        return System.identityHashCode(this)
    }
}

fun checkMenu(cafeMenu: CafeMenu): String {
    return when(cafeMenu) {
        is Coffee -> "Coffee"
        is Tea -> "Tea"
        is Ade -> "Ade"
    }
}