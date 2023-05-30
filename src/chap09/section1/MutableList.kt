package chap09.section1

/**
 * @author 이승환
 * @since 2023-05-30
 */
fun main() {
    // 가변형 List의 생성 및 추가, 삭제, 변경
    val mutableList: MutableList<String> = mutableListOf<String>("lsh", "Dooly", "Chelsu")

    mutableList.add("Ben") // 요소추가.
    mutableList.removeAt(1) // 요소삭제.
    mutableList[0] = "Sean" // 인덱스 0을 변경, set(index: Int, element: E)과 같은역할.

    println(mutableList) // [Sean, Chelsu, Ben]

    // 자료형의 혼합
    val mutableMixed = mutableListOf("Android", "Apple", 5, 6, 'X')

    println(mutableMixed) // [Android, Apple, 5, 6, X]
}