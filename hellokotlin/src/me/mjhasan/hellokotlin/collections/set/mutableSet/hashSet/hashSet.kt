package me.mjhasan.hellokotlin.collections.set.mutableSet.hashSet

fun main() {
    val hashSetOfNames: HashSet<String> = HashSet()

    hashSetOfNames.add("Hasan")
    hashSetOfNames.add("Hosen")
    hashSetOfNames.add("Tesla")
    hashSetOfNames.add("Edison")
    hashSetOfNames.add("Newton")
    hashSetOfNames.add("JN Islam")

    println(hashSetOfNames)
}