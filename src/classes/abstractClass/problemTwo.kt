package classes.abstractClass

abstract class calculate {
    abstract fun calct(number1:Short,number2: Short):Short

}

class plus():calculate(){
    override fun calct(number1: Short, number2: Short): Short {
        return number1.plus(number2).toShort()
    }

}
class minus():calculate(){
    override fun calct(number1: Short, number2: Short): Short {
        return number1.minus(number2).toShort()
    }

}
class multiply():calculate(){
    override fun calct(number1: Short, number2: Short): Short {
        val multiply = number1 * number2
        return multiply.toShort()
    }

}

class dividedBy():calculate(){
    override fun calct(number1: Short, number2: Short): Short {
        val dividedby = number1 / number2
        return dividedby.toShort()
    }

}

fun main() {
    println("--------------------------")
    val plus = plus()
    println("${ plus.calct(5,6)}")
    println("--------------------------")

    val minus = minus()
    println("${ minus.calct(9,6)}")
    println("--------------------------")

    val multiply = multiply()
    println("${  multiply.calct(16,4)}")
    println("--------------------------")

    val dividedBy = dividedBy()
    println("${dividedBy.calct(120,3)}")
    println("--------------------------")


}