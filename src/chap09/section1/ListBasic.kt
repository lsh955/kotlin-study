package chap09.section1

/**
 * @author 이승환
 * @since 2023-05-30
 */
fun main() {
    // 불변형 List 사용.
    var numbers: List<Int> = listOf(1, 2, 3, 4, 5)
    var names: List<String> = listOf("one", "two", "three")

    // 서로다른 자료형을 가진요소를 합쳐서 선언도 가능.
    // 이때, mixedTypes변수는 형식 매개변수가 <Any>를 가진다.
    var mixedTypes = listOf("Hello", 1, 2.445, 's')

    for (name in names) {
        println(name)
    }

    for (num in numbers) {
        println(num)
    }

    println() // 개행처리.
}