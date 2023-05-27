package chap07.section2

/**
 * @author 이승환
 * @since 2023-05-27
 */
class Outer {
    val ov = 5

    class Nested {
        val nv = 10

        fun greeting(): String {
            // 외부의 ov에는 접근불가.
            // println("[Nested] Hello ! $ov")

            return "[Nested] Hello ! $nv"
        }
    }

    fun outside() {
        val msg = Nested().greeting() // 객체생성 없이 중첩 클래스의 메서드 접근.
        println("[Outer]: $msg, ${Nested().nv}") // 중첩 클래스의 프로퍼티 접근.
    }
}

fun main() {
    // static처럼 객체생성 없이 사용가능.
    val output = Outer.Nested().greeting()
    println(output)

    // 외부 클래스의 경우에는 객체를 생성해야 하므로 에러발생.
    // Outer.outside()

    val outer = Outer()
    outer.outside()
}