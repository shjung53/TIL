import kotlinx.coroutines.*

class ScopeFun {
}

suspend fun foo1(a: Int, b: Int): Int {
    delay(3000)
    return a + b;
}

fun foo2(c: Int, d: Int): Int {
    return c + d;
}

fun foo3(e: Int, f: Int): Int {
    return e + f;
}

suspend fun main() {
    println("start")
    CoroutineScope(Dispatchers.Default).launch {
        async {
            foo1(1, 2)
                .also {
                    println("첫번째 사이클 첫번재 결과 $it")
                    foo2(it, it)
                }
                .also {
                    println("첫번째 사이클 두번째 결과 $it")
                    foo3(it, it)
                }

            foo1(3, 5)
                .also {
                    println("두번째 사이클 첫번재 결과 $it")
                    foo2(it, it)
                        .also { anotherI ->
                            println("두번째 사이클 두번째 결과 $anotherI")
                            foo3(anotherI, anotherI)
                        }
                }
        }
    }.join()
}