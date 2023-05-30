package chap09.section2

/**
 * @author 이승환
 * @since 2023-05-30
 */
fun main() {
    // 가변형 Map
    val capitalCityMap: MutableMap<String, String> // 선언 시 키와 값의 자료형을 명시할 수 있음.
            = mutableMapOf("Korea" to "Seoul", "China" to "Beijing", "Japan" to "Tokyo")

    println(capitalCityMap.values) // [Seoul, Beijing, Tokyo]
    println(capitalCityMap.keys) // [Korea, China, Japan]

    capitalCityMap.put("UK", "London")
    capitalCityMap.remove("China")
    println(capitalCityMap) // {Korea=Seoul, Japan=Tokyo, UK=London}

    // putAll()을 사용한 맵의 추가
    val addData = mutableMapOf("USA" to "Washington")
    capitalCityMap.putAll(addData)
    println(capitalCityMap) // {Korea=Seoul, Japan=Tokyo, UK=London, USA=Washington}
}