package chap02.section1

import com.example.edu.Person as User

/**
 * @author 이승환
 * @since 2023-05-16
 */
fun main() {
    val user1 = User("이승환", 31) // import com.example.edu.Person 이 User 로 대체.
    val user2 = Person("lsh955", "이승환") // 이 파일 안에 있는 Person 클래스의 객체 생성.

    println(user1.name)
    println(user1.age)

    println(user2.id)
    println(user2.name)
}

class Person(val id: String, val name: String)