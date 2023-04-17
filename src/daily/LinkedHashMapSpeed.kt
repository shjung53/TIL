import kotlin.collections.LinkedHashMap
import kotlin.time.ExperimentalTime
import kotlin.time.TimeSource

class LinkedHashMapSpeed {
}

@OptIn(ExperimentalTime::class)
fun main() {
    val arr = IntArray(100001)

    for (i in 1..100000) {
        arr[i] = i
    }

    arr.shuffle()

    val linkHash = LinkedHashMap<Int, Int>()

    //    put
    var mark = TimeSource.Monotonic.markNow()
    for (i in arr) {
        linkHash[i] = i
    }
    println("linkHash put: " + mark.elapsedNow())

    arr.shuffle()
//    get
    mark = TimeSource.Monotonic.markNow()
    var score = 0
    for (i in arr) {
        score += linkHash.getOrDefault(i, 0)
    }
    println("linkHash get: " + mark.elapsedNow())

    arr.shuffle()
//    entries
    mark = TimeSource.Monotonic.markNow()
    var score2 = 0
    for (t in linkHash.entries) {
        score2 += t.key
    }
    println("linkHash entries: " + mark.elapsedNow())

    arr.shuffle()
    //    containsKey
    mark = TimeSource.Monotonic.markNow()
    for (i in arr) {
        linkHash.containsKey(i)
    }
    println("linkHash containsKey: " + mark.elapsedNow())

    arr.shuffle()
    //    containsValue
    mark = TimeSource.Monotonic.markNow()
    for (i in arr) {
        linkHash.containsValue(i)
    }
    println("linkHash containsValue: " + mark.elapsedNow())
}
