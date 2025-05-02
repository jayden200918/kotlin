package `7_estructura_repetitiva_while`

fun main() {
    print("Escriba cuantos números ingresa:")
    val n = readln().toInt()
    var par = 0
    var impar = 0
    var x = 1
    while (x <= n) {
        print("Escriba el número :")
        val numero = readln(). toInt()
        if ( numero % 2 == 0){
            par = par + 1
        }else{
            impar = impar + 1
        }
        x = x + 1
    }
    println("Los números pares son $par")
    println("Los números impares son $impar")


}