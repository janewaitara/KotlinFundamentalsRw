package useDataTypes_Operations

fun main() {

    val myAge = 12
    val country = "Kenya"


    val isLegalDriving = (myAge >= 18 && country == "Kenya")||(myAge >= 16 && country == "USA")
    println(isLegalDriving)

    if (isLegalDriving){
        println("You can drive")
    } else {
        println("You still have time to go")
    }

    if(myAge >= 18) println("I am an adult") else println("I'm still underage!")

    //if else as an expression

    val ageMessage = if (myAge >= 18) "I'm an adult" else "I'm still underage"
    println(ageMessage)

    println(if (myAge >= 18) "I'm an adult" else "I'm still underage")
}