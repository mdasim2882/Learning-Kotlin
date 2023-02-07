enum class Gender {
    MALE,FEMALE
}

data class Hero(
    val name:String,
    val age: Int,
    val gender: Gender?)

fun main() {

    val heroes = listOf(
        Hero("The Captain", 60, Gender.MALE),
        Hero("Frenchy", 42, Gender.MALE),
        Hero("The Kid", 9, null),
        Hero("Lady Lauren", 29, Gender.FEMALE),
        Hero("First Mate", 29, Gender.MALE),
        Hero("Sir Stephen", 37, Gender.MALE),
    )

    val heroMap = heroes.map({ (f,s) -> (f to s) })
//    val heroMap = heroes.map({ it -> it })
//    println(heroMap)
    val allPossiblePairs = heroes
        .flatMap { first -> heroes.map { second -> first to second } }

    val (oldest,youngest) = allPossiblePairs
        .maxBy { it.first.age  - it.second.age} !!

//    val(o,y) = Pair(1,2)
//    println("$o to $y")
    println("oldest name = " + oldest.name)
    for (e in allPossiblePairs) {
        println("${e.first} -> ${e.second}")
    }

    println()
    for (e in heroMap) {
        println("${e.first} -> ${e.second}")
    }
}