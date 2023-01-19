import java.math.BigInteger
import kotlin.math.pow
import kotlin.math.sqrt

class Geometry {

    fun main (args : Array<String>) {
       println(fib(1))
    }


    companion object{

        fun fib ( n : Int) {
            println ("0")
            fibAux(n, BigInteger("1"),BigInteger("0"))
        }

        fun fibAux (n : Int, mem : BigInteger, last: BigInteger ) : BigInteger {
            if (n==0) return mem
            println (mem)
            return fibAux (n-1, mem + last, mem)
        }
    }
}