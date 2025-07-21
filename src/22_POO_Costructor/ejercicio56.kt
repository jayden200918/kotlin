package `22_POO_Costructor5`

class Persona constructor(var nombre: String,var  edad: Int){



    fun imprimir11() {

        println("Nombre: $nombre y tiene una edad de $edad")

    }


    fun esMayorEdad1() {

        if (edad >= 18)

            println("Es mayor de edad $nombre")

        else

            println("No es mayor de edad $nombre")

    }

}


fun main() {

    val persona5 = Persona("juan" , 12)
    persona5.imprimir11()
    persona5.esMayorEdad1()
}