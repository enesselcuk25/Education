package funcation

fun main() {

    val average = Student().Score()
}

fun Student.Score():Double {

    print("vize Score :")
    val vize = readLine()!!.toByte()

    print("final Score : ")
    val final = readLine()!!.toByte()

    val resultVizeFinal = student(vize,final)
    return resultVizeFinal
}

class Student {

    fun student(vize:Byte,final:Byte) : Double {

        val result:Double = (vize * 0.4) + (final * 0.6).toInt()

        if(result<=100 && result >= 85 ){
            println("yeah you are great. Score : $result")
        }
        else if(result<=84 && result >=70){
            println("good Score : $result")
        }
        else if(result<=69 && result >=60){
            println("Normal Score : $result")
        }
        else if(result<=59 && result >=50){
            println("bad Score : $result")
        }
        else if(result<=59 && result >=50){
            println("you have to work. Score : $result ")
        }
        else{
            println("Wrong")
        }


        return result
    }

}

