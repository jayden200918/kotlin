package `6_condiciones_compuestas_operadores_logicos`

fun main() {
    println("Ingresa tres números")

    print("Núm1: ")
    val num1 = readLine()!!.toInt()

    print("Num2: ")
    val num2 = readLine()!!.toInt()

    print("Núm3: ")
    val num3 = readLine()!!.toInt()

    // Encontrar el mayor usando if como expresión
    val mayor = if (num1 >= num2 && num1 >= num3) {
        (num1)
    } else if (num2 >= num1 && num2 >= num3) {
        (num2)
    } else {
        (num3)
    }

    // Encontrar el menor usando if como expresión
    val menor = if (num1 <= num2 && num1 <= num3) {
        (num1)
    } else if (num2 <= num1 && num2 <= num3) {
        (num2)
    } else {
        (num3)
    }

    println("El mayor es: $mayor")
    println("El menor es: $menor")
}