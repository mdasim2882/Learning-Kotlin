import java.util.*

fun main(args: Array<String>) {

    var num = arrayOfNulls<Int>(5)
    var read = Scanner(System.`in`)
    println("Enter array values")
    for (i in 0..4) {
        num[i] = read.nextInt()
    }
    val x: String;
    println("Enter any text: ");
    read.nextLine();
    x = read.nextLine();
    println(x)

    for (x in num) {
        println(x)
    }
}