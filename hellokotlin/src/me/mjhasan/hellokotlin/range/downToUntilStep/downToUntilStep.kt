package me.mjhasan.hellokotlin.range.downToUntilStep

fun main() {
    val numbers: IntRange = 0..10

    for (i in numbers step 2) {
        println(i)
    }

    for (i in 'a'..'z' step 3) {
        println(i)
    }

    for (c in 'Z' downTo 'A' step 2) {
        println(c)
    }

    for (k in 0 until 10 step 1) {
        println(k)
    }
}