package chap04.section1

/**
 * @author 이승환
 * @since 2023-05-22
 */
fun main() {
    print("Enter the score: ")
    val score = readLine()!!.toDouble() // 콘솔로부터 문자열을 입력받는 함수.
    var grade: Char = 'F'

    if(score >= 90.0) {
        grade = 'A'
    } else if (score >= 80.0 && score <= 89.9) {
        grade = 'B'
    } else if (score >= 70.0 && score <= 79.9) {
        grade = 'C'
    }

    // in 연산자와 범위 연산자로 조선식을 리펙토링 할 수 있다.
    // else if (score in 80.0..89.9) {

    println("Score: $score, Grade: $grade")
}