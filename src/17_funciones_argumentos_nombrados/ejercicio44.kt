package `17_funciones_argumentos_nombrados`

fun calcularsueldo(nombre: String,costohora: Double,
                   cantidadhoras: Int){
    val sueldo = costohora * cantidadhoras
    println("$nombre trabajo $cantidadhoras horas , se le paga"+"un sueldo de $sueldo")

}
fun main () {
        calcularsueldo("juan", 10.5, 120)
        calcularsueldo(costohora = 12.0, cantidadhoras = 40, nombre = "Ana")
        calcularsueldo(cantidadhoras = 90, nombre = "lucia", costohora = 7.25)
}
