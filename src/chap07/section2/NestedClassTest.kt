package chap07.section2

/**
 * @author 이승환
 * @since 2023-05-27
 */
class Outer {
    val ov = 5

    class Nested { // 바깥 class인 Outer의 멤버에 접근할 수 없음.
        val nv = 10

        fun greeting(): String {
            // 외부의 ov에는 접근불가.
            // println("[Nested] Hello ! $ov")

            return "[Nested] Hello ! $nv"
        }

        fun accessOuter() { // 외부 컴페니언 객체는 접근할 수 있음.
            println(country)
            getSomething()
        }
    }

    fun outside() {
        val msg = Nested().greeting() // 객체생성 없이 중첩 클래스의 메서드 접근.
        println("[Outer]: $msg, ${Nested().nv}") // 중첩 클래스의 프로퍼티 접근.
    }

    companion object { // 컴페니언 객체는 static처럼 접근가능.
        const val country = "Korea"
        fun getSomething() = println("Get something...")
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