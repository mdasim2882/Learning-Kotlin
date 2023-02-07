data class Point(val x: Int, val y: Int)

operator fun Point.plus(other: Point): Point {
    return Point(this.x + other.x, this.y + this.y + other.y)
}

fun main() {
    val a = 3
    val b = 4
    val x = a.plus(b)
    println(x) // 7

    val p = Point(1, 2)
    val q = Point(2, 3)
    val y = p.plus(q)
    println("Res = " + y) // Res = Point(x=3, y=7)

    val list = listOf(1, 2, 3)
    // create a new list, add 2 to it and return this newly created
    // list as a result.
    val newList = list + 2
    println(newList)    // [1, 2, 3, 2]
    println(list)   // [1, 2, 3]

    val mutableList = mutableListOf(1, 2, 3)
    val newMutableList = mutableList + 2
    println(newMutableList) // [1, 2, 3, 2]
    println(mutableList)    // [1, 2, 3]


    var list1 = listOf(1, 2, 3)
    val list2 = list1
    list1 += 4 // Here, reassignment is done on list1 only
    println("List1 = $list1") // List1 = [1, 2, 3, 4]
    println("List2 = $list2") // List2 = [1, 2, 3]

    val listCheck1 = mutableListOf(1, 2, 3)
    val listCheck2 = listCheck1
    listCheck1 += 4 // Here add() is called internally due to mutableList

    println("ListCheck1 = $listCheck1") // ListCheck1 = [1, 2, 3, 4]
    println("ListCheck2 = $listCheck2") // ListCheck2 = [1, 2, 3, 4]


}