package `22_POO_Costructor2`

import `22_POO_Costructor1`.Persona2

class Persona3 constructor(var nombre: String, var edad: Int){

    init{
        if (edad < 0)
            edad = 0
    }


    fun imprimir111() {

        println("Nombre: $nombre y tiene una edad de $edad")

    }


    fun esMayorEdad11() {

        if (edad >= 18)

            println("Es mayor de edad $nombre")

        else

            println("No es mayor de edad $nombre")

    }

}


fun main() {

    val persona5 = Persona3("juan" , 12)
    persona5.imprimir111()
    persona5.esMayorEdad11()
}