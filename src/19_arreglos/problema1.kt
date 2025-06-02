package `19_arreglos`

/*
Desarrollar un programa que permita ingresar un arreglo de 8 elementos enteros, e informe:
El valor acumulado de todos los elementos.
El valor acumulado de los elementos que sean mayores a 36.
Cantidad de valores mayores a 50.
(Definir dos for, en el primero realizar la carga y en el segundo proceder a analizar cada elemento)

 */
fun main() {
    val numeros= IntArray(8)
    for (i in 0 until numeros.size) {
        print("Ingrese elemento : ")
        numeros[i] = readln().toInt()
    }
    var suma = 0
    var Mayores36 = 0
    var Mayores50 = 0
    for (i in 0 until numeros.size) {
        suma += numeros[i]
        if (numeros[i] > 36) {
            Mayores36 += numeros[i]
        }
        if (numeros[i] > 50) {
            Mayores50++
        }
    }

    println("la Suma de elementos son: $suma")
    println("la cantidad de  elementos mayores a 36 son: $Mayores36")
    println("la Cantidad de valores mayores a 50 son: $Mayores50")
}
