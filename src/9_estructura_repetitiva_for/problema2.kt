package `9_estructura_repetitiva_for`

fun main() {
    var suma = 0
    for (i in 1..10) {
        print("Ingrese un valor:")
        val valor = readln().toInt()
        if (i > 5)
            suma = suma + valor
        }
        println("la suma de los ultimos 5 digitos es : $suma")
    }
