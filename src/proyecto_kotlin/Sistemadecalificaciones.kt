package proyecto_kotlin

fun registrarnota() : Int {
     var nota = 0
    do {
            print("ingrese una nota del 0 al 100:")
            nota = readln().toInt()
            while (nota > 100 || nota < 0) {
                print("la nota ingresada es invalida , vuelve a intentarlo:")
            }
        }while(nota !in 0 ..100)
        return (nota)
}
fun main() {
    val nombres = arrayOfNulls<String>(5)
    val nota = IntArray(5)
    var estado = String
    var reprobados = 0
    var notaalta = 0
    var notabaja = 100
    var suma = 0
    var aprobados = 0

    for (i in 0..4) {
        print("ingrese el nombre del estudiante:")
        val nombre = readln().toString()
        nombres[i] = nombre
        nota[i]= registrarnota()
        suma += nota[i]
        println(nota[i])
        when {
            nota[i] in 90..100 -> {
                println("Excelente")
                aprobados++}
            nota[i] in 80..89 -> {
                println("Bueno")
                aprobados++ }
            nota[i] in 70..79 ->{
                println("Aprobada")
                aprobados++ }
            else -> {
                println("Reprobado")
                reprobados++}
        }

        if (notaalta < nota[i]) {
            notaalta = nota[i]
        }
        if (notabaja > nota[i]){
            notabaja = nota[i]
    }
}
   val promedio = suma/nota.size
    println("los que aprobaron son: $aprobados")
    println("los que reprobaron son: $reprobados")
    println("la nota ingresada mas baja es : $notabaja")
    println("la nota ingresada mas alta es : $notaalta")
    println("En promedio las notas son de: $promedio")
}