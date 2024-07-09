package me.mjhasan.hellokotlin.higherOrderFunction.predicateFunction

fun main() {
    val numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val oddNumbers: List<Int> = numbers.filter { isOddNumber(it) }
    println(oddNumbers.joinToString(", "))
}

//predicate Function
fun isOddNumber(n: Int): Boolean {
    return n % 2 == 1
}