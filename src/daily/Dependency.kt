/*
* 커피 종류는 추가될 수 있음
* 카페는 모든 커피 종류를 제공하지 않아도 됨
* 사람은 커피를 주문하고 마신다
* 커피를 만드는데 필요한 건 재료와 레시피 뿐*/
interface MenuOrder {
    fun orderAmericano(): Coffee.Americano
    fun orderCafeLatte(): Coffee.CafeLatte
}

class Cafe : MenuOrder {
    override fun orderAmericano(): Coffee.Americano {
        return Coffee.Americano()
    }

    override fun orderCafeLatte(): Coffee.CafeLatte {
        TODO("Not yet implemented")
    }
}

sealed class Coffee {
    //    커피마다 레시피랑 재료가 다름
    abstract val recipe: String
    abstract val ingredients: String

    data class Americano(override val recipe: String, override val ingredients: String) : Coffee()
    data class CafeLatte(override val recipe: String, override val ingredients: String) : Coffee()
    data class VanillaLatte(override val recipe: String, override val ingredients: String) : Coffee()
}

class Human {
    fun drink(coffee: Coffee) {}
}

fun main() {
    val me = Human()
    val starCafe = Cafe()

    val americano = starCafe.orderAmericano()

    me.drink(americano)
}
