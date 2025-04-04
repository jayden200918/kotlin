package `5_estructura_condicionales_aninadas`
/*
Se ingresa por teclado un valor entero, mostrar una leyenda
que indique si el número es positivo, nulo(cero) o negativo.

}
 */
fun main() {
    print("ingrese un valor:")
    val v1 = readln().toInt()
    val num = if (v1 > 0) "positivo"
    else if (v1 < 0) "negativo" else "nulo"
    print("el numero es: $num")

}