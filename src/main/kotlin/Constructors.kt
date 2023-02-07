open class Parent {
    open val foo = 1
    open val d = 2

    init {
        println("Called init ${foo} : ${this.d}") // Called init 1 : 2
        println(foo) // 1
    }
}

class Child : Parent() {
    // Unexpected result on overriding property( foo in this case)
    // and then defining its value
    // Causing foo in init{} of Parent class to be 0
    //   override val foo = 2
}

fun main() {
    Child()
}