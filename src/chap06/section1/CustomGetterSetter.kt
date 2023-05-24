package chap06.section1.customgetset

/**
 * @author 이승환
 * @since 2023-05-24
 */
class User(_id: Int, _name: String, _age: Int) {
    val id: Int = _id
    var name: String = _name
        set(value) { // 외부에서 값을 재할당 못하게 제한하려면 private를 추가선언.
            println("The name was changed")
            field = value.toString() // 받은 인자를 대문자로 변경해 프로퍼티에 할당.
        }
    var age: Int = _age
}

fun main() {
    val user = User(1, "lsh", 35)
    user.name = "coco" // 사용자 고유의 출력코드 실행.
    println("")
}