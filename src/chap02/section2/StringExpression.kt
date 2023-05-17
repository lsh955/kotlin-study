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

    val special = "\"hello\", I have \$15" // 이스케이프 문자인 \"을 사용해 큰따옴표를 문자열 안에 표현.
    println(special)

    /**
     * 중괄호를 사용해도 큰따옴표나 $를 표현할 수 있는가?
     */
    val special2 = "${'"'}${'$'}9.99${'"'}"
    println(special2) // "$9.99"
}