package chap06.section1.customproperty

/**
 * @author 이승환
 * @since 2023-05-24
 */
class User(_id: Int, _name: String, _age: Int) {
    val id: Int = _id

    // tempName은 이름이 null이 되는 경우를 처리하기 위해 임시적으로 사용하는 프로퍼티.
    // 보조필드인 field를 사용하지 않고, 추가로 내부의 프로퍼티를 임시로 선언하여 사용가능.
    private var tempName: String? = null

    var name: String = _name
        get() {
            if (tempName == null) {
                tempName = "NONAME"
            }
            return tempName ?: throw AssertionError("Asserted by others")
        }
    var age: Int = _age
}

fun main() {
    val user = User(1, "lsh", 31)
    user.name = ""

    println("user.name = ${user.name}")
}