package `25_POO_Modificadores_private_y_public`

class dado{
    private var valor : Int = 1

    public fun tirar(){
        valor = ((Math.random()*6)+1).toInt()
    }
    fun imprimir(){
        separador()
        println("valor del dato: $valor")
        separador()
    }
    private fun separador()= println("**************************")

}
fun main(){
    val dado1 = dado()
    dado1.tirar()
    dado1.imprimir()
}