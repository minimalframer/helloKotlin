package me.mjhasan.hellokotlin.string

import java.util.*

fun main() {
    val charArray: CharArray = charArrayOf('H', 'E', 'L', 'L', 'O', ',', ' ', 'K', 'O', 'T', 'L', 'I', 'N')
    val stringFromChar: String = String(charArray)
    println(stringFromChar)

    val country = "Bangladesh"
    println("$country is our MotherLand.")
    println("We need ${country.length} letters to write $country.")

    val rawString: String = """
        Hello Kotlin,
        My name is Muhammed Hasan, and I am from Bangladesh.
        I am 20 years old.
    """.trimIndent()
    println(rawString)

    val peopleOne: String = "Hasan".lowercase()
    val peopletwo: String = "Hasan".lowercase()
    val isSame: Boolean = peopleOne == peopletwo
    println(isSame)

//    String Properties
    val length = country.length
    val countryIndex: IntRange = country.indices
    val countryLastIndex: Int = country.lastIndex

    println(length)
    println(countryIndex)
    println(countryLastIndex)
}

