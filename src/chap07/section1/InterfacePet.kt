package chap07.section1

/**
 * @author 이승환
 * @since 2023-05-26
 */
interface Pet {
    var category: String // abstract 키워드가 없어도 기본은 추상 프로퍼티.

    // 인터페이스에서는 프로퍼티에 값을 저장할 수 없지만,
    val msgTags: String // val 선언 시 게터 구현이 가능함.
        get() = "I'm your lovely pet!"

    var species: String // 종을 위한 프로퍼티

    fun feeding() // 마찬가지로 추상 메서드
    fun petting() { // 일반 메서드: 구현부를 포함하면 일반적인 메서드로 기본이 된다.
        // 코드 구현부.
        println("Keep patting!")
    }
}

class Cat(name: String, override var category: String) : Pet, Animal(name) { // 콜론(:) 사용하여 인터페이스 구현.

    override var species: String = "cat" // 프로퍼티를 오버라이딩해 종을 특정한다.

    override fun feeding() {
        println("Feed the cat a tuna can!")
    }
}

fun main() {
    val obj = Cat("Bill", "small")

    println("Pet Category: ${obj.category}")
    println("Pet Message Tags: ${obj.msgTags}")

    obj.feeding() // 구현된 메서드
    obj.petting() // 기본 메서드
}