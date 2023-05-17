package chap02.section3

/**
 * @author 이승환
 * @since 2023-05-17
 */
fun main() {
    var str1: String = "Hello Kotlin"
    // str1 = null 코틀린은 null을 허용하지 않음.
    println("str1: $str1")

    // String 과 String? 서로다른 자료형임.

    var str2: String? = "이승환"
    str2 = null // null을 허용하려면 자료형에 ? 기호를 명시해야 한다.
    println("str2: $str2")

    // println("str2 length: ${str2.length}") 기본적으로 null을 허용하면 length가 실행될 수 없음.

    /**
     * '세이프 콜' 기법
     * null이 할당되어 있을 가능성이 있는 변수를 검사하여 안전하게 호출하는 '세이프 콜' 기법
     * 호출할 변수 뒤어 ?.를 작성하면 된다.
     */
    println("str2 length: ${str2?.length}") // 세이프 콜 기법 적용.

    /**
     * non-null 단정기호 기법
     * 변수에 할당된 값이 null이 아님을 단정하므로 컴파일러가 null 검사없이 무시한다.
     * 하지만 실행도중에 NPE 가 발생한다.
     */
    // println("str2 length: ${str2!!.length}") NPE 강제발생.
}