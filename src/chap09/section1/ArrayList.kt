package chap09.section1

/**
 * @author 이승환
 * @since 2023-05-30
 */
fun main() {
    // 가변형 List를 생성하고, 자바의 ArrayList로 반환.
    val stringList: ArrayList<String> = arrayListOf<String>("Hello", "Kotlin", "Wow")

    stringList.add("Java") // 요소추가.
    stringList.remove("Hello") // 요소삭제.

    println(stringList) // [Kotlin, Wow, Java]
}