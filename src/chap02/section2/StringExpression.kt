package chap02.section2

/**
 * @author 이승환
 * @since 2023-05-17
 */
fun main() {
    var a = 1
    val str1 = "a = $a" // String 자료형의 s1 을 선언하고 초기화, 변수 a가 사용됨.
    val str2 = "a = ${a + 2}" // 문자열에 표현식 사용.

    println("str1: \"$str1\", str2: \"$str2\"")
}