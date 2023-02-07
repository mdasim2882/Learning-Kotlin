class PersonDetails(val name: String, val rollNo: Int) {
    var area: Int = 0
        get() = field * field
        set(value) {
            field = value
        }


}
fun main() {
    val personDetails = PersonDetails("Asim", 5)
    personDetails.area = 6
    println(personDetails.area)

}