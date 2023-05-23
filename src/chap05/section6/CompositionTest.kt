package chap05.section6

/**
 * @author 이승환
 * @since 2023-05-23
 *
 * 구성관계
 * - 집합관계와 거의 동일하지만, 특정 클래스가 어느 한 클래스의 부분이 되는 것.
 */
class Car(val name: String, val power: String) {
    private var engine = Engine(power) // Engine클래스 객체는 Car에 의존적이다

    fun startEngine() = engine.start()
    fun stopEngine() = engine.stop()
}

class Engine(power: String) {
    fun start() = println("Engine has been started.")
    fun stop() = println("Engine has been stopped.")
}

fun main() {
    val car = Car("tico", "100hp")
    car.startEngine()
    car.stopEngine()
}