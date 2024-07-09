package me.mjhasan.hellokotlin.range.utilityFunctions

fun main() {
    val numbers: IntRange = 0.rangeTo(10)
    println(numbers.joinToString(", "))

    val intNumberRange: IntRange = IntRange(0, 20)
    println(intNumberRange.joinToString(", "))

    val intDownRange: IntProgression = 10.downTo(0).step(2)
    println(intDownRange)
    println(intDownRange.joinToString(", "))


    val reverseRange: IntProgression = intDownRange.reversed()
    println(reverseRange)
    println(reverseRange.joinToString(", "))

    val firstItem = intNumberRange.first
    val lastItem = intNumberRange.last

    println("first value: $firstItem, last value: $lastItem")

}