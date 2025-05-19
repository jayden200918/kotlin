package `13_funciones_parametros`

/*
Desarrolla un programa en Kotlin que le pide al usuario ingresar una clave dos veces.
El programa debe verificar si ambas entradas son iguales y mostrar un mensaje en consecuencia.

El programa consta de dos partes principales:
Una función llamada verificarClaves que recibe dos textos (las claves) y verifica si son iguales.


Una función principal main que pide al usuario que ingrese dos veces una clave y luego llama
 a verificarClaves para comprobar si ambas coinciden.
 */
fun verificarClaves() {
     print("ingrese una clave:")
    val clave1 = readln().toInt()
    print("ingre la segunda clave:")
    val clave2 = readln().toInt()
    if (clave1 == clave2)
        print("son iguales")
    else
        print("no son iguales")
}
fun main(){
    verificarClaves()
}