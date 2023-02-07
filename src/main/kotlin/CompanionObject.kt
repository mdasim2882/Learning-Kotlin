interface Factory<T> {
    fun create(s: String): T
    fun create(): T
}

class MyClassTest {
    private constructor()

    companion object : Factory<MyClassTest> {
        override fun create(s: String): MyClassTest {
            return MyClassTest()
        }

        override fun create(): MyClassTest {
            return MyClassTest()
        }
    }

    fun display() {
        println("Displaying object...")
    }
}

class MyClass private constructor(val data: String) {
    companion object : Factory<MyClass> {
        override fun create(s: String): MyClass {
            return MyClass(s)
        }

        override fun create(): MyClass {
            return MyClass("Default")
        }
    }

    fun display() {
        println("Displaying $data object...")
    }
}

fun main() {
    val myClass = MyClass.create("First")
    myClass.display() // Displaying First object...

     val myClassTest = MyClassTest.create()
    myClassTest.display() // Displaying object...



}