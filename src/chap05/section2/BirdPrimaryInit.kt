package chap05.section2.init

/**
 * @author 이승환
 * @since 2023-05-23
 */
class  Bird(var name: String, var wing: Int, var beak: String, var color: String) {
    // (1) 초기화 블록
    init {
        println("------ 초기화 블록 시작 ------")
        println("이름은 $name, 부리는 $beak")
        this.sing(3) // 메서드 호출.
        println("------ 초기화 블록 끝 ------")
    }

    // 메서드
    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}

fun main() {
    val coco = Bird("myBird", 2, "short", "blue") // (2) 객체 생성과 함께 초기화 블록수행.

    coco.color = "yellow"
    println("coco.color: ${coco.color}") // 걍 찍어보기.
    coco.fly()
}