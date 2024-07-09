package me.mjhasan.hellokotlin.exceptionHandling

fun main() {
    println("Hello Kotlin")

    print("Enter first number: ")
    var a: Int = readln()!!.toInt()

    print("Enter second number: ")
    var b: Int = readln()!!.toInt()

//    Except all type of Errors
    try {
        var division: Double = a.toDouble() / b.toDouble()
        println("result: $division")
    } catch (exception: Exception) {
        println(exception.message)
    }


//    ArithmeticException
    try {
        var result: Int = a / b
        println("result: $a / $b = $result")
    } catch (exception: ArithmeticException) {
//        exception.printStackTrace()
        println(exception.message)
    } finally {
        println("Successfully Executed!")
    }

//    ArrayIndexOutOfBoundsException
    val numbers: IntArray = intArrayOf(5, 2, 4, 20)
    try {
        val n: Int = numbers[3]
        println("result: $n")
    } catch (exception: ArrayIndexOutOfBoundsException) {
        println(exception.message)
    }
}

//throw
fun division(a: Int, b: Int): Int{
    if (b < 1) {
        throw ArithmeticException("Devided by zero not allowed!")
        return -1
    }
    val result: Int = a / b
    return result
}