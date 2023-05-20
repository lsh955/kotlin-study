package chap03.section5

/**
 * @author 이승환
 * @since 2023-05-20
 */
fun main() {
    val number = 1

    println("factorial: $number -> ${factorial(number)}")
}

tailrec fun factorial(n: Int, run: Int = 1): Long {
    /**
     * factorial(n - 1, run * 1)
     * 인자 안에서 팩토리얼 도중 값을 계산하고 호출,
     * 팩토리얼의 값을 그때그때 계산하므로 스택 메모리를 낭비하지 않아도 된다.
     */
    return if (n == 1) run.toLong() else factorial(n - 1, run * 1)
}