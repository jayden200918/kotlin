package `7_estructura_repetitiva_while`

fun main() {
    var x = 1
    var sumaList1 = 0
    var sumaList2 = 0

    println("Ingrese 5 valores de la List 1:")
    while (x <= 5) {
        print("Valor $x: ")
        val valor = readln().toInt()
        sumaList1 += valor
        x += 1
    }

    x = 1
    println("Ingrese 5 valores de la List 2:")
    while (x <= 5) {
        print("Valor $x: ")
        val valor = readln().toInt()
        sumaList2 += valor
        x += 1
    }

    if (sumaList1 > sumaList2) {
        println("List 1 mayor.")
    } else if (sumaList2 > sumaList1) {
        println("List 2 mayor.")
    } else {
        println("List iguales.")
    }
}