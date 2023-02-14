package helperClasses

fun main() {


    val d = Day.MONDAY

    val l = Day.values()
    for (e in l) {
        print("$e -> ")
        e.formattedDay()
    }
    /*  OUTPUT OF ABOVE CODE
     MONDAY -> It is 1 day of the week
     TUESDAY -> It is 2 day of the week
     WEDNESDAY -> It is 3 day of the week
     THRUSDAY -> It is 4 day of the week
     FRIDAY -> It is 5 day of the week
     SATURDAY -> It is 6 day of the week
     SUNDAY -> It is 7 day of the week
    */

    // Specifying manual data type(val tile:Tile) is necessary
    // to use "when" without else block
    val tile: Tile = Red("Mushroom", 30)

    val points = when (tile) {
        is Blue -> tile.points * 20
        is Red -> tile.points * 5
    }

    println(points)

}

enum class Day(val number: Number) {
    // Used for declaring constant values
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THRUSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    fun formattedDay() {
        println("It is ${this.number} day of the week")
    }
}


// Sealed class is used here to reference same class with objects of different type
sealed class Tile
class Red(val type: String, val points: Int) : Tile()
class Blue(val points: Int) : Tile()



