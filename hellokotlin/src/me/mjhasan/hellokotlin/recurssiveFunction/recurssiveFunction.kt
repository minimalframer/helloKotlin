package me.mjhasan.hellokotlin.recurssiveFunction

fun main() {
    println("Hello Kotlin")
//    greetings("Hasan", 1)

    print("Enter a Number: ")
    var n : Int = readln()!!.toInt()

    var result : Long = summation(n)
    println("result: $result")
}

tailrec fun greetings(name: String, times: Int) {
    if (times > 0) {
        println("Greetings, $name!")
        greetings(name, times - 1)
    }
}

tailrec fun summation(n: Int, sum: Long = 0): Long {
    return if (n == 0) {
        sum
    } else {
        summation(n-1, sum + n)
    }
}