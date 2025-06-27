package `20_funciones_tipo_arreglo`

fun cargar1(): IntArray{
    println("cuantos sueldos quiere cargar:")
    val cantidad = readln().toInt()
    val sueldo = IntArray(cantidad)
    for (i in sueldo.indices){
        println("imgrese elemento:")
        sueldo[i] = readln().toInt()
    }
    return sueldo
}

fun imprimir2(sueldos: IntArray) {
    println("Listado de todos los sueldos")
    for (sueldo in sueldos)
        println(sueldo)
}
fun main() {
    val sueldos = cargar1()
    imprimir2(sueldos)
}