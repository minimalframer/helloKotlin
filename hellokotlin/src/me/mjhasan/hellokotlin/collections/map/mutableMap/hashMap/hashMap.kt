package me.mjhasan.hellokotlin.collections.map.mutableMap.hashMap

fun main() {
    println("hashMap")
    val names: LinkedHashMap<Int, String> = linkedMapOf(
        1 to "Hasan",
        2 to "NewTon",
        3 to "Edison"
    )

    println(names)
    println(names.getOrDefault(1, "Newton"))

    names[7] = "Reyhan"
    println(names)

    names.replace(2, "Tesla")
    println(names.values.joinToString(", "))

    names.clear()
    println(names.isEmpty())
}