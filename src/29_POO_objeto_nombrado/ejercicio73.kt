package `29_POO_objeto_nombrado`

import java.security.Principal

object matematicas {
    val PI = 3.1416
    fun aleatorio(minimo : Int, maximo : Int){
        ((Math.random() * (maximo +1 - minimo ))+ minimo).toInt()
    }
    fun main(){
        println(" el valor de PI es de ${matematicas.PI}")
        println("un valor del 5 al 10:")
        println("${matematicas.aleatorio(5,10)}")
    }
}