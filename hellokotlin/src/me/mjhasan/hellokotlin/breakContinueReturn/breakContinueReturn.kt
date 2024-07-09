package me.mjhasan.hellokotlin.breakContinueReturn

fun main() {
    val animals : Array<String> = arrayOf("Tiger", "Lion", "Cow", "Goat", "Cat")
    var targetAnimal : String = animals[4]  //  cat

//    return
    run outOfLoop@{
        animals.forEach parrentLoop@{
            if (it == targetAnimal) {
                return@outOfLoop    //  break
            }
            println("$it")
        }
    }
}