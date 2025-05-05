package `9_estructura_repetitiva_for`

fun main() {
    print("Ingrese la cantidad de triángulos: ")
    val n = readLine()!!.toInt()

    var equilateros = 0
    var isosceles = 0
    var escalenos = 0

    for (i in 1..n) {
        println("Ingrese los tres lados del triángulo $i:")
        print("Lado1: ")
        val lado1 = readLine()!!.toInt()
        print("Lado2: ")
        val lado2 = readLine()!!.toInt()
        print("Lado3: ")
        val lado3 = readLine()!!.toInt()

        when {
            lado1 == lado2 && lado2 == lado3 -> {
                println("Triángulo $i: Equilátero")
                equilateros++
            }
            lado1 == lado2 || lado2 == lado3 || lado1 == lado3 -> {
                println("Triángulo $i: Isósceles")
                isosceles++
            }
            else -> {
                println("Triángulo $i: Escaleno")
                escalenos++
            }
        }
    }

    println("Resumen de los triángulos:")
    println("Equiláteros: $equilateros")
    println("Isósceles: $isosceles")
    println("Escalenos: $escalenos")
}
