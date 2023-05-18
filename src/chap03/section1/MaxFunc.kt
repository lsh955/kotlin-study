package chap03.section1

/**
 * @author 이승환
 * @since 2023-05-18
 */
fun main() { // 최초의 스택 프레임
    val num1 = 10 // 임시변수 혹은 지역변수
    val num2 = 3 // 임시변수 혹은 지역변수
    val result: Int

    result = max(num1, num2) // 두 번째 스택 프레임

    println(result) // 10
}

fun max(a: Int, b: Int) = if (a > b) a else b // a와 b는 max() 함수의 임시변수.