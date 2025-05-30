package `19_arreglos`

fun main() {
    val sueldos: IntArray
    sueldos = IntArray(5)//se define 5 espacios del 0 al 4
    //carga de sus elementos por teclado
    for (i in 0..4) {
        print("ingrese sueldo:")
        sueldos[i] = readln().toInt()

    }
    //impresion de sus elementos
    for (i in 0..4) {
        println(sueldos[i])
    }
}