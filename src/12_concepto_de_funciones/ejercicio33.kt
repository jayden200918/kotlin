package `12_concepto_de_funciones`

fun cargarsuma() {
    print("ingrese el primer valor:")
    val valor1 = readln().toInt()
    print("ingrese el segundo valor:")
    val valor2 = readln().toInt()
    val suma = valor1 + valor2
    println("la suma de los dos valores es:$suma")

}
fun separacion(){
    println("****************************")

}
fun main () {
    for(i in 1 .. 5 ) {
        cargarsuma()
        separacion()
    }
}