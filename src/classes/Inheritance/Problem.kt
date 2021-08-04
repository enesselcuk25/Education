package classes.Inheritance

open class animal(color: String, age: Int) {
    init {
        println("Color is : $color")
        println("Age is : $age")
    }
}

class dog(color: String, age: Int) : animal(color, age) {

    infix fun woof(name: String) {
        println("$name maked sound of woof ")
    }

}

class horse(color: String, age: Int) : animal(color, age) {
    infix fun neigh(name: String) {
        println("$name maked sound of neigh")
    }
}

fun main() {
    val Dog = dog("white", 4)
    Dog.woof("poll")

    val Horse = horse("red", 6)
    Horse.neigh("bediha")

}