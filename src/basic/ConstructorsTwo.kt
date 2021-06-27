package classes.basic



 class person(val name:String ,val surname:String ,val age:Short){


}

fun main() {
    val person :person = person("enes","peker",21)
    println("firstname : ${person.name}")
    println("surname : ${person.surname}")
    println("age : ${person.age}")

}