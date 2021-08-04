package algoritmik

import java.lang.Math.abs

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    var diagonal1 = 0
    var diagonal2 = 0

    val n = arr.size
    for (i in 0 until n){
        diagonal1 += arr[i][i]
        diagonal2 += arr[i][n-i-1]
    }

    return  abs(diagonal1 - diagonal2)

}

fun main() {
    var a : Array<Int> = arrayOf(1,2,3)
    var b : Array<Int> = arrayOf(4,5,6)
    var c : Array<Int> = arrayOf(7,8,9)

    var m: Array<Array<Int>> = arrayOf(a, b, c)

println(diagonalDifference(m))

}