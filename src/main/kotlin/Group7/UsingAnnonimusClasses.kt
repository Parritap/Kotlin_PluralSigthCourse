package Group7
import usefull.Classes.Person

//Abstract classes cannot be instantiated but, for example:

abstract class Doc(val title: String, val author: String, val words: Long) {
    abstract fun summary(): String
}

fun main() {
    //Doc ("Cien años de soledad", "Grabierl G Marquez", 10000) THIS WONT CCOMPILLE!!!

    //But if we do the following it will:

    val myDoc = object : Doc("Cien años de soledad", "Grabierl G Marquez", 10000) {
        override fun summary(): String {
            return "$title by $author has $words words"
        }
    } //Any object created with the "object" keyword is an anonymous object.
}