package chap04.section1

/**
 * @author 이승환
 * @since 2023-05-22
 */
fun main() {
    cases("Hello") // String 형.
    cases(1) // Int 형.
    cases(System.currentTimeMillis()) // 현재시간(밀리초 단위)을 Long형 값으로 반환.
    // cases(MyClass()) 객체도 넣을 수 있다는 가정.
}

fun cases(obj: Any) {
    when (obj) {
        1 -> println("Int: $obj")
        "Hello" -> println("String: $obj")
        is Long -> println("Long: $obj")
        !is String -> println("Not a String")
        else -> println("Unknown")
    }
}