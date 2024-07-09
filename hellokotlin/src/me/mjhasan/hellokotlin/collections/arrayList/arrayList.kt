package me.mjhasan.hellokotlin.collections.arrayList

fun main() {
    println("Hello Kotlin!")

    val arrayListOfCompanies: ArrayList<String> = arrayListOf("Walton", "Minister", "Singer", "Vision")
    val otherCompanies: ArrayList<String> = arrayListOf("Dell", "Samsung")
    println(arrayListOfCompanies)

    println(arrayListOfCompanies.joinToString(", ").uppercase())

    arrayListOfCompanies.add("Asus")
    println(arrayListOfCompanies)

    println(arrayListOfCompanies[2])


    arrayListOfCompanies.add("Walton")
    println(arrayListOfCompanies.joinToString(", ").uppercase())

    val lastIndex: Int = arrayListOfCompanies.lastIndexOf("Walton")
    println(lastIndex)
    arrayListOfCompanies.forEachIndexed { index, company ->
        println("$index: $company")
    }


    arrayListOfCompanies.remove("Minister")
    println(arrayListOfCompanies)

    val stringOfArray: String = arrayListOfCompanies.toString()
    println("String: $stringOfArray")

    arrayListOfCompanies.removeLast()
    println(arrayListOfCompanies)

    arrayListOfCompanies.removeFirst()
    for (company in arrayListOfCompanies) {
        println(company)
    }

    println(arrayListOfCompanies.size)

    arrayListOfCompanies.addAll(otherCompanies)
    arrayListOfCompanies.forEachIndexed { index, company ->
        println("$index: $company")
    }

    arrayListOfCompanies.removeAll(otherCompanies)
    println(arrayListOfCompanies.joinToString(", "))

    val iterator = arrayListOfCompanies.iterator()
    while (iterator.hasNext()) {
        val item = iterator.next()
        val hashKey = item.hashCode()
        println("$item: $hashKey")
    }

    arrayListOfCompanies.clear()
    println(arrayListOfCompanies.isEmpty())

    println(arrayListOfCompanies.count())
}