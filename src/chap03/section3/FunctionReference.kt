package chap03.section3

/**
 * @author 이승환
 * @since 2023-05-18
 */
fun main() {
    val res1 = funcParam(3, 2, ::sum) // :: 기호를 함수이름에 사용해, 소괄호 인자를 생략가능.
    println(res1) // 5

    hello(::text) // Hi! Hello World

    val likeLambda = ::sum
    println(likeLambda(6, 6))
}

fun sum(a: Int, b: Int) = a + b
fun text(a: String, b: String) = "Hi! $a $b"

fun funcParam(a: Int, b: Int, c: (Int, Int) -> Int): Int {
    return c(a, b)
}

fun hello(body: (String, String) -> String): Unit {
    println(body("Hello", "World"))
}