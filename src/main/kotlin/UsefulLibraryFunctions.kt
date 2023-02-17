package helperClasses

import java.util.*

fun main() {

    var s = "Mohd Asim"
    //  public inline fun <T, R> T.let( block: (T) -> R): R
    val x:Int = s.let {
        // Last value becomes the return type of x
        println("In let block") // In let block
        println(it) // Mohd Asim
        4
    }

    //  public inline fun <T> T.apply( block: T.() -> Unit): T
    val y: String = s.apply {
        // No matter what we specify in this block,
        // it will always return Unit by default
        // or we can say like void function in JAVA
        println("In apply block") //In apply block
        8
    }
    println(y) // Mohd Asim

    // public inline fun <T> T.also( block: (T) -> Unit ): T
    val z: String = s.also {
        // Similar to apply, but it accepts parameter instead of calling
        // with implicit this receiver
        println("In also block") //In also block
    }
    println(z) // Mohd Asim


    // public inline fun <T, R> T.run( block: T.() -> R): R
    val p: Int = s.run {
        this.uppercase()
        println("In run block") // In run block
        4
    }
    println("s = $s") // s = Mohd Asim
    println(p) // 4

    s = s.uppercase()
    println("s = $s") // s = MOHD ASIM
}