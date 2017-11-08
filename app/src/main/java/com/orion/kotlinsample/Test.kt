package com.orion.kotlinsample

fun main() {

    // Class
    val user = User("test", "orion@ya.ru")
    user.name = "1"

    // Variable
    // Mutable
    var mutableStr: String = "1"
    mutableStr = "2" // Okay
    print(mutableStr)

    // Immutable
    val immutableStr: String = "1"
    immutableStr = "2" // Error
    print(immutableStr)

    var temp : String = "11111"
    temp.removeFirstLastChar() // Custom an extension

    var N = 2
    var result : String = when(N) {
        1 -> "One"
        2,3,4 -> "2,3,4"
        5 -> "Five"
        String -> "String!!!!"
        else -> "None"
    }

    print(result) // "2,3,4"

    // loop "for"
    for (i in 1..5) {
        print(i)
    }

    //
    val userName = "Blabla"
    print("Hello $userName")
}

fun String.removeFirstLastChar() : String = this.substring(1, this.length - 1)
