package chap07.section1

/**
 * @author 이승환
 * @since 2023-05-26
 */
interface Pet {
    var category: String // abstract 키워드가 없어도 기본은 추상 프로퍼티.

    fun feeding() // 마찬가지로 추상 메서드
    fun petting() { // 일반 메서드: 구현부를 포함하면 일반적인 메서드로 기본이 된다.
        // 코드 구현부.
        println("Keep patting!")
    }
}

class Cat(override var category: String) : Pet { // 콜론(:) 사용하여 인터페이스 구현.

    override fun feeding() {
        println("Feed the cat a tuna can!")
    }
}

fun main() {
    val obj = Cat("small")

    println("Pet Category: ${obj.category}")

    obj.feeding() // 구현된 메서드
    obj.petting() // 기본 메서드
}