fun main() {


    val arr = arrayOf(Circle(3.0), Player("Smiley"), Animal())
    for (a in arr) {
        if (a is Circle)
            println(a.area())
        else if (a is Player)
            (a.drag())
        else
            (a as Animal)

    }


}







interface Draggabled {
    fun drag()
}

abstract class Shaper() : Draggabled {
    abstract fun area(): Double
}

class Circled(val radius: Double) : Shaper() {
    override fun area(): Double {
        return Math.PI * radius * radius;
    }

    override fun drag() {
        println("Circle is Dragging")
    }
}


class Players(val name: String) : Draggabled {
    override fun drag() {
        println("$name is dragging")
    }
}

class Animal {}
