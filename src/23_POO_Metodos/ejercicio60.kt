package `23_POO_Metodos1`

class Operaciones{
    var valor1: Int = 0
    var valor2: Int = 0

    fun cargar(){
        print("ingrese primer valor:")
        valor1 = readln().toInt()
        print("ingrese segundo valor:")
        valor2 = readln().toInt()
        sumar()
        restar()
    }
    fun sumar(){
        val suma = valor1 + valor2
        println("la suma de $valor1 y $valor2 es $suma ")
    }
    fun restar(){
      val resta = valor1 - valor2
        println("la resta de $valor1 y $valor2 es $resta")
    }
}
fun main(){
    val operaciones1 = Operaciones()
    operaciones1.cargar()
}