import kotlin.time.ExperimentalTime
import kotlin.time.TimeSource

class LinkedHashSetSpeed {
}

@OptIn(ExperimentalTime::class)
fun main() {

    val linkHash = LinkedHashSet<Int>()

    val arr = IntArray(10000001)

    for(i in 1 .. 10000000) {
        arr[i] = i
    }

    arr.shuffle()

    var mark = TimeSource.Monotonic.markNow()
    for(i in 1 .. 10000000){
        linkHash.add(arr[i])
    }
    println("linkHash add: " + mark.elapsedNow())

    mark = TimeSource.Monotonic.markNow()
    for(i in 1 .. 10000000) {
        linkHash.contains(arr[i])
    }
    println("linkHash contains: " + mark.elapsedNow())

    mark = TimeSource.Monotonic.markNow()
    var score3: Int = 0
    for(l in linkHash){
        score3 += l
    }
    println("linkHash iterate: " + mark.elapsedNow())
}