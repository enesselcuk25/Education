package algoritmik

fun main() {


    var array  = ArrayList<Int>()
    var sumSingle = 0
    var sumDouble = 0

    for (i in 1..5){
        print("$i. number : ")
        val number = readLine()!!.toInt()

        array.add(number)

    }

    for (i in array){

        if(i % 2 == 0){
            println(i)
            sumDouble+=i
        }
        else if(i % 2 != 0 ){
            println(i)
            sumSingle+=i
        }

    }
    println(" single numbers in the array $sumSingle  double numbers $sumDouble")

}








