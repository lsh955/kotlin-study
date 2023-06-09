package chap02.section3

/**
 * @author 이승환
 * @since 2023-05-17
 */
fun main() {
    checkArg("Hello") // 문자열을 인자로...
    checkArg(5) // 숫자를 인자로..
}

fun checkArg(x: Any) { // 인자를 Any 형으로 받음.
    if(x is String) {
        println("x is String: $x")
    }

    if(x is Int) {
        println("x is Int: $x")
    }
}