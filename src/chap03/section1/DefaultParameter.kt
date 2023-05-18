package chap03.section1

/**
 * @author 이승환
 * @since 2023-05-18
 */
fun main() {
    val name = "이승환"
    val email = "lshk955@naver.com"

    add(name)
    add(name, email)
    add("강아지", "doggie@naver.com")

    defaultArgs() // 100 + 200
    defaultArgs(200) // 200 + 200
}

fun add(name: String, email: String = "default") {
    val output = "${name}님의 이메일은 ${email}입니다."
    println(output)
}

fun defaultArgs(x: Int = 100, y: Int = 200) {
    println(x + y)
}