package com.lannstark.lec10

class Cat(
    species: String
) : Animal(species, 4)  { // 상위 클래스의 생성자를 바로 호출한다

    override fun move() {
        println("고양이가 사뿐 싸뿐 걸어가")
    }
}

