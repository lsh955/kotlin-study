package chap06.section1

/**
 * @author 이승환
 * @since 2023-05-24
 */
class User(_id: Int, _name: String, _age: Int) { // 주 생성자에 3개의 매개변수 정의.
    // 프로퍼티
    val id: Int = _id // 불변(읽기전용)
    var name: String = _name // 변경가능.
    var age: Int = _age // 변경가능.
}

// 위 class 를 아래와 같이 한줄로 간소화 할 수 있다.
// class User(val id: Int, var name: String, var age: Int)

fun main() {
    val user = User(1, "Sean", 30)

    /**
     * 게터에 의한 값 획득.
     * 코틀린의 user.name -> 자바의 user.getName() 형태와 같다.
     */
    val name = user.name

    /**
     * 세터에 의한 값 지정.
     * 코틀린의 user.age = 41 -> 자바의 user.setAge(41) 형태와 같다.
     */
    user.age = 41

    // 읽기전용(val) 프로퍼티에는 세터로 값을 다시 지정할 수 없음.
    // user.id = 2

    println("name: $name, ${user.age}")
}
