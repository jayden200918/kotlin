package `22_POO_Costructor3`

    class triangulo1(var lado1: Int, var lado2: Int, var lado3: Int) {

        fun ladoMayor() {
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
    val triangulo1 = triangulo1(2,2,2)
    triangulo1.ladoMayor()
    triangulo1.esEquilatero()
}