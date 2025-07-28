package `22_POO_Costructor22123`

class rectangulo (var base : Int, var altura : Int) {
    init {
        if (base <= 0)
            base = 1
        if (altura <= 0)
            altura = 1
    }

    fun area() {
        val area = base * altura / 2
        println("el area es $area")
    }

    fun escuadrado() {
        if (base == altura) {
            println("es un cuadrado ")
        }else{
            println("es un rectagulo comun ")
        }
    }
}
fun main(){
    val rectangulo1 = rectangulo(0,0)
    rectangulo1.area()
    rectangulo1.escuadrado()
}