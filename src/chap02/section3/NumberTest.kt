package chap02.section3

/**
 * @author 이승환
 * @since 2023-05-17
 */
fun main() {
    /**
     * 스마트 캐스트.
     *
     * Number 형을 사용하면 숫자를 저장하기 위한 특수한 자료형 객체를 만든다.
     * 저장되는 값에 따라 정수형이나 실수형 등으로 자료형이 변환된다.
     */
    var test: Number = 12.2 // 12.2에 의해 test는 Float형으로 스마트 캐스트
    println("$test")

    test = 12 // int 형으로 스마트 캐스트
    println("$test")

    test = 120L // Long 형으로 스마트 캐스트
    println("$test")

    test += 12.0f // Float 형으로 스마트 캐스트
    println("$test")
}