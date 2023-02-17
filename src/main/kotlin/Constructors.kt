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

class Add {
    var sum = 0

    constructor(a: Int, b: Int) {
        sum = a + b
        println("Sum of $a, $b = ${sum}")
    }

    constructor(a: Int, b: Int, c: Int) {
        sum = a + b + c
        println("Sum of $a, $b, $c = ${sum}")
    }

    constructor(a: Int, b: Int, c: Int, d: Int) {
        sum = a + b + c + d
        println("Sum of $a, $b, $c, $d = ${sum}")
    }
}

class W(a: Int, b: Int) {

    var f: Int = a
    var s: Int = b


    constructor(c: String, d: String) : this(0, 0) {
        println("$c  : $d")
    }

    constructor(c: String, d: Int) : this(0, 0) {
        println("$c  : $d")
    }

    fun display() {
        val d: W = W("John", "Doe")
        val e: W = W("Age", 25)

        println("$f, $s ")
    }
}


fun main() {
    Child()
    W(10, 20).display()
//    John  : Doe
//    Age  : 25
//    10, 20

    Add(2, 3, 4, 5) // Sum of 2, 3, 4, 5 = 14
    Add(2, 3, 4) // Sum of 2, 3, 4 = 9
    Add(2, 3) //Sum of 2, 3 = 5
}