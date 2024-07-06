package job

import kotlinx.coroutines.*

fun main() {
    val a = CoroutineScope(Dispatchers.IO).launch {
        println("this is Job a: $this")
        launch { delay(3000) }
    }


    runBlocking {
        a.cancel()
        a.join()
        println("Job a isCompleted: ${a.isCompleted}")
        println("Job a isActive: ${a.isActive}")
        println("Job a isCancelled: ${a.isCancelled}")
    }
}
