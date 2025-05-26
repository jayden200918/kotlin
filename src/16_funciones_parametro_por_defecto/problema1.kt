package `16_funciones_parametro_por_defecto`

fun suma(v : Int = 2, subinicial : Int = 0, v2 : Int = 0 ): Int {
var resultado = subinicial + v2
    for (i in 1 .. v ) {
        println("ingrese un valor:")
        val num = readln().toInt()
        resultado += num
    }
    return resultado

}
fun main() {
    print("ingrese de 2 a 5 valores:")
    print("cuantos digitos quiere ingresar:")
    val num = readln().toInt()
    val resultado = suma(num)
    println("la suma de todos los numeros es:$resultado")
}