package chap06.section3

/**
 * @author 이승환
 * @since 2023-05-25
 */
class KCustomer {
    companion object {
        const val LEVEL = "INTERMEDIATE"
        @JvmStatic fun login() = println("Login...") // 어노테이션 표기 사용.
        @JvmStatic val score = 3
        @JvmField val JOB = KJob()
    }
}

class KJob {
    var title: String = "Programmer"
}