package classes.abstract

abstract class Person(name: String) {
    init {
        println("my name is $name")
    }

    fun displaySSn(ssn: Int) {
        println("my ssn is $ssn")
    }

    abstract fun displayJob(description: String)
}

class Teacher(name: String) : Person(name) {
    override fun displayJob(description: String) {
        println(description)
    }

}

fun main() {
    val name = Teacher("enes")
    name.displayJob("I'm a android developer  ")
    name.displaySSn(465465)
}