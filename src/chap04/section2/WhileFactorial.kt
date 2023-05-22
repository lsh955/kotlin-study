package chap04.section2

/**
 * @author 이승환
 * @since 2023-05-22
 */
fun main() {
    print("Enter the number: ")

    var number = readLine()!!.toInt() // 5를 입력하면,
    var factorial: Long = 1

    while (number > 0) { // 5 * 4 * 3 * 2 * 1 형태로 반복하면서,
        factorial *= number // 곲한값을, factorial 변수에 저장,
        --number // number가 0이 되면서 조건식이 false가 되면서
    } // while문을 벗어나게 된다.

    println("Factorial: $factorial")
}