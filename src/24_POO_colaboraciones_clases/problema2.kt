package `24_POO_colaboraciones_clases`

class estudiante (var nombre : String,  var asistecia: Int) {

    fun registrarasistecia(){
        this.asistecia+= 1
    }
    fun imprimir(){
        println("el estudiante se llama $nombre y lleva de asistencia $asistecia")
    }
}
class clase(){
    val est1 = estudiante("jayden", 2)
    val est2 = estudiante("oso", 10)
    val est3 = estudiante("joson", 3)
    fun marcarasistencia(){
        est1.registrarasistecia()
        est2.registrarasistecia()
        est3.registrarasistecia()
        reporte()
    }
    fun reporte(){
        est1.imprimir()
        est2.imprimir()
        est3.imprimir()
    }
}
fun main(){
    val estudiante1 = clase()
    estudiante1.marcarasistencia()
}