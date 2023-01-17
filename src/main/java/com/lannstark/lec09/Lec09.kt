package com.lannstark.lec09

// 클래스와 프로퍼티
// 프로퍼티 = 필드 + getter + setter
// constructor 지시어 생략가능
/*
class Person(name: String, age: Int) {

    val name: String = name
    var age: Int = age

}*/
//class Person(val name: String, var age: Int) {
class Person(name: String, var age: Int) {
    /*val name = name
        get() = field.uppercase()
    */    //get() = name.uppercase() - 자기자신을 가리키는 예약어 field를 써야한다 == backing filed

    var name = name
        set(value) {
            field = value.uppercase()
        }

    //default paramete 를 쓰는걸 권장
    init {
        // 클래스가 초기화되는 시점에 호출되는 블록
        if (age <= 0) {
            throw IllegalArgumentException("나이는 $age 일 수 없습니다")
        }
    }

    // 추가 생성자(부생성자)
    constructor(name: String) : this(name, 1) // 여기서 this가 Java처럼 또 다른 생성자를 가르키고있음

    fun isAdultFun(): Boolean {
        return this.age >= 20
    }

    // 커스텀 getter
    val isAdult: Boolean
        get() = this.age >= 20

}


fun main() {
    val person = Person("손동규")
    println(person.name)
    //person.age = 10 // 사실상 setter 호출
    println(person.age)
}

