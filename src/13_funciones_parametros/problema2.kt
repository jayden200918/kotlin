package `13_funciones_parametros`

/*
Confeccionar una función que reciba tres enteros y los muestre ordenados
 de menor a mayor. En la función main solicitar la carga de 3 enteros por t
 eclado y proceder a llamar a la función ordenadrMayorMenor.
El algoritmo evalúa distintas combinaciones mediante estructuras condicionales
when y if/else, comparando los valores entre sí. Se trata de un ejemplo práctico para reforzar:
La entrada de datos desde consola.


Conversión de String a Int usando .toInt().


El uso combinado de when y if para resolver condiciones múltiples.


La impresión ordenada de los resultados.

 */
fun ordenarMayorMenor(num1: Int, num2: Int, num3: Int) {
    val menor: Int
    val medio: Int
    val mayor: Int

    when {
        num1 <= num2 && num1 <= num3 -> {
            menor = num1
            if (num2 <= num3) {
                medio = num2
                mayor = num3
            } else {
                medio = num3
                mayor = num2
            }
        }
        num2 <= num1 && num2 <= num3 -> {
            menor = num2
            if (num1 <= num3) {
                medio = num1
                mayor = num3
            } else {
                medio = num3
                mayor = num1
            }
        }
        else -> {
            menor = num3
            if (num1 <= num2) {
                medio = num1
                mayor = num2
            } else {
                medio = num2
                mayor = num1
            }
        }
    }

    println("Números ordenados de menor a mayor: $menor, $medio, $mayor")
}

fun main() {
    print("Ingrese un primer número: ")
    val num1 = readln().toInt()

    print("Ingrese un segundo número: ")
    val num2 = readln().toInt()

    print("Ingrese un tercer número: ")
    val num3 = readln().toInt()

    ordenarMayorMenor(num1 , num2 , num3)
}