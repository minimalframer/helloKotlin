package me.mjhasan.hellokotlin.collections.map.mutableMap

fun main() {
    val scientists: MutableMap<String, Int> = mutableMapOf("Tesla" to 1, "Einstein" to 2, "Edison" to 3)
    println(scientists)

    scientists.put("Nazrul", 4)
    println(scientists)

    println(scientists.keys.joinToString(", "))
    println(scientists.values.joinToString(", "))

    scientists.remove("Edison")
    println(scientists)

    scientists.replace("Einstein", 2, 25)
    println(scientists)

    scientists.replaceAll { key, value ->
        value * 10

    }

    println(scientists)

    for ((key, value) in scientists) {
        println("Name: $key, Roll: $value")
    }

    scientists.forEach { key, value ->
        println("Name: $key, Roll: $value")
    }

    println("---------------------------------------(breaks)")
    val mapIterator = scientists.iterator()
    while (mapIterator.hasNext()) {
        val entry = mapIterator.next()
        val key = entry.key
        val value = entry.value
        println("Name: $key, Roll: $value")
    }



}