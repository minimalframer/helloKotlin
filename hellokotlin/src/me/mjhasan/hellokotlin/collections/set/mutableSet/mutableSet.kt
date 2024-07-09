package me.mjhasan.hellokotlin.collections.set.mutableSet

fun main() {
    var checker: Boolean
    val mutableSetOfCompanies: MutableSet<String> = mutableSetOf("Walton", "Minister", "Singer", "Asus", "Dell")
    val othersCompanies: MutableSet<String> = mutableSetOf("NVIDIA", "Google", "Amazon")
    println(mutableSetOfCompanies)

    mutableSetOfCompanies.add("Samsung")
    println(mutableSetOfCompanies)

    mutableSetOfCompanies.addAll(othersCompanies)
    println(mutableSetOfCompanies)

    mutableSetOfCompanies.remove("Amazon")
    println(mutableSetOfCompanies)

    mutableSetOfCompanies.clear()
    println(mutableSetOfCompanies)

    mutableSetOfCompanies.addAll(othersCompanies)
    println(mutableSetOfCompanies)

    mutableSetOfCompanies.removeAll(othersCompanies)
    println(mutableSetOfCompanies)

    checker = mutableSetOfCompanies.isEmpty()
    println(checker)

    val retainCompanies: MutableSet<String> = mutableSetOf("Walton", "Minister", "Singer")
    mutableSetOfCompanies.retainAll(retainCompanies)
    println(retainCompanies)

    checker = mutableSetOfCompanies.isNotEmpty()
    println(checker)
}