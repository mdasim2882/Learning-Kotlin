fun main() {
    val a:A = A("D",1331);
    val b :A= B("E",1441)

    a.display()
    b.display()
}

open class A(nameParams:String, userID: Int) {

    open val name: String = nameParams
    open val id: Int = userID

    fun myMethod() = println("Calling myMethod1 ....")
    open fun display() = println("Name = $name, Id = $id")
}

class B(s: String, i: Int) : A(s,i) {

    fun myMethod2() = println("Calling myMethod2 ....")
    override fun display() = println("Name = $name, Id = $id")
}
