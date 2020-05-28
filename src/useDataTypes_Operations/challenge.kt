package useDataTypes_Operations

fun main() {

    /*
    *
    * Create several values describing yourself
    * Name , last name , nick name, country, age
    *
    * find your year of birth using your age and print out your data in the following format
    *
    * Note: If you are underage, omit your name and if you dont have nickname , remove it from the format
    *
    * Format:
    * "$name '$nick name' $lastNamee $born on year in $country"
    * */

    val myName = "Jane"
    val lastName = "Waitara"
    val nickName : String? = null
    val country = "Kenya"
    val myAge = 21

    val  nameToPrint = if (myAge < 18) "" else "$myName "
    val nickNameToPrint = nickName ?: ""


    val yearOfBirth =  2020 -myAge

    val userData = "$nameToPrint $nickNameToPrint $lastName, born on $yearOfBirth in $country"

    println(userData)
}