package com.orion.kotlinsample.classes

fun funct(name: String) {

}

fun returnFun(name: String = "test") : Boolean {
    return name.isNotEmpty()
}

fun returnFun2(name: String): Boolean {
    return name.isNotEmpty()
}

fun plusFun(a: Int, b: Int) = a + b