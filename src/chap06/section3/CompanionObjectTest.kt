package chap06.section3

/**
 * @author 이승환
 * @since 2023-05-25
 */
class Person {
    var id: Int = 0
    var name: String = "lsh"

    companion object {
        var language: String = "Korean"
        fun work() {
            println("working...")
        }
    }
}

fun main() {
    println(Person.language) // 인스턴스를 생성하지 않고 기본값 사용.
    Person.language = "English" // 기본값 변경가능.
    println(Person.language) // 변경된 내용출력.
    Person.work() // 메서드 실행.

    // println(Person.name) name은 캠패니언 객체가 아니므로 오류남.
}