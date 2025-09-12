package `28_POO_Enum_class`

enum class tipocarta{
    DIAMANTE,
    TREBOL,
    CORAZON,
    PICA
}
class carta(val tipo: tipocarta, val valor: Int){
    fun imprimir(){
        println("carta: $tipo y su valor es $valor")
    }
}
fun main(){
    val carta1 = carta(tipocarta.PICA, 4)
    carta1.imprimir()
    val carta2 = carta(tipocarta.TREBOL, 4)
    carta1.imprimir()
}