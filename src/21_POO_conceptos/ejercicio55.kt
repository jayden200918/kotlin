package `21_POO_conceptos`

class alumno {
    var nombre: String = ""
    var nota: Int = 0

    fun inicializar(nombre: String, nota: Int) {
        this.nombre = nombre
        this.nota = nota
    }

    fun imprimir() {
        println("Nombre: $nombre y tiene una nota de $nota")
    }

    fun Notas() {
        if (nota >= 70)
            println("aprobo $nombre")
        else
            println(" no aprobo $nombre")
    }
}

fun main() {
    val Alumno1: alumno
    Alumno1 = alumno()
    Alumno1.inicializar("pepe",97)
    Alumno1.imprimir()
    Alumno1.Notas()

    val Alumno2: alumno
    Alumno2 = alumno()
    Alumno2.inicializar("samantha",20)
    Alumno2.imprimir()
    Alumno2.Notas()
}