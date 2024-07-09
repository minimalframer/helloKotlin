package me.mjhasan.hellokotlin.exceptionHandling.Throw

fun main() {
    var a: Int = 25
    var b: Int = 10

    try {
        var result: Int = division(a, b)
        println("Result: $a / $b = $result")
    } catch (e: customException) {
//        e.printStackTrace()
        println(e.message)
    }

    try {
        checkPositiveNumber(-1)
    } catch (e: NumberLessThanZeroException) {
        println(e.message)
    }

    println("Hello Kotlin")
}

fun division(a: Int, b: Int): Int {
    if (b < 1) {
        throw customException("Devided by Zero not allowed!")
    }
    var result: Int = a / b
    return result
}

fun checkPositiveNumber(n: Int) {
    if (n < 0) {
        throw NumberLessThanZeroException("The Number $n is less than Zero")
    }
}

//custom exceptions
class customException(errorMessage: String): Exception(errorMessage)
class NumberLessThanZeroException(errorMessage: String): Exception(errorMessage)