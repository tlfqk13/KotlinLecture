package com.lannstark.lec10

interface Swimable {

    val swimAbility: Int

    fun act(){
        println(swimAbility)
        println("어푸 어푸 날개짓")
    }
}