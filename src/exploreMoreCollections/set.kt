package exploreMoreCollections

/**
 *
 * Set holds unique values, can't have the same item twice
 * can not fetch data in a set
 * used to store data and can be accessed in loops
* */

fun main() {

    val userIds = setOf("ID1","ID2","ID3","ID4")

    println(userIds)



    println(userIds.contains("ID7"))
    println("ID2" in userIds)

    //changing elements in a set

    val mutableIds = userIds.toMutableSet()

    println(mutableIds.add("ID2"))
    println(mutableIds)

    //adding values
    println(mutableIds.add("ID5"))
    println(mutableIds)

    //removing values
    println(mutableIds.remove("ID2"))
    println(mutableIds)

    //iterating in sets

    for (userId in mutableIds){
        println(userId)
    }

    val names = arrayOf("Phillip","John","Jane","Lydiah","Hellen","Lydiah")
    val uniqueNames = names.toSet()

    println(uniqueNames)


}