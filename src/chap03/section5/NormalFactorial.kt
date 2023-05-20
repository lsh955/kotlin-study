package chap03.section5

/**
 * @author 이승환
 * @since 2023-05-20
 */
fun main() {
    val number = 4
    val result: Long

    // 함수의 문맥을 유지하기 위해 factorial() 함수 스택메모리의 4배만큼 스택 메모리를 사용.
    // number 변수값을 아주 큰 값으로 설정되면 실행 환경에 따라 스택메모리가 부족해지면서 프로그램 중지등의 에러.
    result = factorial(number)
    println("factorial: $number -> $result")
}

fun factorial(n: Int): Long {
    return if (n == 1) n.toLong() else n * factorial(n-1)
}