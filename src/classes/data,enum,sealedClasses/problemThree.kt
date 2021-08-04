package classes.`data,enum,sealedClasses`

sealed class Person

class success() :Person()
class errore():Person()

fun handle(person: Person){
    when(person){
        is success -> {
            "great"
        }
        is errore -> {
            "lore"
        }
    }
}