package manageControlFlow

fun main() {
    val visitedCountries = arrayOf("Kenya","Ghana","Nigeria","USA", "Finland")

    var i = 0 //i is for indices during iterations
    while ( i < visitedCountries.size){
        println("Country at index $i is ${visitedCountries[i]}")

        i += 1
    }

    i = 0

    do {
        println("Country at index $i is ${visitedCountries[i]}")
        i += 1
    }while (i < visitedCountries.size)

    //print number 1 to 15

    var index = 1
    while (index <= 15){
        println(index)
        index++
    }

    //create a list of names.Do a while loop to print the names in reverse order.
    // Check that index is within the bounds of the array's

    val names = listOf<String>("Hellen","Jane","John","Lydiah")
    index = names.lastIndex

    do {
        if (index > names.lastIndex || index < 0) return
        println(names[index])
        index--
    }while ( index >= 0 && index < names.size )
}