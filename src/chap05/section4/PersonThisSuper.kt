package chap05.section4.personthis

/**
 * @author 이승환
 * @since 2023-05-23
 */
open class Person {
    constructor(firstName: String) {
        println("[Person] firstName: $firstName")
    }

    constructor(firstName: String, age: Int) { // 3
        println("[Person] firstName: $firstName, $age")
    }
}

class Developer: Person {
    constructor(firstName: String) : this(firstName, 10) { // 1
        println("[Developer] $firstName")
    }

    constructor(firstName: String, age: Int): super(firstName, age) { // 2
        println("[Developer] $firstName, $age")
    }
}

fun main() {
    val sean = Developer("Sean") // 시작.
}