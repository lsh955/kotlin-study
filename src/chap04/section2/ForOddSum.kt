package chap04.section2

/**
 * @author 이승환
 * @since 2023-05-22
 */
fun main() {
    var total: Int = 0

    // 짝수와 홀수의 합은 시작 값을 1과 0으로 다르게 하고,
    for (num in 1..100 step 2) // step을 활용하여 2배 건너뛰면서 반복.
        total += num

    println("Odd total: $total")

    for (num in 0..99 step 2)
        total += num

    println("Even total: $total")
}