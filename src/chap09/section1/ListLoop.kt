package chap09.section1

/**
 * @author 이승환
 * @since 2023-05-30
 */
fun main() {
    val fruits = listOf("apple", "banana", "kiwi")

    // 배열과 마찬가지로 List같은 컬렉션에서 요소를 순환하기 위해
    // for문을 사용할 수 있다.
    for (item in fruits) {
        println(item)
    }
}