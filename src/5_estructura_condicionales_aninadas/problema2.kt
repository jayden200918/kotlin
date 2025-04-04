package `5_estructura_condicionales_aninadas`
/*
Confeccionar un programa que permita cargar un número entero positivo de hasta
 tres cifras y muestre un mensaje indicando si tiene 1, 2, o 3 cifras. Mostrar un
  mensaje de error si el número de cifras es mayor.

 */
fun main(){
    print("ingrese primer numero:")
    val v1 = readln().toInt()

    val num = if (v1 <= 9) "tiene 1 cifras"
    else if (v1 <= 99) "tiene 2 cifras" else "3"
    if (num < 999.toString())
        print("error")
    else
    print("el numero tiene $num cifras")
}