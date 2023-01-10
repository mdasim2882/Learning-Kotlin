import java.util.*

fun main() {


    // storing function as a variable c,d can be any variable name
    var fn: (c: Int, d: Int) -> Int = ::add
    println(fn(34, 6))

    // Arrays in Kotlin
    var arr: Array<Int> = arrayOf<Int>(1, 2, 3, 4)

    println(Arrays.toString(arr))
    arr[3] = 40
    println(Arrays.toString(arr))

    for ((i, e) in arr.withIndex())
        println("$i : " + e)
}

fun add(a: Int, b: Int): Int = a + b

fun mul(a: Int, b: Int): Int {
    return a * b;
}

fun printMessage(count: Int = 2) {
    var c = count
    c = 10
    for (i in 1..c) {
        println("Hello $i")
    }
}