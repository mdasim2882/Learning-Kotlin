package helperClasses

fun main() {
    val p1 = Person( 1, "John",  "London");
    val p2 = Person(2, "John", "London");
    val p3 = p2.copy(3);

    println(p1)
    println(p2)
    println(p3)
    val (a, b, c) = p1


    println("$a $b $c")
}

data class Person(var id: Int, var name: String, var city: String) {

}