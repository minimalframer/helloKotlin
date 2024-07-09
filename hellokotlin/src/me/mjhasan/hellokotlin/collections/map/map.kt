package me.mjhasan.hellokotlin.collections.map

fun main() {
    var checker: Boolean
    var valueOfMap: Int

    val students: Map<String, Int> = mapOf("Hasan" to 1, "Hosen" to 2, "Rayyan" to 5, "Razin" to 13)
    println(students)

    for ((key, value) in students) {
        println("Name: $key, Roll: $value")
    }

    checker = students.contains("Hasan")
    println(checker)

    checker = students.containsKey("Rayyan")
    println(checker)

    checker = students.containsValue(13)
    println(checker)

    checker = students.containsValue(25)
    println(checker)

    checker = students.isEmpty()
    println(checker)

    println(students["Hasan"])
    println(students.get("Rayyan"))

    val keys:Set<String> = students.keys
    println(keys)

    val values: Collection<Int> = students.values
    println(values)

    val entries: Set<Map.Entry<String, Int>> = students.entries
    println(entries)

    val count: Int = students.count()
    println(count)

}
