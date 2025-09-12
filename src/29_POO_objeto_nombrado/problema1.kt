package `29_POO_objeto_nombrado`

object mayor {
    fun maximo( valor1 : Int,valor2 : Int ) : Int {
        return if (valor1 > valor2)
            valor1 else valor2

    }
    fun maximo1( valor1 : Float,valor2 : Float ) : Float {
        return if (valor1 > valor2)
            valor1 else valor2

    }
    fun maximo2 ( valor1 : Double,valor2 : Double ) : Double {
        return if (valor1 > valor2)
            valor1 else valor2

    }
    }
    fun main(){
       val v1 = mayor.maximo(1,12)
        val v2 = mayor.maximo1(2.2f,2.3f )
        val v3 = mayor.maximo2(2.22,1.88)
        println("$v1 es el mayor")
        println("$v2 es mayor ")
        println("$v3 es mayor")
    }
