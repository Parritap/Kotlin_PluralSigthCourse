package Group7

import java.math.BigInteger
import usefull.Classes.Person

//Are functions made for making the code more concise and readable while also
    //implementing some usefull functionalities.

fun main() {
    // USING LET
    // Let is used for preventing NullPointerExceptions

    var str: String? = null
    //println (str.reversed()) //This will print a NPE

    val myString : String? = "HOLA MUNDO!"

    myString?.let{ // This basically
        println(it.reversed())
    }

    val num : BigInteger = BigInteger("123456789")
    val x = MyScope().let{ //As this piece of code returns a String, x will be a String.
        return@let "This is a string that indicates a String value"
    }

    println (x::class.simpleName)

    val y = Person ("Valery" , 20, "Mexico").let{
        val str = "The person ${it.name} is ${it.age} years old and lives in ${it.city}"
        return@let str
        //This way y will of a String type and not a Person type.
    }
}

class MyScope (){
    val name : String = "MyScope"
}
