import java.util.*

fun main() {

    val vale: Person = Person("Valery", "11000");
    val enrique: Person = Person("Enrique", "11203103")

    val str = when (vale.age) {
        10 -> "Ten"
        20 -> "Twenty"
        else -> {
            "I cant guess the age"
        }
    }
    //println(str)

    val myException: String? = try {
        (vale.age).toString()
    } catch (e: Exception) {
        null
    }


  // for (i in 1..10){
  //     println (i)
  //

    val list = listOf(1,2,3,4,5)

    var ages = TreeMap<String, Int> ()

    ages["Kevin"] = 20
    ages["Valery"] = 21
    ages["Alejo"] = 19


    for ((name, age) in ages ){
        println ("$name is: $age")
    }




    for (i in list){
        println(i)
    }

}

fun infinitePrintingCicle() {
    var i = 0
    while (true) {
        println(i++)
    }

}