package useDataTypes_Operations

fun main() {
    val myName = "Waitara"
    var nickName : String?= null
    val lastName : String? = null

    println(nickName)

    nickName = "mumbi"

    val nickNameLength = nickName?.length?.toDouble() //safe call operators

    println(nickNameLength)

    //nell check



    if (lastName != null){
        println("My last name is ${lastName.length} characters long)")
    }else {
        println("I dont have a last name")
    }

    //safe call operator
    if (nickName?.isEmpty() == true){
        println("You dont have a nickname.It's length is ${nickName.length}")
    }

    val notNullNickname = requireNotNull(nickName)
    println(notNullNickname.length)

    //elvis operator
    val myLastName = lastName ?: myName
    println(myLastName)

    val lastBirthDayYear = 2020
    val myAge : Int? = 21

    val myAgeNotNull = myAge ?: return
    val yearOfBirth = lastBirthDayYear - myAgeNotNull
    println("I was born in  $yearOfBirth")

}