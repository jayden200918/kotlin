package `2_entrada_de_datos`

/*Escribir un programa en el cual se ingresan cuatro números enteros,
 calcular e informar la suma de los dos primeros y el producto del tercero y el cuarto.
 */

fun main () {
    print("ingrese un numero")
    val variable1: Int = readln().toInt()
    print("ingrese un segundo numero")
    val variable2: Int = readln().toInt()
    print("ingrese un tercer numero")
    val variable3: Int = readln().toInt()
    print("ingrese un cuarto numero")
    val variable4: Int = readln().toInt()
    val suma = variable1 + variable2
    val producto = variable3 * variable4
    println("la suma de $variable1 y $variable2 es $suma")
    println("El producto de $variable3 y $variable4 es $producto")
}