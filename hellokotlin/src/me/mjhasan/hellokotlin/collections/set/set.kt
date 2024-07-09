package me.mjhasan.hellokotlin.collections.set

fun main() {
    println("Hello Kotlin!")

    var checker: Boolean
    var indexByValue: Int
    var valueByIndex: String

    val setOfNames: Set<String> = setOf("Hasan", "Hosen", "Rayyan", "Razin")
    val setOfBooks: Set<String> = setOf("Bangla", "English", "Math", "Science")

    checker = setOfNames.isEmpty()
    println(checker)

    checker = setOfNames.isNotEmpty()
    println(checker)

    checker = setOfBooks.contains("Math")
    println(checker)

    checker = setOfNames.contains("Rejone")
    println(checker)

    checker = setOfNames == setOfBooks
    println(checker)

    checker = setOfNames != setOfBooks
    println(checker)

    checker = setOfNames.equals(setOfBooks)
    println(checker)


    checker = setOfNames.containsAll(setOfBooks)
    println(checker)

    var setIterator = setOfNames.iterator()
    while (setIterator.hasNext()) {
        println(setIterator.next())
    }

    indexByValue = setOfBooks.indexOf("Math")
    println(indexByValue)

    val reversedSet: List<String> = setOfBooks.reversed()
    println(reversedSet.joinToString(", "))

    setOfBooks.forEachIndexed { index, s ->
        println("$index: $s")
    }
}