@file:JvmName ("ProgramKT")


fun main() {
    printMyName(lastName = "Parra Parra", firstName = "Juan Esteban")
}

fun sayHello () = println ("Hi, Im Kotlin and I am fun!")

fun log (message : String, logLevel : Int = 1) = println ("$message and log level is: $logLevel")

@JvmOverloads
fun printMyName (firstName: String, lastName : String  = "[...]") = println ("$firstName $lastName")