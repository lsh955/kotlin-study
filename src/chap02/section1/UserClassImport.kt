package chap02.section1

import com.example.edu.Person as User

/**
 * @author 이승환
 * @since 2023-05-16
 */
fun main() {
    val user1 = User("이승환", 31)
    val user2 = Person("lsh955", "이승환")

    println(user1.name)
    println(user1.age)

    println(user2.id)
    println(user2.name)
}

class Person(val id: String, val name: String)