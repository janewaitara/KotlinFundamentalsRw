package manageControlFlow

/**
 * continue - stop current iteration and move on the next one
 * break - leave the loop entirely
 * */

fun main() {

    val daysOfWeek = listOf("Monday","Tuesday","Wednesday", "Thursday", "Friday","Saturday","Sunday")

    for (day in daysOfWeek){
        if (day == "Monday"){
            continue
        }
        println("Working")

        if (day == "Thursday"){
            println("Getting ready for the weekend")
            break
        }
    }

    //matrix is a two dimensional array eg images with a matrix of pixels

    /**
     *Iteration - O(M*N)
     *In square matrices (N*N) - O(N pow 2)
     *1000 elements - 1 million operations
     * 4K image - 8+ million pixels
     *  */

    val matrix = MutableList<MutableList<String>>(5){ MutableList(5){""} }

    for (row in 0..matrix.lastIndex){
        for (column in 0..matrix.lastIndex){
            matrix[row][column] = "$row : $column"
        }

    }
    println(matrix)
    println("-----")


    //printing
    for (row in matrix){
        println(row)
    }
    println("-----")

    //printing individual elements

    val thirdRowFifthElement = matrix[2][4]
    println(thirdRowFifthElement)

    //applying exit strategies in nested loops using labels
    // which are like check point mark used to go back or refer to a location in code

    row@ for (row in 0..5){
        column@ for (column in 0..5){
            if (column == 2 && row == 2) {
                break@row
            }
            print("x\t")
        }
        println("")

    }
    println("")
    println("----")

//more practice

    var twoD = Array(4) {IntArray(3)}

    //inserting values
    var num = 10
    for (i in 0..twoD.lastIndex ){
        var colArray = IntArray(3)

        for (col in 0..colArray.lastIndex){

            colArray[col] = num++

        }
        twoD[i] = colArray
    }

   //getting the values to print
    for (colArray in twoD){
        for (colValue in colArray){
            print(colValue)
            print(" ")
        }
        println("")
    }




}