package `13_funciones_parametros`

fun main() {
    fun mostrarmensaje(mensaje: String) {
        println("********************************")
        println(mensaje)
        println("*******************************")

    }
    fun cargadorsumar() {
        print("ingrese un valor:")
        val valor1 = readln().toInt()
        print("ingrese el segundo valor")
        val valor2 = readln().toInt()
        val suma = valor1 + valor2
        println("la suma de los dos numeros es:$suma")


    }
    fun main() {
        mostrarmensaje("el programa calcula la suma de los valores por teclado")
        cargadorsumar()
        mostrarmensaje("gracias por utilizar este programa ")
    }
}