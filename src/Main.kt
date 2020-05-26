
/**
 * documentation comments
 * You can reference things here , like the [main] function
 * You can also reference parameters, like the [arguments].
 *
 * @author Jane Waitara
 * */
fun main(arguments: Array<String>) {

    var myAge: Int = 21
    val name : String = "Jane"
    val lastname = "Waitara"
    val weight = 54.0

    println(name)

    println("I am $myAge years old")

    myAge += 1
    println("I am $myAge years old")

    println("$name $lastname am $myAge years old and weighs $weight kg")

    val  fullName = "$lastname, $name"
    println(fullName)

    val ageAsString: String = myAge.toString()
    println(ageAsString)

    val ageFromString =  "40".toInt()
    println(ageFromString)

    val nameLength = fullName.length
    println(nameLength)

    //This is s line comment

    /*
    * This is a multi-line comment
    * */

}