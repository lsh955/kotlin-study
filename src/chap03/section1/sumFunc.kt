package chap03.section1

/**
 * @author 이승환
 * @since 2023-05-18
 */
fun sum(a: Int, b: Int): Int {
    var sum = a + b
    return sum
}

/**
 * 덧셈 함수를 한줄로 표현하는 방법.
 */
// fun sum(a: Int, b: Int): Int a + b
// fun sum(a: Int, b: Int) = a + b

fun main() {
    val result1 = sum(3, 2)
    val result2 = sum(6, 7)

    println(result1)
    println(result2)
}