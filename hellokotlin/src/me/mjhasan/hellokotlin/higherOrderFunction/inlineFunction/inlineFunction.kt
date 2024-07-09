package me.mjhasan.hellokotlin.higherOrderFunction.inlineFunction

fun main() {
    println("Hello Kotlin")

    higherOrderFun(4, 7,
        sumFun = { result ->
            println(result)
        },
        subFun = { result ->
            println(result)
        })
}

inline fun higherOrderFun(
    a: Int,
    b: Int,
    crossinline sumFun: (Int) -> Unit,
    noinline subFun: (Int) -> Unit
) {
    val sum: Int = a + b
    val sub: Int = a - b
    sumFun(sum)
    subFun(sub)
}