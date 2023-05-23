package chap05.section5.internal

/**
 * @author 이승환
 * @since 2023-05-23
 */
fun main() {
    val otheric = InternalClass()

    // 같은 프로젝트의 모듈에만 있으면, 어디서든 접근이 가능.
    // 파일이 달라져도 동일한 모듈에 있다면 바로 접근이 가능하다.
    println(otheric.i)
    otheric.icFunc()
}