package `19_arreglos`

fun main() {
    val arreglo = IntArray(10)
    for (i in arreglo.indices) {
        print("ingrese elemento:")
        arreglo[i] = readln().toInt()

    }
    for (elementos in arreglo)
        print(elementos)
    for ((indice, elemento) in arreglo.withIndex())
        print("en el indice $indice se almacena el " + "elemento $elemento")
    val sueldos = arrayOf<Double>(1200.0, 1700.50, 6000.0)
    for (i in sueldos.indices)
        print("${sueldos[i]}")
    val altura = arrayOfNulls<Float>(3)
    altura[0] = 1.72f
    altura[1] = 1.79f
    altura[2] = 1.67f
    for (indice in 0..altura.size - 1) {
    }
}