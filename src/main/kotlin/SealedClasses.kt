
sealed class AnimalEvent {
    class Idle : AnimalEvent()
    class Watching (val person : Person) : AnimalEvent()
    class Asleep (val minutes : Int) : AnimalEvent()
}

fun handleAnimalEvent (e : AnimalEvent) : Unit =
    when (e){
        is AnimalEvent.Idle -> println("Animal is not moving")
        is AnimalEvent.Watching -> println("Animal is watching ${e.person.name}")
        is AnimalEvent.Asleep -> println("Animal will sleep for ${e.minutes} minutes")
    }

fun main ( args : Array<String>) {
    val event  = AnimalEvent.Idle();
    handleAnimalEvent(event);

    val myAnimalEvent2 = AnimalEvent.Watching(Person("Osma", "1234", 20))
    handleAnimalEvent(myAnimalEvent2)

    val myAnimalEvent3 = AnimalEvent.Asleep(10)
    handleAnimalEvent (myAnimalEvent3)


}