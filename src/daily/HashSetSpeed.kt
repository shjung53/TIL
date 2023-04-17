import java.util.HashSet
import kotlin.time.ExperimentalTime
import kotlin.time.TimeSource

class HashSetSpeed {
}

@OptIn(ExperimentalTime::class)
fun main() {
    val hash = HashSet<Int>()

    val arr = IntArray(10000001)

    for(i in 1 .. 10000000) {
        arr[i] = i
    }

    arr.shuffle()


    var mark = TimeSource.Monotonic.markNow()
    for(i in 1 .. 10000000){
        hash.add(arr[i])
    }
    println("hash add: " + mark.elapsedNow())

    mark = TimeSource.Monotonic.markNow()
    for(i in 1 .. 10000000) {
        hash.contains(arr[i])
    }
    println("hash contains: " + mark.elapsedNow())

    mark = TimeSource.Monotonic.markNow()
    var score2: Int = 0
    for(h in hash){
        score2 += h
    }
    println("hash iterate: " + mark.elapsedNow())
}