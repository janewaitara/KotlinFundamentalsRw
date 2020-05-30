package exploreMoreCollections
/**
 * Can be used as a data Type and assigned to a variable
 * */

fun main() {


    val email: String? = "email@mail.com"
    val password: String? = "password"


    fun validateString(input: String?, inputType: String) =
        if (input == null || input.isEmpty()){
            false
        }else if (inputType == "Password"){
            input.length >= 10
        }else if (inputType == "Email"){
            input.contains("@")
        }else{
            println("Can not verify this input")
            false
        }

    /**
     * Lambdas / anonymous functions - barebone signature
     *      (parameters) -> ReturnType e.g (Int) -> Boolean
     *             a function that takes int parameters and return a boolean
     *
     *    It is a function without a name
     *
     * */

    fun validateString(input: String?, validator: (String) -> Boolean) =
        if (input == null || input.isEmpty()){
            false
        }else{
            validator(input)
        }


    validateString("Hello World","Welcome message")

    val isValidEmail = validateString(email, "Email")
    println(isValidEmail)

    //function reference (::)
    val isValidPassword = validateString(password, ::validatePassword) //{ input -> input.length >= 10 }
    println(isValidPassword)

    val passwordValidator = ::validatePassword
    println(passwordValidator)

    val validator: (String) -> Boolean = {  input ->
        input != null && validatePassword(input)
    }
    println(validator)
}

fun validatePassword(password: String) = password.length >= 10