package `10_estructura_condicional_when`

fun main() {
    /*
    Se ingresa por teclado un valor entero, mostrar una leyenda
     por pantalla que indique si el número es positivo, nulo o negativo.
     */
    var valor = 0
    print("ingrese un numero:")
    val num = readln().toInt()
    when {
        num > 0 -> print("positivo")
        num < 0 -> print("negativo")
        else -> print("nulo")
    }
}