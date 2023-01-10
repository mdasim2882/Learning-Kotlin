fun main() {

    val a = D("Danish", 1221)
    a.myShow()
    a.show()
    a.display()
}

abstract class C{

//    abstract val name: String
//    abstract val id: Int



    abstract fun display()
    fun show()= println("Just show here !!!")

}

class  D( nameParam: String,  idParam : Int):C()
{

    val name= nameParam
    val id = idParam

    override fun display() {
        println("I'm displaying text... $name - $id")
    }

    fun myShow() = println("Just myShow here !!!")
}
