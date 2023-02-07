


fun main() {

    var gender: String? = null

    if (gender != null) {
        gender.uppercase()
        println(gender)

    }

    // Safe call operator "?" - which calls uppercase() iff gender is not null
    gender?.uppercase()
    println(gender)    // prints null

    // Allowing execution of multiple statements after nullity check
    gender?.let {
        println("String = $it")
        println("value = $gender")
        println("Done");
    }

    // Using Elvis operator to specify "NA" in case of null
    var selectedValue = gender ?: "NA"

    //Kind of assert operator -> non-null asserted(!!) operator

    var value = gender!!.uppercase() // it will throw NullPointerException

}

