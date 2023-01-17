package com.lannstark.lec16

import java.lang.IllegalArgumentException
import java.time.Period

fun main() {
    val str = "ABC"
    println(str.lastChar())

    val person = Person("A","B",100)

    3.add(4)
    3.add2(4)
    3 add2 4

}

// String -> String 클래스를 확장하는구나 
// this 를 이용해 실제 클래스의 값에 접근
// 확장함수는 클래스에 있는 private, protected 멤버를 가져올 수 없다

fun String.lastChar(): Char {
    return this[this.length - 1]
}

// 확장함수와 멤버함수가 시그니쳐가 같으면 멤버함수가 먼저 호출
fun Person.nextYearAge() :Int{
    println("확장 함수")
    return this.age + 1
}

// 확장함수가 오버라이드 되면?
// 해당 변수의 현재 타입 - 정적인 타입에 의해 어떤 확장함수가 호출될지 결정된다

// 중위함수 , 함수를 호출하는 새로운 방법
// 변수.함수이름 (argument) 대신 => 변수 함수이름 argument
fun Int.add(other :Int):Int{
    return this + other
}

inline fun Int.add1(other :Int):Int{
    return this + other
}

infix fun Int.add2(other: Int): Int{
    return this + other
}

//인라인 함수 - 함수를 호출한 지점에 함수 본문을 그대로

// 지역함수 - 함수 안에 함수 선언
fun createPerson(firstName: String, lastName: String):Person{
    fun validateName(name:String, fieldName:String){
        if (name.isEmpty()){
            throw IllegalArgumentException("${fieldName}은 비어있을 수 없습니다 ! 현재 값 : $name")
        }
    }
    validateName(firstName,"firstName")
    validateName(lastName,"lastName")

    return Person(firstName, lastName, 1)
}





