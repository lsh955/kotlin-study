package chap05.section3.openclass

/**
 * @author 이승환
 * @since 2023-05-23
 */
// (1) 상속 가능한 클래스를 선언하기 위해 open 사용.
open class Bird(var name: String, var wing: Int, var beak: String, var color: String) {
    // 메서드
    fun fly() {
        println("Fly wing: $wing")
    }
    fun sing(vol: Int) {
        println("Sing vol: $vol")
    }
}

// (2) 주 생성자를 상속하는 상속.
class Lark(name: String, wing: Int, beak: String, color: String) : Bird(name, wing, beak, color) {
    fun singHitone() {
        println("Happy Song!") // 새로 추가한 메서드
    }
}

// 부 생성자를 사용하는 상속.
class Parrot : Bird {
    val language: String

    constructor(
        name: String,
        wing: Int,
        beak: String,
        color: String,
        language: String
    ) : super(name, wing, beak, color) {
        this.language = language // 새로 추가한 프로퍼티.
    }

    fun speak() = println("Speak! $language")
}

fun main() {
    val coco = Bird("myBird", 2, "short", "blue")
    val lark = Lark("myLark", 2, "long", "brown")
    val parrot = Parrot("myParrot", 2, "short", "multiple", "korean") // 마지막 프로퍼티 추가.

    // 잘 넘어갔는지 찍어보기.
    println("Coco: ${coco.name}, ${coco.wing}, ${coco.beak}, ${coco.color}")
    println("Lark: ${lark.name}, ${lark.wing}, ${lark.beak}, ${lark.color}")
    println("Parrot: ${parrot.name}, ${parrot.wing}, ${parrot.beak}, ${parrot.color}, ${parrot.language}")

    // 새로 추가한 메서드 사용가능.
    lark.singHitone()
    parrot.speak()
    lark.fly()
}