package org.example.Java.Act7

fun main() {
    fun multiplicar(num1: Int): Int {
        return num1 * 2
    }

    println(multiplicar(10))

    val operacion: (Int, Int) -> Int = { a, b -> a + b }

    println(operacion(1, 2))







}