package chap08.section1

/**
 * @author 이승환
 * @since 2023-05-29
 */
// 특정 타입을 지정하면 null이 허용되지 않음.
// class GenericNull<T: Any> {

class GenericNull<T> { // 기본적으로 null이 허용되는 형식 매개변수

    fun EqualityFunc(arg1: T, arg2: T) {
        println(arg1?.equals(arg2))
    }
}

fun main() {
    val obj = GenericNull<String>() // non-null로 선언.
    obj.EqualityFunc("Hello", "World") // null이 허용되지 않음.

    val obj2 = GenericNull<Int?>() // null가능한 형식으로 선언.
    obj2.EqualityFunc(null, 10) // null 사용가능.
}