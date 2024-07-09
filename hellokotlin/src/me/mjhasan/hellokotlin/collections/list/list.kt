package me.mjhasan.hellokotlin.collections.list

fun main() {
    println("Hello Kotlin!")

    var indexbyValue: Int
    var value: Int
    var valueByIndex: String
    var checker: Boolean

    val listOfCompanies: List<String> = mutableListOf("Samsung", "Walton", "Singer", "Minister", "Vision", "Asus", "Dell", "Minister")
    println(listOfCompanies)

    checker = listOfCompanies.contains("Walton")
    println(checker)

    valueByIndex = listOfCompanies.get(3)
    println(valueByIndex)

    valueByIndex = listOfCompanies[2]
    println(valueByIndex)

    indexbyValue = listOfCompanies.indexOf("Minister")
    println(indexbyValue)

    indexbyValue = listOfCompanies.lastIndexOf("Minister")
    println(indexbyValue)

    checker = listOfCompanies.isEmpty()
    println(checker)

    checker = listOfCompanies.isNotEmpty()
    println(checker)

    checker = listOfCompanies.isNullOrEmpty()
    println(checker)

    checker = listOfCompanies.equals(listOfCompanies)
    println(checker)

    checker = listOfCompanies == listOfCompanies
    println(checker)

    var also: Int = listOfCompanies.size.also { value = it }
    println(value)

    value = listOfCompanies.size
    println(value)

    val iterator = listOfCompanies.iterator()
    while (iterator.hasNext()) {
        println(iterator.next().uppercase())
    }

    val newList: List<String> = listOfCompanies.subList(0, 3)
    println(newList.joinToString(", "))

//    drop
    val droppedList: List<String> = listOfCompanies.drop(5)
    println(droppedList.joinToString(", "))

    val lastDroppedList: List<String> = listOfCompanies.dropLast(5)
    println(lastDroppedList.joinToString(", "))

//    iterator
    var listIterator = listOfCompanies.iterator()
    while (listIterator.hasNext()) {
        println(listIterator.next())
    }

//    listIterator
    listIterator = listOfCompanies.listIterator(4)
    while (listIterator.hasNext()) {
        println(listIterator.next())
    }
}


/*
//Immutable
//abc.contains()
//abc.containsALL()
//abc.get()
//abc.index0f()
//abc.isEmpty()
//abc.lastIndexOf()
//abc.iterator()
//abc.listIterator(i)
//abc.subList()


//Mutable
//abc.add()
//abc.addAll()
//abc.clear()
//abc.remove()
//abc.removeAll()
//abc.removeAt()
//abc.set()
//abc.retainAll()
*/
