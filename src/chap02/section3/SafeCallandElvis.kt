package chap02.section3

/**
 * @author 이승환
 * @since 2023-05-17
 */
fun main() {
    var str1 : String? = "Hello Kotlin"
    str1 = null

    /**
     * 세이프콜과 엘비스 연산자를 활용해서 null을 하용한 변수를 더 안전하게 사용할 수 있는 방안.
     *
     * 엘비스 연산자는 변수가 null인지 아닌지 검사하여
     * null이 아니라면 왼쪽 식을 실행하고 null이라면 오른쪽 식을 실행한다.
     */
    println("str1: $str1 length: ${str1?.length ?: -1}") // 세이프콜(?.) 과 엘비스(?:) 연산자 사용.

    // 흠...
    // ${str1?.length ?: -1} 은 if (str1 != null) str1.length else -1 과 동일.

    // 세이프콜과 엘비스 연산자를 사용하면 null인 경우 반환값을 -1과 같은 특정 값으로 대체함으로써
    // null 발생을 대비할 수 있고 안전하다. 그리고, 한줄에 표현할 수 있어 가독성이 좋다.
}