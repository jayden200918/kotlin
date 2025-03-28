package `2_entrada_de_datos`

fun main () {
    print("ongrese la medida del lado del cuadrado:")
    val lado: Int = readln().toInt()
    val perimetro: Int = lado * 4
    println("el perimetro del cuadrado es $perimetro")
}