package me.mjhasan.hellokotlin.collections.map.mutableMap.linkedHashMap

fun main() {
    var checker: Boolean

    val companies: LinkedHashMap<Int, String> = linkedMapOf(
        1 to "Walton",
        2 to "Minister",
        3 to "Singer",
        4 to "Vision",
        5 to "Asus",
        6 to "Dell"
    )

    val otherCompanies: LinkedHashMap<Int, String> = linkedMapOf(
        7 to "Google",
        8 to "Amazon"
    )

    println(companies.values.joinToString(", ").uppercase())

    companies.put(7, "Samsung")
    println(companies)

    companies.putAll(otherCompanies)
    println(companies)

    companies[9] = "Jetbrains"
    println(companies)

    companies.remove(5)
    println(companies)

    checker = companies.contains(4)
    println(checker)

    checker = companies.containsValue("Asus")
    println(checker)

    checker = companies.containsKey(3)
    println(checker)

    val iterator = companies.iterator()
    while (iterator.hasNext()) {
        val entry = iterator.next()
        val key = entry.key
        val value = entry.value
        println("$key: ${value.uppercase()}")
    }
}