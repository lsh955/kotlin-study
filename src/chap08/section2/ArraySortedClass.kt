package chap08.section2

/**
 * @author 이승환
 * @since 2023-05-29
 */
data class Product(val name: String, val price: Double)

fun main() {
    val products = arrayOf(
        Product("Snow Ball", 870.00),
        Product("Smart Phone", 999.00),
        Product("Drone", 240.00),
        Product("Mouse", 333.55),
        Product("Keyboard", 125.99),
        Product("Monitor", 1500.99),
        Product("Tablet", 512.99)
    )

    // Product를 it으로 넘기고,
    // 제품의 가격인 price가 제일 낮은 것을 기준으로 오름차순 정렬진행 하고,
    products.sortBy { it.price }
    // 그것을 다시 forEach를 통해 출력.
    products.forEach { println(it) }
}