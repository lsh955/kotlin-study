package chap09.section3

/**
 * @author 이승환
 * @since 2023-05-31
 */
fun main() {
    val list1: List<String> = listOf("one", "two", "three")
    val list2: List<Int> = listOf(1, 3, 4)
    val map1 = mapOf("hi" to 1, "hello" to 2, "Goodbye" to 3)

    println(list1 + "four") // + 연산자를 사용한 문자열 요소추가.
    println(list2 + 1) // + 연산자를 사용한 정수형 요소추가.
    println(list2 + listOf(5, 6, 7)) // 두 List의 병합.
    println(list2 - 1) // 요소의 제거
}