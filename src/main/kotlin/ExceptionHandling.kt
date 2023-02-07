fun main() {
    val arr = arrayOf(1,4,5);
    val n:Int = arr.size

    for( a in arr)
        print( "$a ");

    try {
        println(arr[3])
    }
    catch (e: Exception){
        println()
        println(e.message)
    }
    finally {
        println("Done...")
    }

}