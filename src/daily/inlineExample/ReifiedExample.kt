package inlineExample

inline fun <reified T> checkIsT(e: T): Boolean{
    println(T::class.java.toString())
    if(T::class.java == String::class.java) return true
    return false
}

fun main() {
    val a = "확인"
    println(checkIsT(a))
}