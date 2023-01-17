package com.lannstark.lec10

abstract class Animal(
    protected val species:String,
    protected open val legCount:Int, //프로퍼티를 override 할 떄 무조건 Open을 붙여야함
) {

    abstract fun move()

}