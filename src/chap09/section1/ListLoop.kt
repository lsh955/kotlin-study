package chap09.section1

/**
 * @author 이승환
 * @since 2023-05-30
 */
fun main() {
    val fruits = listOf("apple", "banana", "kiwi")

    // 배열과 마찬가지로 List같은 컬렉션에서 요소를 순환하기 위해
    // for문을 사용할 수 있다.
    for (item in fruits) {
        println(item)
    }

    // 요소의 인덱스를 통해 List에 접근하려면,
    // 컬렉션에 .indices 를 추가.
    for (index in fruits.indices) { // 인덱스 지정.
        println("fruits[$index] = ${fruits[index]}")
    }

    // 나머지(%) 연산 활용.
    for (index in fruits.indices) { // 인덱스 지정.
        if (index % 2 == 0) { // 짝수만 고르기.
            // 인덱스 0번과 짝수 요소만 골라내어 출력.
            println("fruits[$index] = ${fruits[index]}")
        }
    }
}