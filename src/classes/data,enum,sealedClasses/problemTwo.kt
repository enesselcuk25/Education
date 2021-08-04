package classes.`data,enum,sealedClasses`



 data class Student(val name:String,val age:Byte){
    override fun toString(): String {
        return "name: $name, age : $age"
    }
}

fun main() {
    val name = Student("enes",21)
    println(name)
}