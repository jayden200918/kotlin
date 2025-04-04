package `4_estructura_condicional_como_expresion`

/*
Solicita al usuario que ingrese su edad. Almacena una descripción
 en una variable usando una expresión if:
Si es menor de 13, asigna "Niño".
Si está entre 13 y 17 inclusive, asigna "Adolescente".
Si es 18 o más, asigna "Adulto".
Luego, imprime la descripción correspondiente.

 */
fun main() {
    print("ingrese su edad:")
    val edad = readln().toInt()
    val resultado = if (edad < 13) {
        print("el es niño")
    } else {
        val resultado = if (edad >= 13) {
            print("el es adolecente")
        } else {
            val resultado = if (edad > 18) {
                print("el es mayor de edad ")
            } else {
            }
        }
    }
}
