package `22_POO_Costructor1`

class Persona2 constructor(nombre: String,edad: Int){

    var nombre: String = nombre

    var edad: Int = edad


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

    val persona5 = Persona2 ("juan" , 12)
    persona5.imprimir11()
    persona5.esMayorEdad1()
}