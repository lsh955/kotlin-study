package chap04.section3

/**
 * @author 이승환
 * @since 2023-05-22
 */
fun main() {
    for (i in 1..5) {
        if (i == 3)
            break // for문 자체 중단.

        print(i)
    }
    println() // 개행문자.
    println("outside")
}