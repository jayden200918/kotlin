package `27_POO_DATA_class  11`
//Un pequeño cine quiere llevar el registro de las butacas que ya fueron vendidas para cada función. Cada butaca solo necesita guardar
// su número (1…N) y si está ocupada (true/false)
//Tarea para los estudiantes
//Declarar un data class llamado Butaca con dos propiedades:
//numero: Int
//ocupada: Boolean
//En main() construir una lista con 5 butacas (números 1..5) inicialmente libres (ocupada = false).
//Simular la venta de 2 butacas: elegir al azar dos números distintos y marcarlas como ocupadas (ocupada = true).
//	Pista: usar random y un simple bucle para buscar el número.
//Imprimir la lista completa de butacas usando println() y observar cómo se ve la salida por defecto del data class.
//Volver a imprimir, pero ahora recorriendo la lista con un for y desestructurando las propiedades (número, ocupada) para mostrar un mensaje amigable:
//“Butaca 3 → libre” o “Butaca 3 → ocupada”.
//Hacer una copia de la lista antes de vender y comparar ambas listas con == para verificar que son distintas referencias.
// Sobreescribir toString() para que devuelva “Butaca #X” seguido de “(libre)” o “(ocupada)”.//

import kotlin.random.Random

class dado(var num1 : Int){
    fun lanzar(){
        num1 =  ((Math.random()*6)+1).toInt()
        println(num1)
    }


}
data class butaca (var butacas : Boolean, var num: Int)
    fun main() {
        var butaca1 = butaca (true, 1)
        var butaca2 = butaca(false , 2)
        var butaca3 = butaca(false ,3)
        var butaca4 = butaca(true, 4)
        var butaca5 = butaca(true , 5 )
    }
