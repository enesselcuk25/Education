package classes.`interface`

interface Person {
    val name: String
    val lastName: String
    val age: Byte

    fun fullName() {
        println("$name $lastName $age")

    }

}

open class Calculate(number1: Short, number2: Short) {
    init {
        println("number 1 : $number1")
        println("number 2 : $number2")

        println("${number1.plus(number2)}")
    }
}

class Persons(number1: Short, number2: Short) : Calculate(number1, number2), Person {
    override val name: String
        get() = "kasım"
    override val lastName: String
        get() = "selçuk"
    override val age: Byte
        get() = 21

}

fun main() {
    val person = Persons(20, 20)
    person.fullName()
}

