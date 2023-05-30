package chap09.section2

/**
 * @author 이승환
 * @since 2023-05-30
 */
fun main() {
    // 자바의 java.util.HashSet 선언.
    val intsHashSet: HashSet<Int> = hashSetOf(6, 3, 4, 7)

    intsHashSet.add(5)
    intsHashSet.remove(6)

    println(intsHashSet) // [3, 4, 5, 7]
}