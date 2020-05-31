package createClasses

/**
 * Classes - well define group of data
 *
 * Always represents the data defined in a class
 *      Properties - state of the class
 *      Methods - behaviour of the class - what the class does
 *
 * */

class Person(var name:String,var lastName: String ,var age: Int)

class Empty

fun main() {

    val jane = Person( "Jane","Waitara", 21)
    println(" Name: ${jane.name},\n Last Name: ${jane.lastName},\n Age: ${jane.age} \n")

    val lydiah = Person("Lydiah","Weru",47)
    println(" Name: ${lydiah.name},\n Last Name: ${lydiah.lastName},\n Age: ${lydiah.age} \n")


    val janeClone = jane

    janeClone.age = 24
    println(jane.age)
    println(janeClone.age)

    var janeTwo = Person( "Jane","Waitara", 24)

    //comparing references
    println(jane == lydiah)
    println(jane == janeClone)
    println(jane === janeClone)
    println(janeTwo == jane)



}
