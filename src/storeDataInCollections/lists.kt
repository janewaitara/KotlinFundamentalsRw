package storeDataInCollections

/**
 * Powered by arrays
 * Index data access - O(1)
 * Iteration - O(n)
 *
 * Dynamic in size
 *  add or remove elements
 *  Remove O(n) - shifts the list
 *  Add O(1) - appends at the end
 * */
fun main() {

    val visitedCountries = listOf("Ghana", "Nigeria","Kenya","USA")
    println(visitedCountries)

    val countries = visitedCountries.toMutableList()
    countries.add("Germany") //appends at the end
    countries.add(1, "Tanzania")//adds at a specific position
    println(countries)

    countries.addAll(5, listOf("Ethiopia","Mexico","Israel"))
    println(countries)

    //contains check
    val hasBeenToJapan = "Japan" in countries
    println(hasBeenToJapan)

    //removing elements
    countries.remove("Germany")
    countries.removeAt(0)
    countries.removeAll(listOf("Tanzania","Mexico","Israel"))
    println(countries)

    //changing an element
    countries[2] = "Mexico"
    //combining lists into one. different from addAll cause it creates a new list
    val combinedList = visitedCountries + countries
    val emptyList = emptyList<String>()
    println(countries)
    println(combinedList)
    println(emptyList)

    //removing all elements
    countries.clear()
    println(countries)


}