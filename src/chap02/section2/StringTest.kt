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
    println("str1 === str3: ${str1 === str3}") // true
}