package `24_POO_colaboraciones_clases`



class libro( var titulo: String,
             var prestado: Boolean){

    fun prestar(){
        if (prestado == true)
            println("${titulo} esta prestado1")
        if (prestado== false)
            println(" ${titulo} no se presta")
        devolver()
    }
    fun devolver(){
        if (prestado == true)
            println("${titulo} esta disponible")
        if (prestado== false)
            println("${titulo }no es necesario devolverlo")

    }
    fun estado(){
        print("$titulo esta ${devolver()}")
    }
}
class biblioteca() {
    val libro1 = libro("titi", true)
    val libro2 = libro("roro", true)
    val libro3 = libro("popi", true)
    fun operar() {
        libro1.prestar()
        libro2.prestar()
        libro3.prestar()

    }

    fun revisarestado(){
        println("$libro1 es el estado")
        println("$libro2 es el estado")
        println("$libro3 es el estado")



    }
}
fun main(){
  val biblioteca1= biblioteca()
    biblioteca1.operar()

}