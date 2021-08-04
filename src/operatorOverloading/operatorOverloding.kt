package operatorOverloading

data class PairNumber(val numberOne: Int, val numberTwo: Int) {  //birinci değişkeni ifade ediyor
    operator fun minus(pairNumber: PairNumber): PairNumber {   // ikinci değişkeni ifade ediyor
        val returnPairObject = PairNumber(
            numberOne - pairNumber.numberOne,
            numberTwo - pairNumber.numberTwo
        )

        println("result : ${returnPairObject.numberOne}, ${returnPairObject.numberTwo}")

        return returnPairObject
    }
}

fun main() {
    val pairNumberOne = PairNumber(8, 5)
    val pairNumberTwo = PairNumber(5, 9)

    val result = pairNumberOne - pairNumberTwo
}