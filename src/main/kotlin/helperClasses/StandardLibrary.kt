package helperClasses

import java.util.*


fun List<Int>.sum(): Int {
    var result = 0
    for (i in this) {
        result += i
    }
    return result
}


fun check() {

    val sum = listOf(1, 2, 3).sum()
    println(sum)


    val list = TreeSet<Int>()
    list.add(4)
    list.add(1)
    list.add(6)


    println(list.javaClass)
    val q = """To code
        |or not to code?..""".trimMargin()
    val p = """
        Keep calm
        and learn Kotlin..""".trimIndent()
    println(q)
    println(p)
    println(list)
}

class Q {
    fun foo() = "member"
}

fun Q.foo(int: Int) = "extensions($int)"

fun String.get(i: Int) = '*'

fun main() {
    check()
    // Members can't be overriden but it can be overloaded,otherwis members wins
    // Overloading Kotlin members
    println(Q().foo())
    println(Q().foo(6))
    //Overriding
    println("abc".get(1))
}