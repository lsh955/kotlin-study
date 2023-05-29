package chap08.section1

/**
 * @author 이승환
 * @since 2023-05-29
 */
// Int, Double, Long형과 같이 숫자형으로 제한하기 위해 Number형으로 제한.
class Calc<T : Number> { // 클래스의 형식 매개변수 제한.

    fun plus(arg1: T, arg2: T): Double {
        return arg1.toDouble() + arg2.toDouble()
    }
}

fun main() {
    val cale = Calc<Int>()
    println(cale.plus(10, 20))

    val calc2 = Calc<Double>()
    val calc3 = Calc<Long>()

    // 제한된 자료형으로 인해 오류발생.
    // val calc4 = Calc<String>()

    println(calc2.plus(2.5, 3.5))
    println(calc3.plus(5L, 10L))
}