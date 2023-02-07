fun main() {
    var list = listOf(1, 2, 3, 4, 5)
    list = list.asReversed()
    val map = list.associate { ('a' + it) to (10 * it) }

//    println("map $map")
//    println("list = $list" )

    // FLATTEN LIST
    val l1 = listOf(1, 2, 3)
    val l2 = listOf(4, 5, 6)
    val l3 = listOf(7, 8, 9)

    val nestedList = listOf(l1, l2, l3)
    val flattenList = nestedList.flatten()
    println("NESTED LIST = $nestedList")
    println("FLATTEN LIST = $flattenList")


    println()
    // FLAT MAP

    val testList = listOf("abc", "def");
    val flatList = testList.flatMap { it -> it.toList() }
    println(flatList)
}