package funcation

fun main() {
callMe { println("merhaba") }

    print("1.sayı giriniz")
    val number1 = readLine()!!.toInt()

    print("2.sayı giriniz")
    val number2 = readLine()!!.toInt()

    numberSum(number1,number2) { sum ->
        println("result : $sum")
    }


    foo("enes"){
        it.reversed()
    }
}
fun callMe(func: () -> Unit){
    func()
}
fun numberSum(number1: Int,number2: Int, sum: (sum: Int) -> Unit){

    val result = number1.plus(number2)
    sum(result)



}
/*----------------------------------------------------------------------------------------------------------------------------*/

fun foo(str:String,fuc:(String) -> String){
    var x = fuc(str)
    println(x)
}
/*----------------------------------------------------------------------------------------------------------------------------*/


