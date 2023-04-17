import java.util.*
import kotlin.time.ExperimentalTime
import kotlin.time.TimeSource

class TreeMapSpeed {
}

@OptIn(ExperimentalTime::class)
fun main() {
    val arr = IntArray(10000001)

    for (i in 1..10000000) {
        arr[i] = i
    }

    arr.shuffle()

    val tree = TreeMap<Int, Int>()

//    put
    var mark = TimeSource.Monotonic.markNow()
    for (i in arr) {
        tree[i] = i
    }
    println("tree put: " + mark.elapsedNow())

    arr.shuffle()
//    get
    mark = TimeSource.Monotonic.markNow()
    var score = 0
    for (i in arr) {
        score += tree.getOrDefault(i, 0)
    }
    println("tree get: " + mark.elapsedNow())

    arr.shuffle()
//    entries
    mark = TimeSource.Monotonic.markNow()
    var score2 = 0
    for (t in tree.entries) {
        score2 += t.key
    }
    println("tree entries: " + mark.elapsedNow())

    arr.shuffle()
    //    containsKey
    mark = TimeSource.Monotonic.markNow()
    for (i in arr) {
        tree.containsKey(i)
    }
    println("tree containsKey: " + mark.elapsedNow())

//    arr.shuffle()
//    //    containsValue
//    mark = TimeSource.Monotonic.markNow()
//    for (i in arr) {
//        tree.containsValue(i)
//    }
//    println("tree containsValue: " + mark.elapsedNow())

    //    containsValue
    mark = TimeSource.Monotonic.markNow()
    tree.headMap(8,true).tailMap(3,true)
    println("tree range: " + mark.elapsedNow())
}