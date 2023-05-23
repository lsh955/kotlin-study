package chap05.section5

/**
 * @author 이승환
 * @since 2023-05-23
 */
internal class InternalClass {
    internal var i = 1

    internal fun icFunc() {
        i += 1 // 접근허용
    }

    fun access() {
        icFunc() // 접근허용
    }
}

class Other {
    internal val ic = InternalClass() // 프로퍼티를 지정할 때 internal 로 맞춰야 함.

    fun test() {
        ic.i // 접근허용.
        ic.icFunc() // 접근허용.
    }
}

fun main() {
    val mic = InternalClass() // 생성가능.
    mic.i // 접근허용.
    mic.icFunc() // 접근허용.
}