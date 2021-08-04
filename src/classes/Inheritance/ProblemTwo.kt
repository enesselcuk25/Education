package classes.Inheritance

//student's vize score and final score calculate code

open class Calculate(vize: Int, final: Int) {
    init {
        println("vize score : $vize")
        println("final score : $final")
        val calculate = (vize * 0.4) + (0.6 * final)
        println("$calculate")
    }
}

class firstStudent(vize: Int, final: Int) : Calculate(vize, final) {
    fun studentCalculate(name: String, surName: String) {
        println("student's name and surname : $name $surName")

    }
}

class secondStudent(vize: Int, final: Int) : Calculate(vize, final) {
    fun studentCalculate(name: String, surName: String) {
        println(" student's name and surname : $name $surName")
    }
}

fun main() {
    val FistStudent = firstStudent(60, 90)
    FistStudent.studentCalculate("bunyamin", "selçuk")

}