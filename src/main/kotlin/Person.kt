open class Person(val name: String = "GenericPerson", val id: String = "0000", val age: Int = 20) {

    var address: String = "Calle 123"

    constructor(name: String, id: String, age: Int, address: String) : this(name, id, age) {
        this.address = address
    }
}

abstract class Persona(var primerNombre: String ,var segundoNombre: String) {

    open fun getName() = "$primerNombre $segundoNombre"
    abstract fun getAddress(): String
}


class Worker (primerNombre: String, segundoNombre: String,_workerID : Int, _wage: Int): Persona (primerNombre, segundoNombre) {

    val workerID : Int
    val wage : Int

    init { //Init blocks are the first to be executed after object of type CLASS is created.
        workerID = _workerID
        wage = _wage
        println ("Worker created: $workerID... $_wage" )
    }

    override fun getAddress(): String {
        TODO("Not yet implemented")
    }

}

fun main() {
    val worker = Worker(1, 1000)
    worker.primerNombre = "Valery"
    worker.segundoNombre = "Andrea"
}






