package operatorOverloading

fun main() {
    val kesir = kesir(1, 2)
    val kesir2 = kesir(1, 2)

    val result = kesir + kesir2
    println("result : ${result}")
}

data class kesir(val pay: Int, val payda: Int) {
    operator fun plus(kesirler: kesir): kesir =
        if (this.payda == kesirler.payda) {
            kesir(this.pay + kesirler.pay, this.payda)
        } else {
            kesir(this.pay * kesirler.payda + kesirler.pay * this.payda, this.payda * kesirler.payda)
        }
}