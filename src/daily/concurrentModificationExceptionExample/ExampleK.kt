package concurrentModificationExceptionExample

fun main(){
    val arr = ArrayList<Int>()

    for(i in 0 .. 10 ){
        arr.add(i)
    }

//    ConcurrentModificationException occur
    for(j in arr){
        if(j>3){
            arr.remove(j)
        }
    }
}