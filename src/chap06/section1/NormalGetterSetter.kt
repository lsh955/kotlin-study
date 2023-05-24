package chap06.section1

/**
 * @author 이승환
 * @since 2023-05-24
 */
class User(_id: Int, _name: String, _age: Int) {
    // 프로퍼티
    val id: Int = _id
        get() = field

    var name: String = _name
        get() = field
        set(value) {
            field = value // field는 this.name으로 변환됨.
        }

    var age: Int = _age
        get() = field
        set(value) {
            field = value
        }

    // value: 세터의 매개변수로 외부로부터 값을 가져옴.
    // field: 프로퍼티를 참조화는 변수.
}

fun main() {
    val user = User(1, "lsh", 30)

    // val 프로퍼티는 값 변경불가.
    // user.id = 2

    user.age = 31 // 세터

    println("user.age = ${user.age}")
}