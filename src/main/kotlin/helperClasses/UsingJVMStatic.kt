package helperClasses

fun main() {

    val x = MyClass.f()
    val y = MyClass.MyObject1.g();
}

class MyClass {
    // Only one companion is allowed
    companion object MyObject {
        @JvmStatic
        fun f():Boolean {
            println("Hello I'm F of object")
            return true
        }
    }

    object MyObject1 {
        fun g() {
            println("Hello I'm G of object")
        }
    }
}