package manageControlFlow

fun main() {


    val myAge = 21

   val message =  when(myAge){
        in 1..12 -> "Still a young boy"
        in 13..19 -> "Teenager"
        in 20..29 -> "In my twenties"
        in 30..39 -> "In my thirties"
        in 40..49 -> "In my forties"
        else -> "I am a wise lady"
    }

    println(message)

    val email: String? = "mail@gmail.com"

    val password: String? = "iLoveKotlin!"

    when{
        email == null || email.isEmpty() -> println("You need to choose an email! ")
        "@" !in email -> println("Your email is invalid")
        password ==null || password.isEmpty() -> println("You need to choose a password")
        password.length < 10 -> println("Password not strong enough")
        else -> println("Email length: ${email.length}, Password length: ${password.length}")
    }

    //challenge

    /*
    * Use a when expression to return which century an arbitrary year is from (as a string)
    * Cover at least the last three centuries and return "This was looong ago!" for others
    * The print out the returned value
    * Use ranges for year comparisons
    * */


    val year = 1904

    var century = when(year){
        in 1601..1700 -> "This was 17th century"
        in 1701..1800 -> "This was 18th Century"
        in 1801..1900 -> "This was 19th century"
        in 1901..2000 -> "This was 20th century"
        in 2001..2099 -> "This s 21st century"
        else -> "This was looooong ago!!"
    }
println(century)

}