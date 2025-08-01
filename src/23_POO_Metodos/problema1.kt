package `23_POO_Metodos`
class notas (var nota : Int, var nota1: Int,var nota2 : Int,var nota3 : Int) {
    init {
        if(nota > 70 )
            println("aprobo")
        if(nota1 > 70 )
            println("aprobo")
        if(nota2 > 70 )
            println("aprobo")
        if(nota3 > 70 )
            println("aprobo")



    }
    fun promedionotas() {
        var suma = nota+nota1+nota2+nota3
        val promedio = suma / 4
        println("el promedio de notas es $promedio")
    }
    fun aprobados() {
        if (nota >= 70){
            println("aprobado")
    }else{
        println("no aprobo")
    }
    }
}
fun main(){
    val notas1 = notas(98,98,98,98)
    notas1.promedionotas()
    notas1.aprobados()


}