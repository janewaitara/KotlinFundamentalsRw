package writeFunctions

/*
* Challenge 1:
*
* Create a fun that takes in two parameter - a name and a last name
* Since not everyone has a last name, leave the lastName parameter to be an empty String if it is not passed in
* Then return how long the person's full name is.
*
* Challenge :
*
* OverLoad the function from the first challenge, by adding a list of Strings parameter, for the middle Name
* In case someone has one or more middle names
*
* Use the function to return the fullName length for a name with and without middle names
* Remember to use named arguments if needed
* */

fun main() {

    fun fullNameLength(firstName: String, lastName: String = "") = firstName.length + lastName.length

    println(fullNameLength("Jane"))


    fun fullNameLength(firstName:String, middleNames: List<String> = listOf(), lastName: String): Int{

          var middleNameLength :Int = 0
          for (name in middleNames){
              middleNameLength += name.length
          }
          return firstName.length + middleNameLength + lastName.length

    }

    println(fullNameLength(firstName = "Jane",lastName = "Waitara",middleNames = listOf("Mumbi","Wanjiru")))


}
