package chap07.section2

/**
 * @author 이승환
 * @since 2023-05-27
 */
class Smartphone(val model: String) {
    private val cpu = "Exynos"

    inner class ExternalStorage(val size: Int) {
        fun getInfo(): String {
            return "${model}: Installed on $cpu with ${size}Gb" // 바깥 클래스의 프로퍼티 접근가능.
        }
    }
}

fun main() {
    val mySdcard = Smartphone("S7").ExternalStorage(32)
    println(mySdcard.getInfo())
}