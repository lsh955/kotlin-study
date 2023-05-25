package chap06.section2

/**
 * @author 이승환
 * @since 2023-05-25
 */
class Person {
    lateinit var name: String // 지연 초기화를 위한 선언.

    fun test() {
        if (!::name.isInitialized) { // 프로퍼티의 초기화 여부 판단.
            println("not initialized") // 할당 됨.
        } else {
            println("initialized") // 할당되지 않음.
        }
    }
}

fun main() {
    val user = Person()
    user.test()
    user.name = "lsh" // 이 시점에서 초기화됨(지연 초기화)
    user.test()

    println("name = ${user.name}")
}