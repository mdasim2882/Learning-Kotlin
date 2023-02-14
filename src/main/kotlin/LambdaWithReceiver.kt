
fun main() {
    val s = buildString {
        append("Alphabet : ")
        for (c in 'a'..'z')
            append(c)
    }

    println(s is String)
    println(s)
}