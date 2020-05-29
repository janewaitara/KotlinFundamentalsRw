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
}