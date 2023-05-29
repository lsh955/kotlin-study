package chap08.section2

/**
 * @author 이승환
 * @since 2023-05-29
 */
fun main() {
    val fruits = arrayOf("banana", "avocado", "apple", "kiwi")

    fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.toUpperCase() }
        .forEach { println(it) }
}