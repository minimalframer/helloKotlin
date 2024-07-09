package me.mjhasan.hellokotlin.string.function


fun main() {
    println("Hello Kotlin")
    val myCountry: String = "Bangladesh"
    val isContains: Boolean = myCountry.contains("Lad", true)
    println(isContains)

    val letterCount: Int = myCountry.count()
    println(letterCount)

    val subString: CharSequence = myCountry.subSequence(0, 3)
    println(subString)

    val singleChar: Char = myCountry.get(0)
    println(singleChar)

    val singleCharTwo: Char = myCountry[0]
    println(singleCharTwo)

    val joinedstring: String = myCountry.plus(" is Our HomeLand.")
    println(joinedstring)

    val comparedValue: Int = myCountry.compareTo("Bangladesh", true)
    if (comparedValue == 0) {
        println("Strings are same!")
    }

    val droppedString: String = myCountry.drop(6)
    println(droppedString)

    val lastDroppedString: String = myCountry.dropLast(4)
    println(lastDroppedString)

    val elementByIndex: Char = myCountry.elementAt(0)
    println(elementByIndex)


    val indexByElement: Int = myCountry.indexOf('B')
    println(indexByElement)

    var replacedString: String = myCountry.replace("desh", "Desh")
    println(replacedString)

    replacedString = myCountry.replace("a", "A")
    println(replacedString)

    val subStringTwo: String = myCountry.substring(6, 10)
    println(subStringTwo)

    val isStartsWith: Boolean = myCountry.startsWith("Ban", true)
    println(isStartsWith)

    val isEndsWith: Boolean = myCountry.endsWith("desh", true)
    println(isEndsWith)

    val name: String = "Hasan"
    val capitalizeName: String = name.capitalize()
    println(capitalizeName)

    val namelowerCase: String = name.lowercase()
    println(namelowerCase)

    val nameUpperCase: String = name.uppercase()
    println(nameUpperCase)

    val nameDeCapitalize: String = name.decapitalize()
    println(nameDeCapitalize)



    val isBlank: Boolean = name.isBlank()
    println(isBlank)

    val isEmpty: Boolean = name.isEmpty()
    println(isEmpty)

    val nullString: String? = null
    val isNullOrEmpty: Boolean = nullString.isNullOrEmpty()
    println(isNullOrEmpty)

    val isNullOrBlank: Boolean = nullString.isNullOrBlank()
    println(isNullOrBlank)

    val isItPalindrom: Boolean = isPalindrom("madam")
    println(isItPalindrom)

    val pie: String = "%.2f".format(3.14159)
    println(pie)
}


fun isPalindrom(string: String): Boolean {
    val reversedString = string.reversed()
    if (string == reversedString) {
        return true
    }
    return false
}
