package `19_arreglos`

fun main () {
    val arreglo = IntArray(10)
    for (i in arreglo.indices) {
        print("ingrese elemento:")
        arreglo[i] = readln().toInt()
    }
    println("primer componentes del arreglo $(arreglo[0])")
    println("ultimo componente de " + "arreglo ${arreglo[arreglo.lastIndex]}")
}