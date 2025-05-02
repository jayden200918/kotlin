package `6_condiciones_compuestas_operadores_logicos`

fun main() {
    print("ingrese una fecha:")
    val num1 : Int = readln().toInt()
    if (num1 == 12)
        print("la fecha  $num1: navidad")
    else
        print("no es navidad")
}