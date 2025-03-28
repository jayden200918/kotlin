package `2_entrada_de_datos`

/*
se debe desarrollar un programa que pida el ingreso del precio
de un articulo y la cantidad que lleva el cliente
 y mostrar lo que debe abonar el comprador
 */

fun main() {
    print("ingrese el precio del producto:")
    val precio: Double = readln().toDouble()
    print("ingrese la cantidad de productos:")
    val cantidad: Int = readln().toInt()
    val total: Double = precio *cantidad
    println("el total en pagar el $total")
}