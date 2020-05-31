package createClasses

/*
*
* Change the class from the first challenge to be a data class instead & make sure the class is immutable
*
* Create a copy of a certain object you created and compare it for data equality and identity(reference quality)
*
* Destructure the object ans use the properties to print out its data
*
*
* */
data class MyMovie(
    val movie:String ,
    val genre: String,
    val length: Int)

fun main() {
    val movie1 = MyMovie("Into the BadLands", "Action", 54)
    println(movie1)

    val movie2 = movie1.copy(movie = "BlackList")
    println(movie1 == movie2) // data equality
    println(movie1 === movie2) //object equality

    val (movie: String, movieType: String, length: Int) = movie1
    println(" \n Your movie: $movie \n Movie type is: $movieType \n It's length is: $length \n ")

}