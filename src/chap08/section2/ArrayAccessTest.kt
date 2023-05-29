package chap08.section2

import java.util.*

/**
 * @author 이승환
 * @since 2023-05-29
 */
fun main() {
    val arr = intArrayOf(1, 2, 3, 4, 5)

    println("arr: ${Arrays.toString(arr)}") // Arrays.toString은 배열의 내용을 문자열로 변환.
    println("size: ${arr.size}") // size는 배열의 크기를 나타냄.
    println("sum(): ${arr.sum()}") // sum() 메서드는 배열의 합을 계산함.

    // 게터에 의한 접근과 대괄호 연산자 표기법.
    println(arr.get(2))
    println(arr[2])

    // 세터에 의한 값의 설정.
    arr.set(2, 7)
    arr[0] = 8
    println("power: ${arr.size} arr[0]: ${arr[0]}, arr[2]: ${arr[2]}")

    for (i in 0..arr.size - 1) {
        println("arr[$i] = ${arr[i]}")
    }
}