package chap09.section2

import java.util.*

/**
 * @author 이승환
 * @since 2023-05-30
 */
fun main() {
    // java.util.HashMap의 사용.
    val hashMap: HashMap<Int, String> = hashMapOf(1 to "Hello", 2 to "World")
    println("hashMap = $hashMap") // hashMap = {1=Hello, 2=World}

    // java.util.SortedMap 사용.
    val sortedMap: SortedMap<Int, String> = sortedMapOf(1 to "Apple", 2 to "Banana")
    println("sortedMap = $sortedMap") // sortedMap = {1=Apple, 2=Banana}

    // java.util.LinkedHashMap의 사용.
    val linkedHash: LinkedHashMap<Int, String> = linkedMapOf(1 to "Computer", 2 to "Mouse")
    println("linkedHash = $linkedHash") // linkedHash = {1=Computer, 2=Mouse}
}