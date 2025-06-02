package proyecto_kotlin

fun registrarnota(nombre: String) : Int {
    var nota : Int = 0
        do {
            print("ingrese una nota del 0 al 100 ${nombre[0]}")
            var nota = readln().toInt()
            while (nota > 100 || nota < 0) {
                print("la nota ingresada es invalida , vuelve a intentarlo")
            }
        }while(nota in 0 ..100)
        return (nota)
}
fun main() {
    val nota = readln().toInt()
    var estado = String
    var notaalta = 0
    var notabaja = 0
    val suma  =
    for (i in 0..4) {
        print("ingrese el nombre del estudiante")
        val nombre = readln().toString()
    when {
        nota in 90..100 -> println("Excelente")
        nota in 80..89 -> println("Buena")
        nota in 70..79 -> println("Aprobado")
        nota < 70 -> println("Reprobada")
    }
        val promedio = nota + nota + nota + nota + nota/5
        if
    }
}