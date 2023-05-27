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

    fun powerOn(): String {
        class Led(val color: String) {  // 이 클래스는 지역 클래스로 사용.
            fun blink(): String = "Blinking $color on $model" // 외부의 프로퍼티는 접근가능.
        }

        val powerStatus = Led("Red") // 지역클래스 사용.

        return powerStatus.blink()
    }
}

fun main() {
    val mySdcard = Smartphone("S7").ExternalStorage(32)
    println(mySdcard.getInfo())

    val myPhone = Smartphone("Note9")
    myPhone.ExternalStorage(128)
    println(myPhone.powerOn())
}