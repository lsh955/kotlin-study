package chap02.section3

/**
 * @author 이승환
 * @since 2023-05-17
 */
fun main() {
    var a: Any = 1 // Any형 a는 1로 초기화될 때 Int형이 된다.
    a = 20L // Int 형이였던 a는 변경된 값 20L에 의해 Long형이 됨.

    println("a: $a type: ${a.javaClass}") // a의 자바 기본형을 출력하면 Long 나옴.
}