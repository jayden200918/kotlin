package `11_estructura_condicional_when_argumento`

fun main() {
    print("ingrese un valor entero positivo comprendido entre" + "1 y 99999:")
    val valor = readln().toInt()
    when(valor) {
        in 1 .. 9 -> print("tiene un digito")
        in 10 .. 99 -> print("tiene dos digitos")
        in 100 .. 999   -> print("tiene tres digitos")
        in 1000 .. 9999 -> print("tiene cuatro digitos")
        in 10000 .. 99999 -> print("tiene cinco digitos")
        else -> print("no se encuentra comprendido el rango" + "indicado")
    }
}