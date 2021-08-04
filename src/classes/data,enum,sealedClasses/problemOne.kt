package classes.`data,enum,sealedClasses`



 enum class animals(val foot: Byte) {
    dog(4), cat(4), horse(4), cow(4), goose(2)
}

fun main() {

    println("can you enter the name of the animal")
    val Animals = readLine()?.toString()

    val animal = if (Animals == animals.cow.toString() ){
        animals.cow.foot
    }
    else if(Animals == animals.dog.toString()){
        animals.dog.foot
    }
    else if (Animals == animals.cat.toString()){
        animals.cat.foot
    }
    else if(Animals == animals.horse.toString()){
        animals.horse.foot
    }
    else if(Animals == animals.goose.toString()){
        animals.goose.foot
    }else{
        println("error")
    }

    println(animal)

}