package `7_estructura_repetitiva_while`

/*
Desarrollar un programa que permita la carga de 10
 valores por teclado y nos muestre posteriormente la suma
 de los valores ingresados y su promedio.
 */
fun main() {
    var x = 1
    var suma = 0
    while (x <= 10) {
        print("ingrese un valor")
        var valor = readln().toInt()
        suma = suma + valor
        x = x + 1
    }
    println("la suma de los 10 valores ingresados es $suma")
    val promedio = suma / 10
    println("el promedio es $promedio")
}