package `4_estructura_condicional_como_expresion`

/*
ingrese por teclado un valor entero
almacenar en otra variable el cuadrado de
dicho numero si el valor ingresado es par,
en caso que sea impar guardar el cubo.

 */
fun main() {
    print("ingrese un valor entero:")
    val valor = readln().toInt()
    val resultado = if (valor % 2 == 0) {
        print("cuadrado:")
        valor * valor
    } else {

        print("cubo:")
        valor * valor * valor
    }
    print(resultado)
}