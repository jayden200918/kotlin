package `24_POO_colaboraciones_clases1`
class Motor(var encendido: Boolean){
    fun encender(){
        encendido = true
        println("El motor esta encendido")
        println("puede conducir")
    }
    fun apagar(){
        encendido = false
        println("El motor esta apagado")
        println("No puede conducir")
        encender()
    }
    fun estado(){
        if (encendido == true){
            println("El estado del motor es encendido")
        }else{
            println("El estado del motor es apagado")
        }
    }
}
class Carro{
    val motor: Motor = Motor(false)

    fun conducir(){
        motor.apagar()
    }
    fun estadoGeneral(){
        motor.estado()
    }
}
fun main(){
    val carro = Carro()
    carro.conducir()
    carro.estadoGeneral()
}