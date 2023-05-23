package chap05.section1.define

/**
 * @author 이승환
 * @since 2023-05-23
 */
class Bird { // 클래스의 정의.
    // 프로퍼티(속성)
    var name: String = "mybird"
    var wing: Int = 2
    var beak: String = "short"
    var color: String = "blue"

    // 메서드(함수)
    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}

fun main() {
    val coco = Bird() // 클래스의 생성자를 통한 객체의 생성.
    coco.color = "blue" // 객체의 프로퍼티에 값 할당.

    println("coco.color: ${coco.color}") // 객체의 멤버 프로터티 확인 해 보기.

    coco.fly() // 객체의 멤버 메서드 사용.
    coco.sing(3)
}