package createClasses

/**
 * Encapsulation is abstracting away information
 *
 * Composition is combining state and behavior of two or more classes
 *
 * Modifiers: Public
 *            Private
 *            Internal
 *            Protected
 * */

class Pet(var name: String,var animalType: String)

class People(private var name: String,
             private var lastName: String,
             private var age: Int,
             val pet: Pet){

    //secure against irrational mutability

    fun setAge(age: Int){
        if (age in 0..150){
            this.age = age
        }else{
            //invalid age
        }
    }

    fun getAge () = age

    fun getFullInformation(): String{
        return "Full Name: $lastName, $name , Age: $age, Pet: ${pet.name}, ${pet.animalType}"
    }


}

fun main() {

    var dog = Pet("doggy","German Shepherd")
    val jane = People("Jane", "Waitara", 21, dog)
    println(jane.getFullInformation())

    jane.setAge(24)
    println(jane.getAge())


    dog.name = "Shiba"
    //accessing pets name
    println(jane.pet.name)

    dog = Pet("Scratchy", "Normal Dog")
    println(jane.pet.name)


}