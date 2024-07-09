package me.mjhasan.hellokotlin.collections

fun main() {
//    List/MutableList

    val companies: List<String> = mutableListOf("Samsung", "Walton", "Minister", "Singer", "Asus", "Dell", "Walton")
    val names: List<String> = mutableListOf("Samsung", "Walton", "Singer", "Space")

    var checker: Boolean
    var valueByIndex: String
    var indexbyValue: Int

    val listSize: Int = companies.size
    println(listSize)

    println(companies.joinToString(", "))


    checker = companies.contains("Walton")
    println(checker)

    checker = companies.containsAll(names)
    println(checker)


    valueByIndex = companies.get(1)
    println(valueByIndex)

    valueByIndex = companies[3]
    println(valueByIndex)


    indexbyValue = companies.indexOf("Walton")
    println(indexbyValue)

    indexbyValue = companies.lastIndexOf("Walton")
    println(indexbyValue)

    checker = companies.isEmpty()
    println(checker)

    checker = companies.isNotEmpty()
    println(checker)

    checker = companies.isNullOrEmpty()
    println(checker)

    val subListOfCompanies: List<String> = companies.subList(1, 4)
    println(subListOfCompanies.joinToString(", "))
}