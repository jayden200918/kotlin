package `24_POO_colaboraciones_clases22232`

 import kotlin.random.Random
class Dato(var valor: Int) {
    fun tirar(){
        this.valor = Random.nextInt(1)
        imprimir()
    }
    fun imprimir(){
        println("valor del dado : $valor")

    }
}
class Juegodatos{
    val dado1 = Dato(1)
    val dado2 = Dato(1)
    val dato3 = Dato(1)
    fun jugar(){
        dado1.tirar()
        dado2.tirar()
        dato3.tirar()
        if (dado1.valor == dado2.valor&&dado2.valor==dato3.valor)
            println("gano")
        else
            print("perdido")

    }
}
fun main(){
    val juego1 = Juegodatos()
    juego1.jugar()
}