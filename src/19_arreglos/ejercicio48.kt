package `19_arreglos`

fun main () {
    val arreglo = IntArray(4)
    for (i in 0..arreglo.size - 1) {
        print("ingrese elemento:")
        arreglo[i] = readln().toInt()
    }
    var ordenado: Boolean = true
    for (i in 0..arreglo.size - 2) {
        val n1: Int = arreglo[i + 1]
        val n2: Int = arreglo[i]
        if (n1 < n2)
            ordenado = false
    }

    if (ordenado)
        print("los elementoes estan ordenados de menor a maayor:")
    else
        print("los elementos estan ordenados de mayor a menor:")
}
