package algoritmik

fun compareTriplets(a:Array<Int>, b:Array<Int> ):Array<Int> {
    var scoreOfAlice = 0
    var scoreOfBob  = 0

    if (a[0]  > b[0]) scoreOfAlice +=1
    if(a[0]  < b[0]) scoreOfBob +=1
    if (a[1]  > b[1]) scoreOfAlice +=1
    if(a[1]  < b[1]) scoreOfBob +=1
    if (a[2]  > b[2]) scoreOfAlice +=1
    if(a[2]  < b[2]) scoreOfBob +=1

    return  arrayOf(scoreOfAlice , scoreOfBob)
}

fun main() {
    println(compareTriplets(arrayOf(5,6,7), arrayOf(3,6,10)))
}