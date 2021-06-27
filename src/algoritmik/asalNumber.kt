package algoritmik

fun main() {

    print("sayı giriniz : ")
    val asal = readLine()?.toInt()

    if(asal != null){
        
        for (i in 1..asal){
            if (asal.asalSayi()) {
                println("sayı asal sayıdır")
            }
            else{
                println("asal sayı değildir")
            }
        }
     
    }




}

fun Int.asalSayi():Boolean{
    for (i in 2..this){
        if(this % 2 == 0){
            return false
        }
    }
    return true
}