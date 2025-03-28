package `2_entrada_de_datos`

/*
Realizar un programa que lea por teclado cuatro
valores numéricos enteros e informe su suma y promedio.

 */

fun main() {
    print("ingrese un numero")
    val v1: Int = readln().toInt()
    print("ingrese un segundo numero")
    val v2: Int = readln().toInt()
    print("ingrese un tercer numero")
    val v3: Int = readln().toInt()
    print("ingrese un cuarto numero")
    val v4: Int = readln().toInt()
    val suma = v1 + v2 + v3 + v4
    val promedio = suma / 4
    println("el promedio es: $promedio")
}