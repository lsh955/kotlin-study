package chap03.section5

/**
 * @author 이승환
 * @since 2023-05-20
 */
fun main() {
    // 일반 표현법.
    // val multi = 3.multiply(3)


    // 중위 표현법
    val multi = 3 multiply 10 // 오!!...
    println("multi: $multi")
}

// Int를 확장해서 multiply() 함수를 하나 더 추가함.
infix fun Int.multiply(x: Int): Int { // infix 로 선언되는 중위함수.
    return this * x
}