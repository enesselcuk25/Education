package basic

fun main() {
    val firstCharOfName: Char = 'G'
//    val firstCharOfName2 : Char = "G"
//    val firstCharOfName3: Char = 'Gö'
    val charNumber: Char = '6'
//    val charNumber2: Char = '53'

//
//    val contertedCharNumber = charNumber.toInt()
//    println("charNumber = $charNumber")
//    println("charNumber = $contertedCharNumber")
//
//    val totalValue = charNumber.toInt() * contertedCharNumber
//    println("totalValue = " +  totalValue)
//
//    val uniCode = '\uFF00'
//
//    println("uniCode" + uniCode)
//
//    val numberVersion:String = "value "+(5+89+5)
//    println(numberVersion)

//    val number = 1.until(100)
//    print(number)
//
//    val number2 :IntRange = 10 until 1
//    number2.first
//    number2.last
//    number2.step
//
//    println(number2)

//    returnLabel@ for(value in 1..50){
//        for(value2 in 0..10){
//            if(value2 == 5){
//                continue@returnLabel
//            }
//
//            println("continue  : $value2")
//        }
//    }

    returnLabel@ for (value in 1.rangeTo(100)){
        for(valueOne in 1.rangeTo(10)){
            if(valueOne == 5){
                break@returnLabel
            }
            println("break : $valueOne  ")
        }
    }

    println("does you final note ")
    val number = readLine()?.toInt()









}