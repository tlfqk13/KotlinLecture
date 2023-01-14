package com.lannstark.lec02

import java.lang.IllegalArgumentException
import java.time.Period

fun main() {

    val str: String? = "ABC"
    //val str:String? = null
    //println(str.length)
    println(str?.length)
    println(str?.length ?: 0)
    println(startsWithA4("ABC"))

    val person = Person("손동규")
    startsWithAa(person.name)
}

fun startsWithAa(str: String): Boolean {
    return str.startsWith("A")
}

// null이 들어올 수 있음을 명시
fun startsWithA1(str: String?): Boolean {

    /*    if (str == null) {
            throw IllegalAccessException("null")
        }
        return str.startsWith("A")*/

    return str?.startsWith("A") ?: throw IllegalArgumentException("null")

}

fun startsWithA2(str: String?): Boolean? {
    /*
        if (str == null) {
            return null
        }
        return str.startsWith("A")
    */

    return str?.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
    /*
        if (str == null) {
            return false
        }
        return str.startsWith("A")
    */

    return str?.startsWith("A") ?: false
}

fun startsWithA4(str: String?): Boolean {
    // null 아님 단언 -> !!
    return str!!.startsWith("A")
}

// Safe Call - null이 아니면 실행하고 null이면 실행하지 않는다(그대로 null)
// Elvis 연산자 - 앞의 연산결과가 null이면 뒤의 값을 사용
// null 아님 단언 -> !!
// 플랫폼 타입 - 코틀린이 null 관련 정보를 알 수 없는 타입 - runtime Exception 가능성
