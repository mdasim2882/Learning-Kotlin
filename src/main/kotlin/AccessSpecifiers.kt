

open class AccessSpecifiers {
    protected val x = "ProtectedMemebr"
    private val d = "PrivateMember"
    internal val myVariable = "InternalMember" // Allowed anywhere in the Module
}
val w = "Private Top Level Declaration" // Allowed within File only
class DC : AccessSpecifiers(){
    val  y = x
//    val  z = d  Private Member is not accessible in this sub-class
    val  z = w
    val  m= myVariable
    fun display() = println(" $y \n $z \n $m")
}
fun main() {
    DC().display()
}


