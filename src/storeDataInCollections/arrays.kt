package storeDataInCollections

/**
 * Difference in Collections
 *
 * Memory management
 * Mutability
 * Performance:
 *      Accessing data
 *      Adding or removing data
 *      Iterating over values
 *
 * an array is a static collection:
 *      size is fixed
 *      cannot add or remove elements
 *
 * Measuring Performance - Big O (Big O notation)
 *     length of operation over a number of elements
 *     Pessimistic approach - worstCase is measured
 *
 *     O(1)- fixed operation - instant(accessing values)
 *     O(n)- linear operation - grows slower with more elements (iterating over arrays)
 *
 * Arrays Pros:
 *      Fixed Data - O(1) accessing using indices
 *      Changing data - O(1)
 *      Simple to use & create
 *      No removing or adding - no performance measurement here
 *
 * Arrays cons:
 *      Iteration - O(n) - one by one
 *      No removing or adding values depending on the use if you need to change the size
 *      Uses a chunk of memory
 */

fun main() {

    val visitedCountries = arrayOf("Ghana", "Nigeria","Kenya","USA")
    println(visitedCountries) //prints out the memory address
    println(visitedCountries.size)
    println(visitedCountries[2])

    //changing an element
    visitedCountries[3] = "United States of America"
    println(visitedCountries[3])

    val sizedArray = Array(10){""} //specifying the size
    val emptyArray = emptyArray<String>() //exists

    //uses less memory
    val arrayOfInts = intArrayOf(2,3,4,5,6)
    println(arrayOfInts)

    //functions to navigate and manipulate values
    println(visitedCountries.lastIndex)
    println(visitedCountries.last())
    println(visitedCountries.first())

    println(visitedCountries.contains("Spain"))

    val hasVisitedSpain = "Spain" in visitedCountries //checking if something is in a collection
    val hasNotVisitedSPain = "Spain" !in visitedCountries

    println(hasNotVisitedSPain)
    println(hasVisitedSpain)



}