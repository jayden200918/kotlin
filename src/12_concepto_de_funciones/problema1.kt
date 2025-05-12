package `12_concepto_de_funciones`

/*
Desarrollar un programa con dos funciones. La primera solicite el
 ingreso de un entero y muestre el cuadrado de dicho valor. La segunda
 que solicite la carga de dos valores y muestre el producto de los mismos.
 Llamar desde la main a ambas funciones.
 */
fun cuadrado() {
    print("ingrese un numero entero:")
    val cua = readln().toInt()
    val resul = cua * 2
    println("el valor del cuadrado es:$resul")

}
fun producto() {
    print("ingrese un valor: ")
    val valor1 = readln().toInt()
    print("ingrese el segundo valor:")
    val valor2 = readln().toInt()
    val result = valor1 * valor2
    println("la multiplicacion es:$result")
}
fun main() {
    cuadrado()
    producto()
}