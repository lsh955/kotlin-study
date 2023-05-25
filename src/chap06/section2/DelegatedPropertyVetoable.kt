package chap06.section2

import kotlin.properties.Delegates

/**
 * @author 이승환
 * @since 2023-05-25
 */
fun main() {
    var max: Int by Delegates.vetoable(0) {
        prop, old, new ->
        new > old // 기존 값보다 새 값이 커야만 true가 되면서 프로퍼티의 교체 작업이 진행.
    }

    println(max)
    max = 10
    println(max)

    // 기존값이 새 값보다 크므로 false, 따라서 5를 재할당하지 않음.
    max = 5
    println(max)
}
