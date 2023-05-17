package chap02.section2

/**
 * @author 이승환
 * @since 2023-05-17
 */
fun main() {
    var str1: String = "Hello"
    var str2 = "World"
    var str3 = "Hello"

    println("str1 === str2: ${str1 === str2}") // false

    /**
     * 코틀린은 String Pool 이라는 공간에 문자열인 "Hello"를 저장해 두고,
     * str1, str3 을 참조하도록 만든다.
     */
    println("str1 === str3: ${str1 === str3}") // true
}