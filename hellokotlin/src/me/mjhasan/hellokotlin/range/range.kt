package me.mjhasan.hellokotlin.range

fun main() {
    val charRange: CharRange = 'a'..'z'
    println(charRange.joinToString(", "))

    val intRange: IntRange = 0..10
    println(intRange.joinToString(", "))

    val longRange: LongRange = 20L..50L
    println(longRange.joinToString(", "))

//    print values with forEach loop
    charRange.forEach {
        println(it)
    }


//    print values with for loop
    for (i in intRange) {
        println(i)
    }

//    print values with forEachIndexed Loop
    longRange.forEachIndexed { index, l ->
        println("$index: $l")
    }


//    checking a value in range
    var checker: Boolean

    checker = 11 in intRange
    println(checker)    //  false

    checker = 'h' in charRange
    println(checker)    //  true

    checker = 50 in longRange
    println(checker)    //  true

    if ('h' in charRange) println("Char h is available")
    else println("Char h is not available")
}