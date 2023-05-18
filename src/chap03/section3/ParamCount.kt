package chap03.section3

/**
 * @author 이승환
 * @since 2023-05-18
 */
fun main() {
    // 매개변수 없는 람다식.
    noParam({ "Hello World!" })
    noParam{ "Hello World!" } // 위와 동일결과, 소괄호 생략가능.

    // 매개변수 1개 있는 람다식.
    oneParam ({ a -> "Hello Wordle! $a" })
    oneParam { "Hello World! $it" } // 위와 동일한 결과, it 으로 대체가능.
    oneParam { a -> "Hello World! $a" } // 위와 동일한 결과, 소괄호 생략가능.

    // 매개변수 2개 있는 람다식.
    moreParam { a, b -> "Hello World! $a $b" } // 매개변수 이름 생략 불가.
    moreParam { _, b -> "Hello World! $b" } // 첫 번째 문자열은 사용하지 않고 생략가능.

    // 일반 매개변수와 람다식 매개변수를 같이 사용하기.
    withArgs("Arg1", "Arg2", { a, b -> "Hello World! $a $b" }) // 인자와 함께 람다식을 사용하는 경우.
    withArgs("Arg1", "Arg2") { a, b -> "Hello World! $a $b" } // withArgs() 함수의 마지막 인자가 람다식인 경우 소괄호 바깥으로 분리가능.

}

// 매개변수가 없는 람다식이 noParam 함수의 out 으로 지정됨.
fun noParam(out: () -> String) = println(out())

// 매개변수가 1개 있는 람다식이 oneParam() 함수의 매개변수 out으로 지정됨.
fun oneParam(out: (String) -> String) {
    println(out("OneParam"))
}

// 매개변수가 2개 있는 람다식의 moreParam 함수의 매개변수로 지정됨.
fun moreParam(out: (String, String) -> String) {
    println(out("OneParam", "TwoParam"))
}

// withArgs() 함수는 일반 매개변수 2개를 포함, 람다식을 마지막 매개변수 형태를 가지고 있음.
fun withArgs(a: String, b: String, out: (String, String) -> String) {
    println(out(a, b))
}