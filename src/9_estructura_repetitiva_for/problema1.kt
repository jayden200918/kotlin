package `9_estructura_repetitiva_for`

fun main() {
    var altura = 0
    var base = 0
    var superficie12 = 0
    var superficie = 0
    print("ingrese un valor de la base:")
    val cant = readln().toInt()
    for (i in 1..cant) {
        print("ingrese la base del triangulo:")
        val base = readln().toInt()
        print("ingrese la altura de el triangulo:")
        val altura = readln().toInt()
        val superficie = base * altura / 2
        if (superficie >= 12) {
            superficie12++
        }
        println("base es : $base")
        println("altura es : $altura")
        println("superficie: $superficie")
    }
    println("la superficie en total es de: $superficie12")
}