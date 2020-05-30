package exploreMoreCollections

/*
* Create a map where each key is the name of a pet you have /had , the value is the animal type that pet is
* Add the values to the map , then remove a value, and finally iterate over the map, printing out the entries
* */

fun main() {

    val petMap = mutableMapOf<String, String>()
    petMap["pus"] = "cat"
    petMap["Kairo"] = "cow"
    petMap["doggy"] = "dog"

    println(petMap)

    petMap.remove("Kairo")

    println(petMap)

    for ((key,value) in petMap){
        println("$key is in the genre of a $value")
    }



}