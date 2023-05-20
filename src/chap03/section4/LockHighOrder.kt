package chap03.section4

import java.util.concurrent.locks.ReentrantLock

/**
 * @author 이승환
 * @since 2023-05-20
 */
var sharable = 1 // 보호가 필요한 공유자원.

fun main() {
    val reLock = ReentrantLock()

    // 1,2,3 표현식이 모두 동일함.
    lock(reLock, { criticalFunc() }) // 1
    lock(reLock) { criticalFunc() }  // 2
    lock(reLock, ::criticalFunc)     // 3
}

fun criticalFunc() {
    // 공유자원 접근코드 사용.
    sharable += 1
}

fun <T> lock(reLock: ReentrantLock, body: () -> T): T {
    reLock.lock()

    try {
        return body()
    } finally {
        reLock.unlock()
    }
}