package me.mjhasan.hellokotlin.collections.set.mutableSet.linkedHashSet

fun main() {
    val linkedHashSetOfNames: LinkedHashSet<String> = linkedSetOf()
    val names: LinkedHashSet<String> = linkedSetOf("Galilei", "Lovelace", "Sagan", "Goodall", "Turing")

    linkedHashSetOfNames.add("Hasan")
    linkedHashSetOfNames.add("Hosen")
    linkedHashSetOfNames.add("Einstein")
    linkedHashSetOfNames.add("Newton")
    linkedHashSetOfNames.add("Edison")
    linkedHashSetOfNames.addLast("Hawking")

    println(linkedHashSetOfNames)


    linkedHashSetOfNames.addFirst("Curie")
    println(linkedHashSetOfNames)

    if (linkedHashSetOfNames.contains("Darwin") == false) {
        linkedHashSetOfNames.add("Darwin")
    }
    println(linkedHashSetOfNames)

    if (linkedHashSetOfNames.contains("Edison")) {
        linkedHashSetOfNames.remove("Edison")
    }
    println(linkedHashSetOfNames)

    println(linkedHashSetOfNames.joinToString(", ").uppercase())

    linkedHashSetOfNames.addAll(names)
    println(linkedHashSetOfNames.joinToString(", "))

    linkedHashSetOfNames.forEachIndexed { index, name ->
        println("${index + 1}: $name")
    }

    val sizeOfList: Int = linkedHashSetOfNames.size
    println(sizeOfList)

    linkedHashSetOfNames.clear()
    println(linkedHashSetOfNames.isEmpty())
}