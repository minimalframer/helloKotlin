package me.mjhasan.hellokotlin.higherOrderFunction


fun main() {
    var result: Int = sumValues(5, 4)
    println(result)

    higherOrderFunLast(5, 4) { myResult ->
        println(myResult)
    }

    higherOrderFunMiddle(5, myOutput = { myResult ->
        println(myResult)
    }, 4)

    higherOrderFunFirst(myOutput = { myResult ->
        println(myResult)
    }, 5, 4)

    higherOrderFunInt(5, 4, intOutput = { result, message ->
        println("result: $result\nmessage: $message")
        result * 3 // or any integer
    })
}

//  Normal Function
fun sumValues(a: Int, b: Int): Int {
    val result: Int = a + b
    return result
}

//Higher-order Functions

fun higherOrderFunLast(a: Int, b: Int, myOutput: (Int) -> Unit) {
    val result: Int = a + b
    myOutput(result)
}

fun higherOrderFunMiddle(a: Int, myOutput: (Int) -> Unit, b: Int) {
    val result = a + b
    myOutput(result)
}


fun higherOrderFunFirst(myOutput: (Int) -> Unit, a: Int, b: Int) {
    val result = a + b
    myOutput(result)
}

fun higherOrderFunInt(a: Int, b: Int, intOutput: (Int, String) -> Int) {
    val result: Int = a + b
    val intResult: Int = intOutput(result, "operation Successful.")
    println(intResult)
}