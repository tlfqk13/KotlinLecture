package com.lannstark.lec17

fun main() {
    val fruits = listOf(
        Fruit("사과", 1_000),
        Fruit("사과", 1_200),
        Fruit("사과", 1_200),
        Fruit("사과", 1_500),
        Fruit("바나나", 3_000),
        Fruit("바나나", 3_000),
        Fruit("수박", 13_000)
    )

    // 즉 이름없는 함수 람다
    val isApple = fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
    }

    //val isApple2 = {fruit: Fruit -> fruit.name == "사과"}

    // 함수의 타입 : (파라미터 타입..)  -> 반환 타입
    val isApple2: (Fruit) -> Boolean = { fruit: Fruit -> fruit.name == "사과" }

    // Fruit를 받아 Boolean을 반환하는 함수
    val isApple3: (Fruit) -> Boolean = fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
    }

    println(isApple(fruits[0]))
    isApple.invoke(fruits[0])

    filterFruits(fruits, isApple)

    // 익명함수를 만들때 파라미터가 한개인 경우
    filterFruits(fruits) { it.name == "사과" }

    val apples = fruits.filter { fruit -> fruit.name == "사과" }
        .map{fruit -> fruit.price }

}
// 코틀린에서의 람다
// 코틀린은 함수가 그 자체로 값이 될 수 있다.

/*private fun filterFruits(
    fruits: List<Fruit>,
    filter: (Fruit) -> Boolean
): List<Fruit> {
    val results = mutableListOf<Fruit>()
    for (fruit in fruits) {
        if (filter(fruit)) {
            results.add(fruit)
        }
    }
    return results
}*/

private fun filterFruits(
    fruits: List<Fruit>,
    filter: (Fruit) -> Boolean
): List<Fruit> {
    return fruits.filter(filter)
}
