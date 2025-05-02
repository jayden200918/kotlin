package `6_condiciones_compuestas_operadores_logicos`
import kotlin.math.pow
fun main() {
    print("ingrese una numero:")
    val num1: Int = readln().toInt()
    print("ingrese una numero:")
    val num2: Int = readln().toInt()
    print("ingrese un numero:")
    val num3: Int = readln().toInt()

    if (num1 == num2 && num2 == num3) {
        val cubo = num1 * num1 * num1
        print("todos sus lados son iguales ")
    } else {
        print("los lados no son iguales ")
    }
}
