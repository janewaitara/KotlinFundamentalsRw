package storeDataInCollections

/*
* Using an array of the days of the week, practice your collection skills
* Change the value of an element by accessing them by their index
* Add one element and remove one element eg add another Friday and remove monday
* print the changed list to check that all the elements are there
* After removing an element, check if its in the list and print the results
*
* */

fun main() {

    val days = arrayOf("Monday","Tuesday","Wednesday", "Thursday", "Friday","Saturday","Sunday")
    days[0] = "Sunday"

    val daysList = days.toMutableList()
    daysList.add(6,"Saturday")
    daysList.remove("Thursday")


    println(daysList)

    println("Thursday" in daysList)
}