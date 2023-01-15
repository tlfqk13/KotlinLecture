package com.lannstark.lec08

fun main() {

    // named argument - 매개변수 이름을 통해 직접 지정 지정되지 않은 매개변수는 기본값 사용
    repeat("Hello world ", useNewLine = false)
    repeat("Hello world")

    printNameAndGender(name="손동규",gender="MALE")

    val array = arrayOf("A","B","C")
    printAll(*array) // 가변인자에 넣어줄때 * 붙여라



}

// 코틀린에서 함수를 다루는 방법
/*
fun max(a: Int, b: Int): Int {
    return if (a > b) {
        a
    } else {
        b
    }
}*/

//fun max(a: Int, b: Int): Int = if (a > b) a else b
fun max(a: Int, b: Int) = if (a > b) a else b

fun repeat(str: String, num: Int = 3, useNewLine: Boolean = true) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}

fun printNameAndGender(name: String, gender:String){
    println(name)
    println(gender)
}

fun printAll(vararg strings: String){
    for(str in strings){
        println(str)
    }
}











