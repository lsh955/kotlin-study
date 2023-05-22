package chap04.section2

/**
 * @author 이승환
 * @since 2023-05-22
 */
fun main() {
    do {
        print("Enter an integer: ")
        val input = readLine()!!.toInt() // 콘솔로부터 숫자를 입력받으면,

        for (i in 0..(input - 1)) { // 해당 숫자를 순서대로 나열하고 하나씩 자리를 옮겨가면서 순환한다.
            for (j in 0..(input-1)) // 순환 자리를 표현하기 우히 for문을 중첩하고,
                print((i + j) % input + 1) // 나머지(%) 연산을 사용.

            println()
        }
    } while (input != 0) // 만일, 콘솔로부터 0을 입력받으면 false가 되면서 종료.
}