package algoritmik

fun main() {


    print("i başlangıç sayı giriniz: ")
    val read1 = readLine()?.toInt()

    print("i bitiş sayı giriniz: ")
    val read2 = readLine()?.toInt()

    print("k başlangıç sayı giriniz: ")
    val read3 = readLine()!!.toInt()

    print("k bitiş sayı giriniz: ")
    val read4 = readLine()!!.toInt()

    if (read1 != null) {
        for(i in read1..read2!!){
                for (k in read3..read4){
                    println("result : $i x $k ->  ${i * k}")
                }
        }
    }





}