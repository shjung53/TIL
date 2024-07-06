package job

import kotlinx.coroutines.*


fun main() {
    val a = CoroutineScope(Dispatchers.IO).launch {
        println("this is Job a: $this")
        delay(3000)
    }


    runBlocking {
        a.cancel()
        delay(3000)
        println("Job a isCompleted: ${a.isCompleted}")
        println("Job a isActive: ${a.isActive}")
        println("Job a isCancelled: ${a.isCancelled}")
    }
}
