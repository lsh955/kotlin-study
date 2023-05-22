package chap04.section3

/**
 * @author 이승환
 * @since 2023-05-22
 */
fun main() {
    retFunc()
}

inline fun inlineLambda(a: Int, b: Int, out: (Int, Int) -> Unit) {
    out(a, b)
}

fun retFunc() {
    println("start of retFunc")

    /**
     * inlineLambda 함수는,
     * 람다식을 매개변수로 사용하는 인라인 함수.
     */
    inlineLambda(13, 3) { a, b ->
        val result = a + b

        if(result > 10) // a와 b 인자의 합이 10을 넘는 경우
            return // 함수에서 빠져나감.

        println("result: $result") // 10보다 크면 이 문장에서 도달하지 못함.
    }
    println("end of retFunc")
}