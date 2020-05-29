package manageControlFlow

/*
*
*
* Simulate a game where you have to find the X in a matrix
*
* Step 1: Choose the matrix size. e.g 3x3
* Step 2: Create the matrix (Hint: You can create an Array<Array<String>> or a List<List<String>>)
*
*Step 3: Fill the matrix of your chosen size.While filling elements use the '.' symbol for all elements
*   except one of your choice - eg  element in the third row,second column in the matrix.
*   For that element , put out the X symbol
*
* Step 4: Create another nested loop which will find that element,  and once it does, print its matrix coordinates.
*   Once you print the coordinates out, stop iterating over the matrix
* * */

fun main() {

    var matrix = Array(5){Array(8){"."} }

  /*  //filling the matrix
    for (row in 0..matrix.lastIndex){

        var columnArray = Array(8){""}

        for (column in 0..columnArray.lastIndex){

            if (row == 2 && column == 1){
                matrix[row][column] = "X"
                continue
            }
            matrix[row][column] = "."
        }
    }*/

    matrix[2][1] = "X"

    for (row in matrix){
        for (column in row){
        print(column)
        }
        println("")
    }

    println("-----")

    //Step 4
    row@ for (row in 0..matrix.lastIndex){

        println("Searching in row $row")

       for (column in 0..matrix.lastIndex){
            if (matrix[row][column] == "X"){
            print(" Found X at: $row : $column")
            break@row
            }
        }
    }
}