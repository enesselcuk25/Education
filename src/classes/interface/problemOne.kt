package classes.`interface`


interface calculate {
    val number1: Byte
    val number2: Byte


    infix fun firstName(name: String) = println("name : $name total's :  ${number1.plus(number2)}")

}

class total : calculate {
    override val number1: Byte
        get() = 2
    override val number2: Byte
        get() = 4


}

fun main() {
    val Total = total()
    Total.firstName("enes")

}