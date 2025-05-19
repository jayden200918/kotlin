package `13_funciones_parametros`

fun motrarperimetro(lado : Int){
    val perimetro = lado * 4
    println("el perimetro es $perimetro")


}
fun mostrarsuperficie(lado: Int) {
    val superficie = lado * lado
    println("quiere calcular el perimetro o la" + "superficie[ingrese texto: perimetro/superficie]")
    var respuesta = readln()
    when (respuesta) {
        "perimetro" -> motrarperimetro(lado)
        "superficie" -> mostrarsuperficie(lado)
    }
}