package algoritmik

fun main() {


    val array = ArrayList<Int>()


    for (i in 1..5){
        print("$i. number ")
        val numbers = readLine()!!.toInt()

        array.add(numbers)


    }

   val reverse = array.asReversed()

    println(reverse)


}