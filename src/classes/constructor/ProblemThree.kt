package classes.constructor

class Person(name: String, age: Byte) {
    val firstName: String
    val personAge: Byte

    init {
        firstName = name
        personAge = age

        println("first Name : $firstName")
        println("person Age  : $personAge ")
    }
}

fun main() {
    val person = Person("Kasım", 26)

}