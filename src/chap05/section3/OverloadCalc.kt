package chap05.section3

/**
 * @author 이승환
 * @since 2023-05-23
 */
fun main() {
    val calc = Calc()

    println(calc.add(3,2))
    println(calc.add(3.2, 1.3))
    println(calc.add(3, 3, 2))
    println(calc.add("Hello", "World"))
}

class Calc {
    // 다양한 매개변수로 오버로딩된 메서드
    fun add(x: Int, y: Int): Int = x + y
    fun add(x: Double, y: Double): Double = x + y
    fun add(x: Int, y: Int, z: Int): Int = x + y + z
    fun add(x: String, y: String): String = x + y

    // 오버로딩을 사용하면 같은 이름의 메서드로 다양한 인자를 처리 할 수 있으며,
    // 메서드를 손쉽게 확장 할 수 있다.
}