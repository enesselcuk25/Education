package basic


fun main() {
    println("do you student")
    val student= readLine()?.toString()

    val result:String = if (student == "yes"){
        "i student"
    }else{
        "i not student"
    }

    println(result)
}