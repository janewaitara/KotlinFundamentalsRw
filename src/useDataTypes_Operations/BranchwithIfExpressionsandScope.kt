package useDataTypes_Operations

fun main() {
    val myAge = 21
    println(if (myAge >= 18) "I'm an adult" else "I'm still underage")

    if (myAge >= 18){
        val country = "Kenya"

        if (country == "USA"){
            println("You can drive but not drink")

        }else if (country == "Kenya"){
            println("You can drink and drive but not at the same time")

        }
    }


    val yearOfBirth =  1999

    val generationCohort = if (yearOfBirth > 1964 && yearOfBirth < 1980 ){
        "Generation X"
    }else if (yearOfBirth > 1979 && yearOfBirth < 1995){
        "Millenial"
    }else {
        "Generation Z"
    }

    println(generationCohort)
}
