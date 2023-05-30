package chap09.section2

/**
 * @author 이승환
 * @since 2023-05-30
 */
fun main() {
    // 불변형 Set 정의하기.
    val animals = mutableSetOf("Lion", "Dog", "Cat", "Python", "Hippo")
    println(animals) // [Lion, Dog, Cat, Python, Hippo]

    // 요소추가.
    animals.add("Dog")
    println(animals) // [Lion, Dog, Cat, Python, Hippo]

    // 요소삭제.
    animals.remove("Python")
    println(animals) // [Lion, Dog, Cat, Hippo]
}