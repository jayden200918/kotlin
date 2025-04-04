package `4_estructura_condicional_como_expresion`

/*
Solicita al usuario que ingrese tres valores enteros positivos que representan los lados
de un triángulo. Valida primero que puedan formar un triángulo (la suma de dos lados debe ser mayor al tercero).
Si es válido, guarda en una variable el tipo de triángulo usando una expresión if:
"Equilátero" si los tres lados son iguales.
"Isósceles" si dos lados son iguales.
"Escaleno" si todos los lados son distintos.
 Imprime el tipo de triángulo o un mensaje de error si no forman uno válido.

 */
fun main() {
    print("Ingrese el primer lado:")
    val l1 = readln().toInt()
    print("Ingrese el segundo lado:")
    val l2 = readln().toInt()
    print("Ingrese el tercer lado:")
    val l3 = readln().toInt()
    if (l1 + l2 > l3) {
        if (l1 == l2 && l2 == l3)
            print("Es Equilatero")
        else if (l1 == l2 || l2 == l3|| l1==l3)
            print("Es Isósceles")
        else
            print("Es Escaleno")
    }
}