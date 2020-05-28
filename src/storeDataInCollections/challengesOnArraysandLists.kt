package storeDataInCollections

/*
* Create an array of your favorite games.any gane type
* Change an element within the array and print out the second game
*
* Transform the array to a list that can change its contents, add two more games you would like to play or finish
*
* Then remove the game you have played most recently
*
* print out the list of games you ended up with
* */

fun main() {

    val games = arrayOf("Cards", "Scrabble", "Charades", "StoryTelling")

    games[3] = "Kahoot"

    println(games[1])

    val gamesList = games.toMutableList()
    gamesList.addAll( listOf("Basketball","HandBall"))
    gamesList.remove("Kahoot")
    println(gamesList)


}