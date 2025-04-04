package `4_estructura_condicional_como_expresion`

/*
Solicita al usuario ingresar dos números
enteros (pueden ser negativos). Luego,
 determina cuál de los dos tiene mayor valor
  absoluto y muestra ese número en pantalla
 */
fun main() {
    print("ingrese un numero, puede ser negativo:")
    val v1 = readln().toInt()
    print("ingrese otro numero, tambien puede ser negativo:")
    val v2 = readln().toInt()
    val resultado = if (v1 > v2) {
        print("el $v1 es mayor que $v2")
    } else {
        val resultado = (v1 < v2)
        print("el $v2 es mayor $v1")
    }
}