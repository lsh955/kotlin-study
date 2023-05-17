package chap02.section3

/**
 * @author 이승환
 * @since 2023-05-17
 */
fun main() {
    var str1: String = "Hello Kotlin"
    // str1 = null 코틀린은 null을 허용하지 않음.
    println("str1: $str1")

    var str2: String? = "이승환"
    str2 = null // null을 허용하려면 자료형에 ? 기호를 명시해야 한다.
    println("str2: $str2")
}