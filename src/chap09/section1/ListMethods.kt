package chap09.section1

/**
 * @author 이승환
 * @since 2023-05-30
 */
fun main() {
    var names: List<String> = listOf("one", "two", "three")

    // List 크기
    println(names.size) // 3

    // 해당 인덱스의 요소 가져오기.
    println(names.get(0)) // "one"

    // 해당 요소의 인덱스 가져오기.
    println(names.indexOf("three")) // 2

    // 포함여부 확인 후 포함되어 있으면 true 반환.
    println(names.contains("two")) // true
}