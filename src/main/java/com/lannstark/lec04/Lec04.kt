package com.lannstark.lec04

fun main() {
    val money1 = JavaMoney(2_000L)
    val money2 = JavaMoney(1_000L)


    if (money1 > money2) {
        println("M1 이 M2 보다 금액이 큽니다")
    }

    val m1 = JavaMoney(2_000L)
    val m2 = m1
    val m3 = JavaMoney(1_000L)

    println(m1 === m2) // 주소가 같은지
    println(m1 === m3) // 주소가 같은지
    println(m1 == m3) // 값만 비교

}

// 동등성 : 객체의 값이 같은가 ==
// 동일성 : 객체의 값 + 주소가 같은가 ===
// lazy 연산