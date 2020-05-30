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

    val authenticationHeaders = mapOf(
        "API_KEY " to " Your-api-key",
        "Authorization " to " auth token",
        "content/type " to " application/json"
    )
    println(authenticationHeaders)

}