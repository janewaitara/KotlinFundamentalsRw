package exploreMoreCollections

/*
* store key value pairs*/

fun main() {

    val videoGamesCollection = mutableMapOf<String,MutableList<String>>()

    println(videoGamesCollection)

    videoGamesCollection.put("Action", mutableListOf("Dark Souls","Into the bad Lands"))
    println(videoGamesCollection)

    val actionsGames = videoGamesCollection["Action"]
    println(actionsGames)
    val strategyGames = videoGamesCollection["Strategy"]
    println(strategyGames)

    //immutable map
    val authenticationHeaders = mapOf(
        "API_KEY " to " Your-api-key",
        "Authorization " to " auth token",
        "content/type " to " application/json"
    )
    println(authenticationHeaders)

    //---

    //adding using put in the idiomatic square syntax
    videoGamesCollection["Strategy"] = mutableListOf("Heroes of might and magic 3")
    println(videoGamesCollection)

    //adding values to a mutable collection value directly
    videoGamesCollection["Strategy"]?.add("Civilisation VI")
    println(videoGamesCollection)

    //removing an entire key-value pair
    val removedActionGames = videoGamesCollection.remove("Action")
    println(removedActionGames)
    println(videoGamesCollection)
    println("")

    /**
     * MUTABILITY
     *  Referential mutability
     *      Can or can not change the reference of an value.
     *      You can not change the reference of any property with a val keyword
     *
     * Internal mutability
     *      This is changing a specific value while maintaining the structure(size and reference) of an array
     *      Eg. changing the value of a certain index of an val array
     *
     * Content mutability
     *      eg a val map, can not change the reference or internal structure
     *      if it has a mutable value, its possible to change its structure(of the mutable value within it)
     *
     * */


    videoGamesCollection["Strategy"]?.add("Command and conquer")
    videoGamesCollection["Shooter"] = mutableListOf("Doom")

    //iteration in maps
    for (key in videoGamesCollection.keys){
        println(key)
    }
    println("")

    for (value in videoGamesCollection.values){
        println(value)
    }
    println("")

    //iterating on the pairs

    for ((key,value) in videoGamesCollection){
        println("Video games in the $key genre you own are: $value")
    }



}