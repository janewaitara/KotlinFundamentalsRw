package useDataTypes_Operations

fun main() {

    val isProgrammingAwesome = true
    println("Is programming awesome?  $isProgrammingAwesome")

    val myAge = 18
    val isLegalDrivingAge = myAge >= 18
    println(isLegalDrivingAge)

    val ageTim = 27
    val isTimOlder = ageTim > myAge
    println(isTimOlder)

    val yearOfBirth = 1999
    val isBornInTwentiethCentury = yearOfBirth < 2000
    println(isBornInTwentiethCentury)

    val strangerName = "Tim"
    val  myName = "Jane"
    val isSameName = strangerName == myName
    println(isSameName)

    val areNamesDifferent = strangerName != myName
    println(areNamesDifferent)

    println(!areNamesDifferent) //inverting values or flipping

    val firstObject = Any()
    val secondObject = Any()
    println(firstObject === secondObject) //identity /reference equality / triple equal operator
    println(firstObject !== secondObject)

    val isNameEmpty = myName.isEmpty()
    println("$isNameEmpty\n")

   /*
   * Challenges
   * Check and store in a Boolean if a password is secure
   * password is secure if it has at least 10 characters
   * check is two people have the same name length
   *
   * */

    val password = "Jane1234"
    val isPasswordSecure  = password.length >= 10
    println(isPasswordSecure)

    val isNameLengthSame = myName.length == strangerName.length
    println(isNameLengthSame)


}