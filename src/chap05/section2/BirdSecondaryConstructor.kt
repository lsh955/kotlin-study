package chap05.section2.secondary

/**
 * @author 이승환
 * @since 2023-05-23
 */
class Bird {
    // (1) 프로퍼티 - 선언.
    var name: String
    var wing: Int
    var beak: String
    var color: String

    // (2) 부 생성자 - 매개변수를 통해 초기화할 프로퍼티에 지정.
    constructor(name: String, wing: Int, beak: String, color: String) {
        this.name = name // (3) this.name은 선언된 현재 클래스의 프로퍼티를 나타냄.
        this.wing = wing
        this.beak = beak // _beak(언더스코어)를 매개변수에 사용하고 프로퍼티에 this.를 생략할 수 있음.
        this.color = color
    }

    // 메서드
    fun fly() {
        println("Fly wing: $wing")
    }

    fun sing(vol: Int) {
        println("Sing vol: $vol")
    }
}

fun main() {
    val coco = Bird("myBird", 2, "short", "blue") // (4) 생성자의 인자로 객체 생성과 동시에 초기화됨.

    coco.color = "yellow"
    println("coco.color: ${coco.color}") // 값이 잘 넘어갔는지 확인해보기.
    coco.fly()
    coco.sing(3)
}