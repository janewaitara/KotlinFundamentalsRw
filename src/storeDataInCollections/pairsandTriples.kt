package storeDataInCollections

fun main() {

    val fullName = Pair("Jane", "Waitara")


    //accessing the data in a pair using: the access properties defined in a pair
    println("My name is ${fullName.first} ${fullName.second}")

    //using structuring
     val (firstName, lastName) = fullName
    println("My name is $firstName $lastName")


    val birthday = Triple(12,1,1999)
    val person = Pair("Jane Waitara", birthday)

    val nameUsingOrdering = person.first
    val birthDayUsingOrdering = person.second

    val (myName, bDay)= person
    val (day, month,_) = bDay //using _ omits values you do not care about

    val yearOfBirth = bDay.third
    println("$myName was born on $day/$month , year is unknown")


    //challenge
    /*
    * Create a Pair which hold info about a bank Account.
    * BA needs to have a credit card connected to It, balance
    * CC should have a card number , security code ad the type of the card(e.g visa or masterCard)
    *
    * print out the data of the bank Account while hiding the security coe
    * */

    val creditCard = Triple(1254,"jkl","Visa")
    val bankAccount = Pair(creditCard, "300000")

    val (creditCardDetails,balance ) = bankAccount
    val (cardNumber, securityCode , cardType ) = creditCardDetails


    println("Your $cardType card, number $cardNumber has a balance of $balance")

}