package `2_entrada_de_datos`

fun main () {
    print("ingrese primer valor:")
    val valor1 = readln().toInt()
    print("ingrese sengundo valor:")
    val valor2 = readln().toInt()
    val suma = valor1 + valor2
    println("la suma de $valor1 y $valor2 es $suma")
    val producto = valor1 * valor2
    println("el producto de $valor1 y $valor2 es $producto")
}