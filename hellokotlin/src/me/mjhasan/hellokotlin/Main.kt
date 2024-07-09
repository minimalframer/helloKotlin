package me.mjhasan.hellokotlin

fun main() {
    val firstArray: Array<Any> = arrayOf(1, 2, 4, "hello kotlin")
    for (element in firstArray) {
        println(element)
    }

    val integerArray: IntArray = intArrayOf(1, 5, 13)
    val size: Int = integerArray.size
    println(size)

    integerArray[0] = 15

    println(integerArray[0])

    println(integerArray.joinToString(", "))
    
}