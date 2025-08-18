package `25_POO_Modificadores_private_y_public1`

import `20_funciones_tipo_arreglo`.suma
import `23_POO_Metodos22`.temperaturas

class sensortemperatura (){
    private var temp : Double = 0.0
    fun configtemp(){
        validarrango()
    }
    fun validarrango(): Boolean{
        println("ingrese una temperatura de -50 a 150 grados:")
        temp = readln().toDouble()
        if (temp > -51 && temp < 151) {
            println("la temperatura es $temp")
            return true
        }else{
                println("error")
            return false
            }

        }
    fun aumento(){
        println("ingrese delta:")
        val delta = readln().toInt()
        validarrango()
        temp  += delta
    }
    fun disminuir(){
        println("ingrese cuanto quiere restarle:")
        val delta = readln().toInt()
        validarrango()
        temp  -= delta
    }
    fun mostrar(){

        println("la temperatura es $temp")
    }
    }
fun main(){
    val temperatura1 = sensortemperatura()
    temperatura1.configtemp()
    temperatura1.aumento()
    temperatura1.disminuir()
    temperatura1.mostrar()
}