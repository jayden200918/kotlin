package `8_`

/*
Realizar un programa que acumule (sume) valores ingresados por
 teclado hasta ingresar el 9999 (no sumar dicho valor, indica que
 ha finalizado la carga). Imprimir el valor acumulado e informar si
 dicho valor es cero, mayor a cero o menor a cero.
 */
fun main() {
    var suma = 0
    var valor = 0

    do {
        print("ingrese un valor entre 0 y 9999:")
        val valor = readln().toInt()
        if (valor != 9999){
            suma += valor
        }
    } while (valor != 9999)
    println("la suma  acumulada: $suma")
    if (suma > 0)
        println("el valor es mayor a 0")
    else if (suma < 0)
        println("el valor es menor a 0")
    else
        println("el valor es igual a 0")
}