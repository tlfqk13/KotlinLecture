package com.lannstark.lec15

fun main() {

    val array = arrayOf(100,200)
    array.plus(300)

    for (i in array.indices){
        println("$i ${array[i]}")
    }

    for((idx, value ) in array.withIndex()){
        println("$idx $value")
    }

    // 코틀린은 불변/가변을 지정해 주어야함 반드시

    //val numbers = listOf(100,200)
    val numbers = mutableListOf(100,200) // 가변
    numbers.add(300)

    val emptyList = emptyList<Int>() // 값을 넣지 않았으니깐 자료형을 명시

    println(numbers[0])

    for (number in numbers) {
        println(number)
    }

    for ((idx,value ) in numbers.withIndex()){
        println("$idx $value")
    }

    val numbers1 = setOf(100,200)
    val numbers2 = mutableSetOf(100,200,300)

    val mapNumbers = mutableMapOf<Int,String>()
    //mapNumbers.put(1,"monday")
    mapNumbers[1] = "monday"

    val mapOf = mapOf(1 to "monday", 2 to "tue")

    for( key in mapNumbers.keys){
        println(key)
        println(mapNumbers[key])
    }

    for( (key, value ) in mapNumbers.entries){
        println(key)
        println(value)
    }

    /*
    * List<Int?> 리스트에 null이 들어갈 수 있지만, 리스트는 절대 null이 아님
    * List<Int>? 리스트에는 null이 들어갈 수 없지만, 리스트는 null일 수도 있음
    * List<Int?>? 리스트에 null이 들어갈 수도 있고, 리스타가 null일 수도 있음
    *
    *
    * */

}

private fun printNumbers(numbers: List<Int>){

}