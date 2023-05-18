package chap03.section3

/**
 * @author 이승환
 * @since 2023-05-18
 */
fun main() {
    var result: Int
    result = highOrder({x, y -> x + y}, 10, 20) // 람다식을 매개변수와 인자로 사용한 함수.

    println(result)
}

// 매개변수로 람다식을 사용한 고차함수.
fun highOrder(sum: (Int, Int) -> Int, a: Int, b: Int): Int {
    return sum(a, b) // 전달받은 a와 b를 인자처럼 받아서 람다식의 x와 y로 대체.
}