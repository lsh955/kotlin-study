package chap09.section2

import java.util.*

/**
 * @author 이승환
 * @since 2023-05-30
 */
fun main() {
    // 자바의 java.util.TreeSet 선언.
    val intsSortedSet: TreeSet<Int> = sortedSetOf(4, 1, 7, 2)

    intsSortedSet.add(6)
    intsSortedSet.remove(1)
    println("intsSortedSet = ${intsSortedSet}")

    intsSortedSet.clear()  // 모든요소 삭제.
    println("intsSortedSet = ${intsSortedSet}")
}