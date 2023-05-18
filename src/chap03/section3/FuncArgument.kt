package chap03.section3

/**
 * @author 이승환
 * @since 2023-05-18
 */
fun main() {
    val res1 = sum(3, 2) // 일반인자
    val res2 = mul(sum(3, 3), 3) // 인자에 함수를 사용
}

fun sum(a: Int, b: Int) = a + b
fun mul(a: Int, b: Int) = a * b