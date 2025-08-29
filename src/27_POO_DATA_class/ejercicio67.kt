package `27_POO_DATA_class`

data class Persona(var nombre : String, var edad : Int){
    override fun toString(): String {
        return "$nombre, $edad"
    }
}
fun main(){
    var persona1 = Persona("Juan", 22)
    var persona2 = Persona("ana", 59 )

    println(persona1)
    println(persona2)
}