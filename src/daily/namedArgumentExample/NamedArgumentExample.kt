package namedArgumentExample

fun namedArgumentEx(
    a: String,
    b: Int = 3,
    c: String = "스킵",
    d: Int = 4
){}

fun main(){
    namedArgumentEx("하이",c="안돼")
}