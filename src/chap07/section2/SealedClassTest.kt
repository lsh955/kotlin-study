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