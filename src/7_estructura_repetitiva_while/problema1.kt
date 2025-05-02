package `7_estructura_repetitiva_while`

/*
Escribir un programa que solicite ingresar 10 notas de
alumnos y nos informe cuántos tienen notas mayores o iguales
 a 7 y cuántos menores.
 */
fun main() {
    print("Ingrese las notas ")
    var mayor1 = 0
    var menor1 = 0
    var x = 0
    while (x <= 9) {
        println("ingrese una nota")
        var nota = readln().toInt()
        if (nota >= 7) {
            mayor1 = mayor1 + 1
        } else
            menor1 = menor1 + 1
        x = x + 1
        nota = 0
        print("las notas mayores son $mayor1")
        print("las notas menores son $menor1")
    }
}
