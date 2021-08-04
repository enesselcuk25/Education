package classes.constructor

class person1(name: String, surname: String, age: Byte) {
    val firstName: String
    val surnamee: String
    val agee: Byte

    init {
        firstName = name
        surnamee = surname
        agee = age

        println("name : $firstName  surname : $surnamee agee : $agee")
    }
}

fun main() {
    val person = person1("selami", "peker", 33)

}