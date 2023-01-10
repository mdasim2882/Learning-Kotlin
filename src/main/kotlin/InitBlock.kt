fun main() {
    val a = Testing()
    val b = Testing()
    val c = Testing()
    val d = Testing()
}

class Testing {
    // Static Block in JAVA
    // Called only once when JVM loads the bytecode(.class) into memory
    // can't use this keyword in this block
    companion object {
        init {
            println("Hello there, I'm static block")
        }
    }

    // instance block in JAVA
    // Called each time when an instance of this class is created
    // can use this keyword in this block
    init{
        println("I'm an instance block")
    }

}
