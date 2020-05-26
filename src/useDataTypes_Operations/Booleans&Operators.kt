package useDataTypes_Operations

fun main() {

    val isProgrammingAwesome = true
    println("Is programming awesome?  $isProgrammingAwesome")

    val myAge = 21
    val isLegalDriving = myAge >= 18
    println(isLegalDriving)

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
    println(isNameEmpty)



}