package operatorOverloading

fun main() {
    var point = pointer(8, 9)
    ++point
    println("result : ${point.x} ${point.y}")


}

class pointer(var x: Int, var y: Int) {
    operator fun inc() = pointer(++x, ++y)
}





