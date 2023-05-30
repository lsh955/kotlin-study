package chap09.section2

/**
 * @author 이승환
 * @since 2023-05-30
 */
fun main() {
    // Linked List를 이용한 HashSet.
    val intsLinkedHashSet: java.util.LinkedHashSet<Int> = linkedSetOf(35, 21, 76, 26, 75)
    intsLinkedHashSet.add(4)
    intsLinkedHashSet.remove(21)

    println("intsLinkedHashSet $intsLinkedHashSet")

    intsLinkedHashSet.clear()
    println(intsLinkedHashSet)
}