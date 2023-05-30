package chap09.section1

/**
 * @author 이승환
 * @since 2023-05-30
 */
fun main() {
     // 기존의 불변형 List를 가변형으로 변경하려면 toMutableList()를 사용할 수 있다.

    val names: List<String> = listOf("one", "two", "three") // 불변형 List 초기화.

    val mutableNames = names.toMutableList() // 새로운 가변형 List가 만들어짐.
    mutableNames.add("four") // 가변형 List에 하나의 요소추가.

    println(mutableNames) // [one, two, three, four]
}