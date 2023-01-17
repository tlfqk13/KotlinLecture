package com.lannstark.lec12

fun main() {
    moveSomething(object :Movable {
        override fun move() {
            println("move")
        }

        override fun fly() {
            println("fly")
        }
    })
}

class Person private constructor(
    var name: String,
    var age: Int,
) {

    // static: 클래스가 인스턴스화 될 때 새로운 값이 복제되는게 아니라 정적으로 인스턴스끼리의 값을 공유
    // static 이란 개념이 없다
    companion object Factory : Log { // 클래스와 동행하는 유일한 오브젝트
        private const val MIN_AGE = 1 // 컴파일시에 할당됨
        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }

        override fun log() {
            println("나는 Person 클래스의 동행 객체 ")
        }
    }
}

// 싱글톤 - 단 하나의 인스턴스만을 갖는 클래스
object Singleton {
    var a: Int = 0
}

//익명클레스 : 특정 인터페이스나 클래스를 상속받은 구현체를 일회성으로 사용할 때 쓰는 클래스
private fun moveSomething(movable: Movable){
    movable.move()
    movable.fly()
}