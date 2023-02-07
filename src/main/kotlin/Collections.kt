fun main() {

    // Mutable List
    val arr = mutableListOf<Int>(1, 4, 5)
    arr[2] = 6
    println(arr)

    // Immutable List
    val arr2 = listOf<Int>(6, 7, 9);
    // arr2[2] = 12 =>  throws an exception
    println(arr2)


    // Mutable Map
    val mMap = mutableMapOf<Int, String>()
    mMap.put(1, "John")
    mMap.put(2, "Smith")
    mMap.put(3, "Paul")
    println(mMap[3])
    println(mMap)

    // Mutable Map
    val imMap = mapOf<Int, String>(1 to "Ron", 2 to "Sam")
    println(mMap[2])
    println(imMap)

    //Iterating a mMap
    for ((k, v) in mMap)
        println("$k -> $v")

}