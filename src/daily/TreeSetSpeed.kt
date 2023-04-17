import java.util.*
import kotlin.time.ExperimentalTime
import kotlin.time.TimeSource

class TreeSetSpeed {
}

@OptIn(ExperimentalTime::class)
fun main() {
    val tree = TreeSet<Int>()

    val arr = IntArray(10000001)

    for(i in 1 .. 10000000) {
        arr[i] = i
    }

    arr.shuffle()

    var mark = TimeSource.Monotonic.markNow()
    for(i in 1 .. 10000000){
        tree.add(arr[i])
    }
    println("tree add: " + mark.elapsedNow())


    mark = TimeSource.Monotonic.markNow()
    for(i in 1 .. 10000000) {
        tree.contains(arr[i])
    }
    println("tree contains: " + mark.elapsedNow())


    mark = TimeSource.Monotonic.markNow()
    var score: Int = 0
    for(t in tree){
        score += t
    }
    println("tree iterate: " + mark.elapsedNow())
}