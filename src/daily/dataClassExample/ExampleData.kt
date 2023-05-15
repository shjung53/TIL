package dataClassExample

data class ExampleData(val a: String)

fun ex() {
    val exA = ExampleData("a")
    println(exA.a)
    println(exA.copy(a = "b").a)
}

fun main(){
    ex()
}
