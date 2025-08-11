package `25_POO_Modificadores_private_y_public`

class operaciones{
    private var valor1: Int = 0
    private var valor2: Int = 0

    fun cargar(){
        print("ingresar el primer valor:")
        valor1 = readln().toInt()
        print("ingrese el segundo valor:")
        valor2= readln().toInt()
        sumar()
        resta()
    }
    private fun sumar(){
        val suma = valor1 + valor2
        println("la suma de $valor1 y $valor2 es de $suma")

    }
    private fun resta(){
        val resta= valor1 - valor2
        println("la resta de $valor1 y $valor2 es de $resta")

    }

}
fun main(){
    val operaciones1 = operaciones()
    operaciones1.cargar()
}