package chap07.section1

/**
 * @author 이승환
 * @since 2023-05-26
 */
open class Animal(val name: String)

// feeding의 구현을 위해 인터페이스 Pet 지정.
class Dog(name: String, override var category: String) : Animal(name), Pet {

    override var species: String = "dog"

    override fun feeding() {
        println("Feed the dog a bone")
    }
}

class Master {
    // 인터페이스를 객체로 매개변수를 지정.
    fun playWithPet(pet: Pet) {
        println("Enjoy with my ${pet.species}.")
    }

}

fun main() {
    val master = Master()
    val dog = Dog("Toto", "Small")
    val cat = Cat("Coco", "BigFat")

    master.playWithPet(dog)
    master.playWithPet(cat)
}