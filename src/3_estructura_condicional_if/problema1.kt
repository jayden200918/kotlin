package `3_estructura_condicional_if`

/*
Se ingresan tres notas de un alumno, si el promedio es
 mayor o igual a siete mostrar un mensaje "Promocionado".
 */
fun main() {
    print("ingrese un valor:")
    val v1 = readln().toInt()
    print("ingrese un valor ")
    val v2 = readln().toInt()
    print("ingrese un valor")
    val v3 = readln().toInt()
    val suma = v1 + v2 + v3
    val promedio = suma / 3

    if (promedio >= 7 ) {
        print("el mayor valor es: $promedio ")
    } else {
        print("el menor  valor es $promedio")
    }
}