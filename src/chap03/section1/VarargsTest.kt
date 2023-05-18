package chap03.section1

/**
 * @author 이승환
 * @since 2023-05-18
 */
fun main() {
    normalVarargs(1, 2, 3, 4) // 4개의 인자구성.
    normalVarargs(4, 5, 6) // 3개의 인자구성.

    // 오호.. 신기방기..
}

fun normalVarargs(vararg counts: Int) {
    for(num in counts) {
        print("$num ")
    }
    print("\n")
}