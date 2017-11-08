package com.orion.kotlinsample

class User(var name: String, val email: String) {

    var Empty : Boolean = false
        get() {
            return email.isNotEmpty()
        }
        set(value) {
            field = !value
        }

    fun test() : Boolean = true
}

