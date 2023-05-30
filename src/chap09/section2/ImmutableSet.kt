package chap09.section2

/**
 * @author 이승환
 * @since 2023-05-30
 */
fun main() {
    val mixedTypesSet = setOf("Hello", 5, "world", 3.14, 'c') // 자료형 혼합 초기화.
    var intSet: Set<Int> = setOf(1, 5, 5) // 정수만 초기화.

    println(mixedTypesSet) // [Hello, 5, world, 3.14, c]

    // intSet 변수에서는 중복요소를 허용하지 않으므로,
    // 중복된 요소인 5가 하나만 출력된다.
    println(intSet) // [1, 5]
}