package chap06.section2

import kotlin.properties.Delegates

/**
 * @author 이승환
 * @since 2023-05-25
 */
class User {
    var name: String by Delegates.observable("NONAME") { // 프로퍼티 위임.
        prop, old, new -> // 람다식 매개변수로 프로퍼티, 기존 값, 새로운 값 지정.
        println("$old -> $new") // 이 부분은 이벤트가 발생할 때문 실행.
    }
}

fun main() {
    val user = User()
    user.name = "lsh" // 값이 변경되는 시점에서 첫 이벤트가 발생.
    user.name = "Dooly" // 값이 변경되는 시점에서 두 번째 이벤트가 발생.
}