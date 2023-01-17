package com.lannstark.lec14


fun main() {
    val dto1 = PersonDto("손동규", 30)
    val dto2 = PersonDto("손동규", 30)
    val dto3 = PersonDto(name = "손동규규", age = 40)

    println(
        dto1 == dto2
    )
}

// data 클래스는 equals, hashcode, toString 만들어준다
data class PersonDto(val name: String, val age: Int)

enum class Country(private val code: String) {
    KOREA("KO"),
    AMERICA("US"),
    CHINA("CHN")
    ;
}

fun handleCountry(country: Country) {
    when (country) {
        Country.AMERICA -> TODO()
        Country.KOREA -> TODO()
        Country.CHINA -> TODO()
        // 추가적으로 else를 작성해줄 필요없음
    }
}

// Sealed Class, Sealed Interface
// 상속이 가능하도록 추상클래스를 만들까하는데.. 외부에서는 이 클래스를 상속받지 않게 = 하위 클래스를 봉인
// Enum 과 다른점
// 클래스를 상속받을 수 있다
// 하위 클래스는 멀티 인스턴스가 가능 <> Enum은 코드 하나, 하나가 싱글톤이라 불가
// 컴파일 타임 떄 하위 클래스의 타입을 모두 기억*
sealed class HyundaiCar(
    val name: String,
    val price: Long
)

class Avante : HyundaiCar("아반떼", 1_000L)
class Sonata : HyundaiCar("소나타", 2_000L)
class Grandeur : HyundaiCar("그랜져", 3_000L)

private fun hadleCar(car: HyundaiCar){
    when (car){
        is Avante -> TODO()
        is Grandeur -> TODO()
        is Sonata -> TODO()
    }
}