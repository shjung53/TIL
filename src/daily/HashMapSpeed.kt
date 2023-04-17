import kotlin.time.ExperimentalTime
import kotlin.time.TimeSource

class HashMapSpeed {
}

@OptIn(ExperimentalTime::class)
fun main() {

    val arr = IntArray(10000001)

    for (i in 1..10000000) {
        arr[i] = i
    }

    arr.shuffle()

    val hash = HashMap<Int, Int>()

    //    put
    var mark = TimeSource.Monotonic.markNow()
    for (i in arr) {
        hash[i] = i
    }
    println("hash put: " + mark.elapsedNow())

    arr.shuffle()
//    get
    mark = TimeSource.Monotonic.markNow()
    var score = 0
    for (i in arr) {
        score += hash.getOrDefault(i, 0)
    }
    println("hash get: " + mark.elapsedNow())

    arr.shuffle()
//    entries
    mark = TimeSource.Monotonic.markNow()
    var score2 = 0
    for (t in hash.entries) {
        score2 += t.key
    }
    println("hash entries: " + mark.elapsedNow())

    arr.shuffle()
    //    containsKey
    mark = TimeSource.Monotonic.markNow()
    for (i in arr) {
        hash.containsKey(i)
    }
    println("hash containsKey: " + mark.elapsedNow())

//    arr.shuffle()
//    //    containsValue
//    mark = TimeSource.Monotonic.markNow()
//    for (i in arr) {
//        hash.containsValue(i)
//    }
//    println("hash containsValue: " + mark.elapsedNow())

    mark = TimeSource.Monotonic.markNow()
    println("hash range: " + mark.elapsedNow())
}
