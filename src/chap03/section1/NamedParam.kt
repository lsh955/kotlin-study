package chap03.section1

/**
 * @author 이승환
 * @since 2023-05-18
 */
fun main() {
    namedParam(x = 200, z = 100) // x, z의 이름과 함께 함수호출(y는 기본값 사용)
    namedParam(z = 150) // z의 이름과 함께, 함수호출(x, z는 기본 값으로 지정됨)

    // 매개변수의 이름을 붙여 함수를 호출하다 보니,
    // 함수호출 부분만 읽어도 어떤 매개변수에 어떤 값을 전달했는지 알기 쉽다.
}

fun namedParam(x: Int = 100, y: Int = 200, z: Int) {
    println(x + y + z)
}