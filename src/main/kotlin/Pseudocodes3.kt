fun main() {
    val f: ((Int, Int) -> Int)? = { x: Int, y: Int -> x + y }

    val res = f?.invoke(3,4)
    println(res)
}