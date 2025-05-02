package `7_estructura_repetitiva_while`

/*
Confeccionar un programa que pida ingresar por teclado la cantidad de piezas
 a procesar y luego ingrese la longitud de cada perfil; sabiendo que la pieza
  cuya longitud esté comprendida en el rango de 1.20 y 1.30 son aptas. Imprimir
  por pantalla la cantidad de piezas aptas que hay en el lote.
 */
fun main() {
    print("cuantas piezas procesara ")
    val n = readln().toInt()
    var x = 1
    var cantidad = 0 // vatiable contadoa
    while (x <= n ) {
        print("ingrese la medida de la pieza")
        val largo = readln().toDouble()
        if (largo >= 1.20 && largo <= 1.30)
            cantidad = cantidad + 1
        x = x + 1
    }
    print("LA CANTIDAD DE PIEZAS APTAS SON: $cantidad")
}