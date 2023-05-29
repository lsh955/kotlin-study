package chap08.section2.sortwith

/**
 * @author 이승환
 * @since 2023-05-29
 */
data class Product(val name: String, val price: Double)

fun main(args : Array<String>) {
    val products = arrayOf(
        Product("Snow Ball", 870.00),
        Product("Smart Phone A", 999.00),
        Product("Drone", 240.00),
        Product("Mouse", 633.55),
        Product("Keyboard", 125.99),
        Product("Smart Phone B", 1500.99),
        Product("Mouse", 512.99))

    // 두 객체의 비교
    products.sortWith(
        Comparator<Product> { p1, p2 -> // Comparator를 이욜해 두 객체를 비교하여
            when {
                p1.price > p2.price -> 1 // p1이 크면 1,
                p1.price == p2.price -> 0 // 같으면 0
                else -> -1 // 나머지 -1
            }
        }
    )
    products.forEach { println(it) }
    println()
}