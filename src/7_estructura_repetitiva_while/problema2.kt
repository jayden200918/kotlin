package `7_estructura_repetitiva_while`

fun main() {
    print("ingrese las alturas:")
    val n = readln().toInt()
    var x = 1
    var suma = 0.0
    while (x <= n ) {
        print("ingrese una altura: ")
        val altura = readln().toDouble()
        suma = suma + altura
        x = x + 1
    }
    println("la suma de los 10 valores ingresados es $suma")
    val promedio = suma / n
    println("el promedio es $promedio")
}