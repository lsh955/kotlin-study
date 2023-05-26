package chap07.section1

/**
 * @author 이승환
 * @since 2023-05-26
 */
abstract class Printer { // 추상 클래스
    abstract fun print() // 추상 메서드
}

val myPrinter = object : Printer() { // 객체 인스턴스

    override fun print() { // 추상 메서드 구현.
        // 코드 구현부.
        println("출력합니다.")
    }
}

fun main() {
    myPrinter.print()
}