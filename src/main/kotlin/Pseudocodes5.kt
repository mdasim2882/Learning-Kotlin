class Card {
    fun display() = println("Hello world!")

    companion object {
        fun show() = println("Show here!")
        @JvmStatic fun testing()= println("Testing JvmStatic here!!!")
    }
}

fun main() {
/* Refer Test.java for output:
    Hello world!
    Show here!
    Testing JvmStatic here!!!*/
}