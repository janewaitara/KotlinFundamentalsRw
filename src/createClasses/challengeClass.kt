package createClasses

/*
* Create a class which represents a Movie, a video Game or a Song
* Add appropriate properties to the class
*
* To those classes, add methods which format the properties in a string for you to print oyt
* Remember to add visibility modifiers where applicable, and get the methods if needed
*
* Create a few objects of the class type, and print out their formatted data
*
* */

class Movie(
    private var name:String ,
    private var genre: String,
    private var length: Int){

    fun printMovie(): String{
        return " Movie name: $name, \n Movie Type: $genre, \n Movie Length: $length \n"
    }
    fun changeLength(length: Int){
        this.length = length
    }

}

fun main() {
    val movie1 = Movie("Into the BadLands", "Action", 54)
    println(movie1.printMovie())

    val movie2 = Movie("BlackList","Investigative",720)
    println(movie2.printMovie())

    movie2.changeLength(1102)
    println(movie2.printMovie())
}