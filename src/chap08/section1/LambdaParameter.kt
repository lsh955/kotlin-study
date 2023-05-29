package chap08.section1

/**
 * @author 이승환
 * @since 2023-05-29
 */
//fun <T> add(a: T, b: T): T {
//    return a + b // 자료형을 아직 결정할 수 없으므로 에러남.
//}

// 하지만, 람다식을 매개변수로 받으면 자료형을 결정하지 않아도 실행 시
// 람다식 본문을 넘겨줄 때 해결할 수 있다.
typealias arithmetic<T> = (T, T) -> T // 함수의 람다식 매개변수를 좀 더 일기 좋게 단순화 하기위해 arithmetic를 사용가능.
fun <T> add(a: T, b: T, op: arithmetic<T>): T {
    return op(a, b)
}

fun main() {
    // add() 함수가 실행될 때 넘겨지는 인자이므로
    // 연산식을 함수선언 부에 직접 구현하지 않고 전달하는 방법을 사용.
    val result = add(2, 3, {a, b -> a + b})
    // val result = add(2, 3) {a, b -> a + b}와 같이 표현가능.

    println(result)
}