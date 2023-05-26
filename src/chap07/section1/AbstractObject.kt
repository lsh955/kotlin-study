package chap07.section1

/**
 * @author 이승환
 * @since 2023-05-26
 */
abstract class Printer { // 추상 클래스
    abstract fun print() // 추상 메서드
}

/**
 * object
 * 추상 클래스로부터 하위 클래스를 생성하지 않고,
 * 단일 인스턴스로 객체를 생성하려면,
 * object를 사용해서 지정할 수 있다.
 */
val myPrinter = object : Printer() { // 객체 인스턴스

    override fun print() { // 추상 메서드 구현.
        // 코드 구현부.
        println("출력합니다.")
    }
}

fun main() {
    myPrinter.print()
}