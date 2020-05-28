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

    val myEmail = "janewaitara99@gmail.com"
    val userName = "mumbiCodes"
    val myPassword = 12312455

    val dataIsValid =if (myEmail.isEmpty() || myPassword.toString().isEmpty() || userName.isEmpty() ) {
            "You must fill in your details"
        } else if ( !myEmail.contains("@") || !myEmail.contains(".")){
            "Invalid email format"
        }else if ( userName.length < 6){
            "Username must be atleast 6 characters"
        }else if (myPassword.toString().length < 10){
            "Password must be atleast 10 characters"
        }else{
            "The data is not valid"
        }

    println(dataIsValid)
}
