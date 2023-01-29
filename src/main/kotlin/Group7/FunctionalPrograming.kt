package Group7

fun main() {
    Program.fibonacci(5, { n -> println(n)})
    Program.fibonacci(5) { println(it)}
    Program.fibonacci(5, {println(it)})
    Program.fibonacci(5, ::println) //This is called "Function Reference"
}

interface Process {
    abstract fun showOnScreen(n: Int): Unit
}

class Program {

    companion object {

        fun fibonacci(limit: Int, action: (Int) -> Unit) {

            var prev = 0
            var prevprev = 0
            var current = 1
            for (i: Int in 1..limit) {
                action(current)
                val temp = current
                prevprev = prev
                prev = temp
                current = prev + prevprev
            }   
        }
    }
}


