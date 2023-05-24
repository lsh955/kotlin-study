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