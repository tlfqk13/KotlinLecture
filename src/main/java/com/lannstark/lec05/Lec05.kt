package com.lannstark.lec05

fun main() {

}

fun validateScoreIsNotNegative(score: Int) {
    if (score !in 0..100) {
        throw IllegalArgumentException("Score 범위는 0 부터 100")
    }
}

// statement = 프로그램의 문장, 하나의 값으로 도출되지 않는다
// expression = 하나의 값으로 도출되는 문장 - 자바의 3항 연산자 처럼

fun getPassOrFail(score: Int): String {
    return if (score >= 50) {
        "P"
    } else {
        "F"
    }
}

fun getGrade(score: Int): String {
    return if (score >= 90) {
        "A";
    } else if (score >= 80) {
        "B";
    } else if (score >= 70) {
        "C";
    } else if (score >= 60) {
        "D";
    } else {
        "F"
    }
}

fun getGradeWithSwitch(score: Int): String {
    return when (score / 10) {
        9 -> "A"
        8 -> "B"
        7 -> "c"
        else -> "D"
    }
}

fun getGradeWithSwitch1(score: Int): String {
    return when (score) {
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "c"
        else -> "D"
    }
}

fun startsWithA(obj: Any): Boolean {
    return when (obj) {
        is String -> obj.startsWith("A")
        else -> false
    }
}

fun judgeNumber(number: Int) {
    when (number) {
        1, 0, -1 -> println("AA")
        else -> println("1, 0 , -1 이 아닙니다")
    }
}

fun judgeNumber2(number: Int) {
    when {
        number == 0 -> println(" 주어진 숫자는 0")
        number % 2 == 0 -> println(" 짝수")
        else -> println(" 홀수")
    }
}













