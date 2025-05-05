package `9_estructura_repetitiva_for`

fun main() {
    print("Ingrese la cantidad de puntos: ")
    val n = readLine()!!.toInt()

    var val1 = 0
    var val2 = 0
    var val3 = 0
    var val4 = 0

    for (i in 1..n) {
        print("Ingrese x: ")
        val x = readLine()!!.toInt()
        print("Ingrese y: ")
        val y = readLine()!!.toInt()

        if (x == 0 || y == 0) {
            println("El punto está sobre un eje, no se cuenta.")
        } else if (x > 0 && y > 0) {
            val1++
        } else if (x < 0 && y > 0) {
            val2++
        } else if (x < 0 && y < 0) {
            val3++
        } else if (x > 0 && y < 0) {
            val4++
        }
    }

    println("Primer cuadrante: $val1")
    println("Segundo cuadrante: $val2")
    println("Tercer cuadrante: $val3")
    println("Cuarto cuadrante: $val4")
}