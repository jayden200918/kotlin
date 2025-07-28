package `22_POO_Costructor43`

class Libro (var titulo: String, var autor: String, var catidaddepaginas : Int ) {
    constructor() : this("JAY", "PEPE", 0) {
        print("Ingrese titulo:")
        titulo = readln().toString()
        print("Ingrese autor:")
        autor = readln().toString()
        print("Ingrese cantidad de paginas:")
        catidaddepaginas = readln().toInt()
    }

    fun infolibro() {
        println("el titulo es $titulo, el autor es $autor, cantidad de paginas son $catidaddepaginas ")
    }
    fun leer(paginasleidas : Int) {
        var falta = catidaddepaginas - paginasleidas
        println("faltan $falta ")
    }
}
fun main(){
    val Libro1 = Libro()
    Libro1.infolibro()
    print(" ingrese la cantidad de paginas leidas:")
    val paginaseidas1 = readln().toInt()

    Libro1.leer(paginaseidas1)

}