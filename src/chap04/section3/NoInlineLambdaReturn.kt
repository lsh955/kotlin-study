package chap04.section3.noinline

/**
 * @author 이승환
 * @since 2023-05-22
 */
fun main() {
    retFunc()
}

fun inlineLambda(a: Int, b: Int, out: (Int, Int) -> Unit) { // inline이 제거됨
    out(a, b)
}

fun retFunc() {
    println("start of retFunc")

    inlineLambda(13, 3) lit@{ a, b -> // (1) 람다식 블록의 시작 부분에 라벨을 지정함.
        val result = a + b
        if(result > 10)
            return@lit // (2) 라벨을 사용한 블록의 끝부분으로 반환.

        println("result: $result")
    } // (3) 이 부분으로 빠져나감.

    println("end of retFunc") // (4) 이 부분이 실행됨.
}