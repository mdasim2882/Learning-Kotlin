interface Check<T> {
    fun get(idx: List<T>)
}

fun <T> List<T>.filterring(predicate: (T) -> Boolean): List<T> {
    val arr = mutableListOf<T>()
    for (e in this)
        if (predicate(e)) arr.add(e)

    return arr
}


fun main() {
//    val l = listOf(1, 2, 3, 4, 5, 6)
//    val res = l.filterring { it -> it % 2 == 0 }
//    println(res)

    repeat(5){
        println("hello $it")
    }
}