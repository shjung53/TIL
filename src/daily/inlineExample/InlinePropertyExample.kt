package inlineExample

class MyBasketball{
    private var ball = "wilson"
    var mvp = "Lebron James"
    val currentBall get() = ball
    inline val favoritePlayer get() = mvp
}

fun main(){
    val myBasketball = MyBasketball()
    val current = myBasketball.currentBall
    val favorite = myBasketball.favoritePlayer
}