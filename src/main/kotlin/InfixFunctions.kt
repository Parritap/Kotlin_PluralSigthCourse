

fun main(args : Array<String>) {

    val h1  = Header("h1")
    val h2  = Header("h2")
    val h3  = h1.plus(h2)
}


class Header (var name:String)

fun Header.plus (other : Header) : Header{
    return Header(this.name  + other.name)
}

