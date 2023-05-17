package chap02.section3

/**
 * @author 이승환
 * @since 2023-05-17
 */
fun main() {

    val num = 256

    /**
     * 자료형 검사.
     *
     * is는 왼쪽 항의 변수가 오른쪽 항의 자료형과 같으면 true,
     * 아니면, false를 반환.
     */
    if(num is Int) { // num이 Int형일 때
        println(num)
    } else if (num !is Int) { // num이 Int형이 아닐 때, !(num is Int)와 동일
        println("Not a Int")
    }

    /**
     * Any형을 사용하면,
     * 자료형을 결정하지 않은 채로 변수를 선언할 수 있다.
     * 이때, is를 사용하여 자료형을 검사하면 검사한 자료형으로 스마트캐스트 된다.
     */
    val x: Any
    x = "Hello"
    if(x is String) {
        println(x.length) // x는 자동적으로 String 으로 스마트 캐스트
    }
}