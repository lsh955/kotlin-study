package chap09.section1

/**
 * @author 이승환
 * @since 2023-05-30
 */
fun main() {
    // 불변형 List 사용.
    var numbers: List<Int> = listOf(1, 2, 3, 4, 5)
    var names: List<String> = listOf("one", "two", "three")

    for (name in names) {
        println(name)
    }

    for (num in numbers) {
        println(num)
    }

    println() // 개행처리.
}