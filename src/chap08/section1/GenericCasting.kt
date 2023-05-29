package chap08.section1

/**
 * @author 이승환
 * @since 2023-05-29
 */
open class Parent

class Child: Parent()
class Cup<T>

fun main() {
    val obj1: Parent = Child() // Parent 형식의 obj1은 Child로 형 변환될 수 있음.

    // 하위 형식인 Child의 객체 obj2는 Parent로 변환되지 않아 형식 불일치되어 에러남.
    // val obj2: Child = Parent()

    // 형식이 일치하지 않아 에러남.
    // val obj3: Cup<Parent> = Cup<Child>()

    // 형식이 일치하지 않아 에러남.
    // val obj4: Cup<Child> = Cup<Parent>()

    val obj5 = Cup<Child>()    // obj5는 Cup<Child> 형식이 됨.
    val obj6: Cup<Child> = obj5 // 형식일치.
}