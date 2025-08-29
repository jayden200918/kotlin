package `27_POO_DATA_class`

data class circulo (val x : Int, val y: Int, val radio: Int)
fun main(){
    val circulo1 = circulo(10, 3,40)
    val (centrox, centroy) = circulo1
    println(" puntos central del circulo($centrox, $centroy)")
}