package algoritmik

fun main() {
  val sums = aVeryBigSum(arrayOf(12345789))
    println(sums)
}

fun aVeryBigSum(ar:Array<Long>):Long {
    var sum = 0L

    for (number in ar){
        sum += number
    }


    return sum
}