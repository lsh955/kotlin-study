package chap04.section2

/**
 * @author 이승환
 * @since 2023-05-22
 */
fun main() {
    print("Enter the lines: ")

    val n = readLine()!!.toInt() // 콘솔로부터 입력받고, toInt를 이용해 정숫값으로 변환한 다음 n에 할당.

    for (line in 1..n) {
        for (space in 1..(n - line))
            print(" ") // 공백출력.

        for (star in 1..(2 * line - 1))
            print("*") // 별표출력.

        println() // 개행.
    }
}