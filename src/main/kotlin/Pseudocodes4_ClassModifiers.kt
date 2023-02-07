class Foo(val first: Int, val second: Int)
data class Bar(val first: Int, val second: Int)
// Functions in data modifier
// - equals(), copy(), hashCode(), toString()

fun main() {
    val f1 = Foo(1, 2)
    val f2 = Foo(1, 2)
    val f3 = f1
    println(f1 == f2) // false
    println(f3 == f1) // true as referring to same memory location
    println(f1 === f2) // false

    val b1 = Bar(1, 2)
    val b2 = Bar(1, 2)
    println(b1 == b2)   // true
    println(b1 === b2)   // false

    val set1 = setOf<Int>(1, 2, 3)
    val set2 = setOf<Int>(1, 2, 3)
    println(set1 == set2)   // true
    println(set1 === set2)  // false
}