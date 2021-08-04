package classes.abstractClass

abstract class School(val name:String,val lastName:String,val age:Byte){
    abstract val job: String

    init {
        println(" '\n'name : $name '\n'lastName : $lastName '\n'age : $age'\n'jobs: $job ")
    }
}

 class student(val namee: String,val lastname: String,val sAge: Byte):School(namee,lastname,sAge){
     override val job: String
         get() = "android developer"


 }

fun main() {
    val Jobs = student( "enes","selçuk",21)

}

