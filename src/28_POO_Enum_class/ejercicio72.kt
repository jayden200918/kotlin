package `28_POO_Enum_class`

enum class Tipodeoperacion(val tipo: String){
    SUMA("+"),
    RESTA("-"),
    MULTIPLICACION("*"),
    DIVISION("/")

}
class operacion (val valor1: Int, val valor2: Int, val tipodeoperacion: Tipodeoperacion) {
    fun operar() {
        var resultado: Int = 0
        when (tipodeoperacion) {
            Tipodeoperacion.SUMA -> resultado = valor1 + valor2
            Tipodeoperacion.RESTA -> resultado = valor1 - valor2
            Tipodeoperacion.MULTIPLICACION -> resultado = valor1 * valor2
            Tipodeoperacion.DIVISION -> resultado = valor1 / valor2

        }
        println("$valor1 ${tipodeoperacion.tipo} $valor2 es igual" + "a $resultado")
    }

    fun main() {
        val opracion1 = operacion(10, 3, Tipodeoperacion.SUMA)
        opracion1.operar()
    }
}
