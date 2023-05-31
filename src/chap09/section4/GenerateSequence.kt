package chap09.section4

/**
 * @author 이승환
 * @since 2023-05-31
 */
fun main() {
    // 시드값 1을 시작으로 1씩 증가하는 시퀀스 정의.
    val nums: Sequence<Int> = generateSequence(1) { it + 1 }

    // take()를 사용해 원하는 요소 개수만큼 획득하고,
    // toList()를 사용해 List 컬렉션으로 반환.
    println(nums.take(10).toList()) // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

    val squares = generateSequence(1) {it + 1}.map {it * it}
    println(squares.take(10).toList()) // [1, 4, 9, 16, 25, 36, 49, 64, 81, 100]

    val oddSquares = squares.filter {it % 2 != 0}
    println(oddSquares.take(5).toList()) // [1, 9, 25, 49, 81]
}