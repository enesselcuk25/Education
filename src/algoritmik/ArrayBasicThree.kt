package algoritmik


import kotlin.math.abs

fun main() {
    val anArray = arrayOf(5,8,9,6,4,5)
  val sumOfArray = simpleArraySum(anArray)
    println(sumOfArray)
}

fun simpleArraySum(ar:Array<Int>):Int{
    var sum =  0

    ar.forEach {
        sum +=  it
    }



    return sum
}