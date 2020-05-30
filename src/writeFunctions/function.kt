package writeFunctions

fun main() {

    //a function to create a range
    fun createRanges(start: Int, end: Int, isHalfOpen: Boolean = false) : IntRange{
        return if (isHalfOpen){
            start until end
        }else {
            start..end
        }
    }

    //function to print range

    fun printRange(range: IntRange){
        for (number in range) print("$number \t")
        println()
    }


    val closedRange = createRanges(1,10)
    printRange(closedRange)

    val halfOpenRange = createRanges(1,10,true)
    printRange(halfOpenRange)

    val usingNamedArguments = createRanges(isHalfOpen = true,start = 10, end = 15)
    printRange(usingNamedArguments)

    printRange(createRanges(3,5,isHalfOpen = true))



}