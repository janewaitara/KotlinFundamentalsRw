package exploreMoreCollections

/*
* Create a list of items on your desk
* if any item appear more than once, add it again
*Convert the list in to a set
* Remove an item you dont need
*iterate over the set and print the items
*  */

fun main() {
    val deskItems = listOf("Pen","Bible","Bottle","Book","Watch","Pen","Card","Book","Tooth Brush","Tissue","Glass")

    val setItems = deskItems.toMutableSet()

    println(setItems)

    println(setItems.remove("Pen"))

    for (item in setItems){
        println(item)
    }

}