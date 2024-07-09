package me.mjhasan.hellokotlin.collections.list.mutableList

fun main() {
    println("Hello Kotlin")
    var checker: Boolean
    var sizeOfList: Int

    val mutableListOfBooks: MutableList<String> = mutableListOf("Bangla", "English", "math")
    val otherBooks: MutableList<String> = mutableListOf("Science", "Philosophy")

    println(mutableListOfBooks)
    println(otherBooks)

    mutableListOfBooks.add("History")
    println(mutableListOfBooks)

    mutableListOfBooks.removeFirst()
    println(mutableListOfBooks)

    mutableListOfBooks.removeLast()
    println(mutableListOfBooks)

    mutableListOfBooks.addAll(otherBooks)
    println(mutableListOfBooks)

    checker = mutableListOfBooks.contains("History")
    println(checker)

    checker = mutableListOfBooks.containsAll(otherBooks)
    println(checker)

    mutableListOfBooks.remove("History")
    println(mutableListOfBooks)

    mutableListOfBooks.retainAll(otherBooks)
    println(mutableListOfBooks)

    mutableListOfBooks.clear()
    checker = mutableListOfBooks.isEmpty()
    println(mutableListOfBooks)
    println(checker)

    mutableListOfBooks.addAll(otherBooks)
    println(mutableListOfBooks)

    sizeOfList = mutableListOfBooks.size
    println(sizeOfList)

    println(otherBooks.size)

    checker = mutableListOfBooks == otherBooks
    println(checker)

    mutableListOfBooks.add("Psychology")

    if (mutableListOfBooks == otherBooks) {
        println("list are same.")
    } else {
        println("List are not same.")
    }

    println(mutableListOfBooks)

    println(mutableListOfBooks.get(0))
    println(mutableListOfBooks[2])

    println(mutableListOfBooks.joinToString(", "))

    mutableListOfBooks.forEachIndexed { index, book ->
        println("$index: $book")
    }

    for (book in otherBooks) {
        println(book)
    }

    otherBooks.forEachIndexed { index, book ->
        println("$index: $book")
    }

    mutableListOfBooks.clear()
    otherBooks.clear()

    println(mutableListOfBooks.isEmpty())
    println(otherBooks.isNotEmpty())

    println(mutableListOfBooks)
    println(otherBooks)
}