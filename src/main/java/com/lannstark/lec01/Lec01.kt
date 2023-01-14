package com.lannstark.lec01

fun main() {
    // 가변 : var
    var number1 = 10L
    var number3: Long = 10L
    // 불변
    val number2 = 10L

    // 초기값을 지정해주지 않는 경우
    var n1: Long // 타입을 명시 해주면된다
    n1 = 5L
    println(n1)

    val n2: Long = 10L
    // 모든 변수는 우선 val로 만들고 꼭 필요한 경우 var 로 변경한다

    // 숫자, 문자, 불리언 ) 원시타입과 참조타입 구분 코틀린이 알아서 상황에 맞게 처리해준다
    var n3 = 1000L

    // null이 들어갈 수 있는
    var nn3: Long? = 1_000L
    nn3 = null

    // 객체 인스턴스화 할때 new 를 쓰지말아야한다.
    var person = Person("손동규")

}


