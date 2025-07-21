package `21_POO_conceptos`

class triangulo {
    var lado1: Int = 0
    var lado2: Int = 0
    var lado3: Int = 0

    fun inicializar2() {
        print("Ingrese lado1:")
        lado1 = readln().toInt()
        print("Ingrese lado2:")
        lado2 = readln().toInt()
        print("Ingrese lado3:")
        lado3 = readln().toInt()
    }

    fun  ladoMayor() {
        print("Lado mayor:")
        when {
            lado1 > lado2 && lado1 > lado3 -> println(lado1)
            lado2 > lado3 -> println(lado2)
            else -> println(lado3)
        }
    }

    fun esEquilatero() {
        if (lado1 == lado2 && lado1 == lado3)
            print("Es un triangulo equilatero")
        else
            print("No es un triangulo equilatero")
    }

}

fun main() {
    val triangulo1 = triangulo()
    triangulo1.inicializar2()
    triangulo1.ladoMayor()
    triangulo1.esEquilatero()
}