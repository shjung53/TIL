package destructuring_declarations

fun main(){
    val (a, b) = abFun()
    println(a)
    print(b)
}

fun abFun(): Pair<Int,Int>{
    return Pair(3,5)
}