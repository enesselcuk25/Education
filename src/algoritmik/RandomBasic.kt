package algoritmik

import kotlin.random.Random

fun main() {


    val array = List(5) { Random.nextInt(-20,20)}


    for(i in array){
        if(i>0){
            println("pozitive number $i ")

        }else{
            println("negative number $i")
        }

    }










}

