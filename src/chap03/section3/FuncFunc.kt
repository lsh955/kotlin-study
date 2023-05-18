package chap03.section3.funcfunc

/**
 * @author 이승환
 * @since 2023-05-18
 */
fun main() {
    println("funcFunc: ${funcFunc()}")
}

fun sum(a: Int, b: Int) = a + b

fun funcFunc(): Int { // 함수의 반환값으로 함수 사용
    return sum(2, 2)
}