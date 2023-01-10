fun main() {
    var calculator: Calculator = Calculator();

//    println("Add = ${calculator.add(6,5)}  : Multiply = ${calculator.multiply(5,4)}")

    val person = Person("Eravis", 43)
//    println("Name = " + person.name)
//    println(person.age)
    person.age = 13
    person.age = -3

//    println("Named = " + person.name
    person.name= "Eafael"
    println("Done Named = " + person.name)

}


class Calculator() {

    // Indicating that it'll be initialized later
    lateinit var message: String

    fun add(a: Int, b: Int): Int = a + b
    fun multiply(a: Int, b: Int): Int = a * b

}

class Person(nameParam: String, ageParam: Int) {
    var name: String = nameParam
        set(value) {
            println("called setter with " + value)
            if (value.startsWith("E"))
                field = "David"

        }
        get() {
            println("UpperCase ")
            return field.uppercase()
        }
    var age: Int = ageParam
        set(value) {
            println("Setting value.." + field)
            if (value > 0) {
                field = value
            } else
                println("Person age can't be negative.")
        }

    // Default Getter and Setter
    var message:String = ""
    get() = field
    set(value) { field = value}


}
