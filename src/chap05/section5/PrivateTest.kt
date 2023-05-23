package chap05.section5

/**
 * @author 이승환
 * @since 2023-05-23
 */
private class PrivateClass {
    private var i = 1
    private fun privateFunc() {
        i += 1 // 접근허용
    }

    fun access() {
        privateFunc() // 접근허용
    }
}

class OtherClass {
    // val opc = PrivateClass() // 불가 - 프로퍼티 opc는 private이 되어야 함.

    fun test() {
        val pc = PrivateClass() // 생성가능.
    }
}

fun main() {
    val pc = PrivateClass() // 생성가능.
    // pc.i 접근불가.
    // pc.privateFunc()
}

fun TopFunction() {
    val tpc = PrivateClass() // 객체 생성가능.
}