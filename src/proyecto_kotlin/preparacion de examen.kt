package proyecto_kotlin
fun registraNota() : Int {
    var nota = 0
    do {
        print("ingrese la nota del estudiante:")
        nota = readln().toInt()
        if(nota > 100 || nota < 0) {
            print("vuelva a intentarlo con otro numero")
        }
    }while(nota !in 0 .. 100)
    return(nota)

}
fun resumen() {
    val nombres = arrayOfNulls<String>(5)
    val nota = IntArray(5)
    var NB = 100
    var NA = 0
    var reprobados = 0
    var aprobados = 0
    var suma = 0
    var estado = String
    for (i in 0..4) {
        print("ingrese el nombre del estudiante:")
        val nombre = readln().toString()
        nombres[i] = nombre
        nota[i] = registraNota()
        suma += nota[i]
        print(nota)
        when {
            nota[i] in 90..100 -> {
                println("Excelente")
                aprobados++
            }

            nota[i] in 80..89 -> {
                println("Bueno")
                aprobados++
            }

            nota[i] in 70..79 -> {
                println("Aprobada")
                aprobados++
            }

            else -> {
                println("Reprobado")
                reprobados++
            }
        }

        if (NA < nota[i]) {
            NA = nota[i]
        }
        if (NB > nota[i]) {
            NB = nota[i]

        }

    }
    val promedio= nota.size/suma
    println("los que aprobaron son: $aprobados")
    println("los que reprobaron son: $reprobados")
    println("la nota ingresada mas baja es : $NB")
    println("la nota ingresada mas alta es : $NA")
    println("En promedio las notas son de: $promedio")
}
fun main(){
    resumen()
}
