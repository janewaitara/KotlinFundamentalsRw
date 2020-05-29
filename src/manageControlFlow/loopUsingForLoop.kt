package manageControlFlow

fun main() {

    val visitedCountries = arrayOf("Kenya", "Ghana", "Nigeria", "USA", "Finland")

    val rangeFromZeroToTen = 0..10
    println(rangeFromZeroToTen)

    val exclusiveRange = 0 until 10
    println(exclusiveRange)

    for (index in rangeFromZeroToTen) {
        print("$index-")
    }

    println("")

    //helper function to how to iterate

    for (index in rangeFromZeroToTen step 2) {
        print("$index-")
    }
    println("")


    for (index in 10 downTo 0) {
        print("$index-")
    }
    println("")

    for (countryIndex in 0..visitedCountries.lastIndex) {
        print("${visitedCountries[countryIndex]} ")
    }
    println(" ")

    for (country in visitedCountries)
        print("$country ")
    println(" ")


    /* challenges
     1.create a range of 20 numbers and print them out
     2.print out every third number
     3.create a decreasing number and print out every second number
     */

    for (i in 1..20)
        print("$i ")
    println(" ")

    for (i in 1..20 step 3)
        print("$i ")
    println(" ")


    val reverseRange = 30 downTo 15
    for (i in reverseRange step 2)
        print("$i ")
    println(" ")
}