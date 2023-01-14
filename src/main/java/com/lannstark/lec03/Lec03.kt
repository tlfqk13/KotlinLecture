package com.lannstark.lec03

fun main() {
    val n1 = 3
    val n2: Long = n1.toLong()

    val n3: Int? = 3
    val n4: Long = n3?.toLong() ?: 0L

    //toType()을 활용해 타입 변환을 명시해줘야한다
    val person = Person("손동규", 100)
    val log = "사람의 이름은 ${person.name}이고 나이는 ${person.age}세 입니다"
    println(log)

    val str = """
        abc
        def
        ${person.name}
    """.trimIndent()

    println(str)

    val s = "ABCD"
    println(s[0])
    println(s[3])

}

fun printAgeIfPerson(obj: Any) {
    if (obj is Person) { // !is = not
        val person = obj as Person
        println(person.age)
    }
}

fun printAgeIfPerson1(obj: Any?) {
    val person = obj as? Person // as? -> null 체크, null이라면 전체가 null
    println(person?.age)
}

// Any == Object
// Unit == void
// Nothing == 무조건 예외를 반환하는 함수 / 무한 루프 함수 등