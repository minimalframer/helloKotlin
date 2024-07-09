package me.mjhasan.hellokotlin.range.iterator

fun main() {
    val charSet: CharRange = 'a'..'z'
    val charIterator: CharIterator = charSet.iterator()

    while (charIterator.hasNext()) {
        val c: Char = charIterator.next()
        println(c)
    }

    println(charIterator.hasNext())

    try {
        println(charIterator.next())
    } catch (e: NoSuchElementException) {
        println(e.message)
    }
}