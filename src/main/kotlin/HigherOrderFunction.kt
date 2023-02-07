fun main() {
    val c = 3

    // Higher order function
    val fn: (Double, Double) -> Double = ::sum
    // Can also be written as => val fn: (a: Double, b: Double) -> Double = ::sum
    println(fn(3.0, 5.0))

    // Using higher order function as a parameter
    calculator(5.0, 7.0, ::sum)
}

fun sum(a: Double, b: Double): Double = a + b

// Can also be passed as => gn:(Double,Double)-> Double
fun calculator(a: Double, b: Double, gn: (x: Double, y: Double) -> Double) {
    var res = gn(a, b);
    println("result = $res")
}