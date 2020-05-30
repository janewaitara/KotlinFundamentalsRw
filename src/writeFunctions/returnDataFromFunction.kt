package writeFunctions

fun main() {

    //a function to create a range using a default parameter
    fun createRanges(start: Int, end: Int, isHalfOpen: Boolean = false) =
      if (isHalfOpen){
            start until end
        }else {
            start..end
        }

    //overloading
    fun createRanges(start: Char, end: Char, isHalfOpen: Boolean = false) =
        if (isHalfOpen){
            start until end
        }else {
            start..end
        }

    //function to print range
    fun printRange(range: IntRange){
        for (number in range) print("$number \t")
        println()
    }

    fun printRange(range: CharRange){
        for (number in range) print("$number \t")
        println()
    }


    val closedRange = createRanges(1,10)
    printRange(closedRange)

    val halfOpenRange = createRanges(1,10,true)
    printRange(halfOpenRange)

    //named arguments
    val usingNamedArguments = createRanges(isHalfOpen = true,start = 10, end = 15)
    printRange(usingNamedArguments)

    printRange(createRanges(3,5,isHalfOpen = true))

    val charRange = createRanges('g','z')
    printRange(charRange)

    //returning pairs and triples

    fun parseCoordinates(input: String): Pair<Double, Double> {
        val latitudeLongitude = input.split(",")

        val latitude = latitudeLongitude[0].toDouble()
        val longitude = latitudeLongitude[1].toDouble()

        return latitude to longitude
    }

    val (latitude, longitude) = parseCoordinates("45.46, 18.68")
    println("The latitude is: $latitude, and the longitude is: $longitude")



}