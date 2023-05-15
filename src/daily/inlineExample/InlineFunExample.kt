package inlineExample


fun add1(a: Int): Int {
    return a + 3
}

inline fun add2(a: Int): Int {
    return a + 3
}

fun main() {
    val a = 3
    print(add1(a))
    print(add2(a))
}