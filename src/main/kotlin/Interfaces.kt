fun main() {

    dragObjects(arrayOf( Circle(5.0), Square(2.0), Player("Travis")) )

}

// Using interfaces to depict common behavior of unrelated class
fun dragObjects(objects: Array<Draggable>) {
    for (obj:Draggable in objects) {
        obj.drag()
    }
}

interface Draggable {
    fun drag()
}

abstract class Shape() : Draggable {
    abstract fun area(): Double
}

class Circle(val radius: Double) : Shape() {
    override fun area(): Double {
        return Math.PI * radius * radius;
    }

    override fun drag() {
        println("Circle is Dragging")
    }
}

class Square(val a: Double) : Shape() {
    override fun area(): Double {
        return a * a;
    }

    override fun drag() {
        println("Square is Dragging")
    }
}


class Player(val name: String) : Draggable {
    override fun drag() {
        println("$name is dragging")
    }
}
