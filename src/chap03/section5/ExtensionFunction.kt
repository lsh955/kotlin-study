package chap03.section5

/**
 * @author 이승환
 * @since 2023-05-20
 */
fun main() {
    val source = "Hello World"
    val target = "Kotlin"

    println(source.getLongString(target))
}

// String 클래스를 확장해 getLongString() 함수추가.
fun String.getLongString(target: String): String =
    if (this.length > target.length) this else target