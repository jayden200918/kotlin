package `27_POO_DATA_class`

data class Jugador(val nombre : String){
    var puntos: Int = 0
}
fun main() {
    val jugador1 = Jugador("JAYDEN")
    val jugador2 = Jugador("pedro")
    jugador1.puntos = 10
    jugador2.puntos = 20
    if (jugador1 == jugador2)
        println("tienen el mismo nombre")
    else
        println("no tienen ek mismo nombre")
}