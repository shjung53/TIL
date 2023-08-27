package inlineExample
fun fooInline(action: () -> Unit) {
    action()
    println("fooInline")
}

fun main() {
    fooInline { return@fooInline }
}

class A{
    val a = 3
}