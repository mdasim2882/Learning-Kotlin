fun main() {

    // Parameters in Class Primary constructor and functions are final by default
    val automobile: Automobile = Automobile("Mustang", 4, 5, true);
    println(automobile)
    automobile.drive()

    println(sub(13, 7))

    var car: Car = Car("Ferrari", "Petrol")
    var car2: Car = Car("Lamborghini", 4, 2, "Diesel")

    println("car = $car") // car = Ferrari , 4, 5, Diesel

    println("Car2 = $car2") // Car2 = Lamborghini , 4, 2, Diesel

    car2 = car
    println("Car2 = $car2") // Car2 = Ferrari , 4, 5, Diesel

}

fun sub(a: Int, b: Int): Int = a - b


class Automobile(val name: String, val tyres: Int, val maxSeating: Int, hasAirBags: Boolean) {
    var airbags: Boolean = hasAirBags

    fun drive() {
        println("airbags = $airbags")
        airbags = false
        println("airbags = $airbags")
        println("$name is driving");
    }

    fun applyBrakes() {
        println("Applying brakes...");
    }

    override fun toString(): String {
        return "$name consists of $tyres tyres having seating capacity = $maxSeating"
    }
}

// Here, Car(..) is a primary constructor
class Car(val name: String, val tyres: Int, val maxCapacity: Int, val engineType: String) {
    // secondary constructor
    constructor(nameParam: String, engineType: String) : this(nameParam, 4, 5, "Diesel")

    override fun toString(): String {
        return "$name , $tyres, $maxCapacity, $engineType"
    }
}
