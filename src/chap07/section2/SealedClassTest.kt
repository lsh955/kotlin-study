package chap07.section2

/**
 * @author 이승환
 * @since 2023-05-27
 */
sealed class Result { // 실드 클래스를 선언하는 첫 번째 방법.
    open class Success(val message: String): Result()
    class Error(val code: Int, val message: String): Result()
}

class Status: Result()
class Inside: Result.Success("Status")

fun main() {
    // Success에 대한 객체 생성
    val result = Result.Success("Good!")
    val msg = eval(result)
    println(msg)
}

// 상태를 검사하기 위한 함수
fun eval(result: Result): String = when(result) {
    is Status -> "in progress"
    is Result.Success -> result.message
    is Result.Error -> result.message
    // 모든 조건을 가지므로 else 가 필요 없다
}