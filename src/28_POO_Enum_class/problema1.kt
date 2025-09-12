package `28_POO_Enum_class`

//Definir un enum class almacenando como constante los nombres
// de cinco países de América y como propiedad para cada país
// la cantidad de habitantes que tiene.
//Definir una instancia de este tipo e imprimir la constante
// y la cantidad de habitantes de dicha instancia.//
enum class almacenado(val habitantes : Int){
    COSTARICA(5000000),
    NICARAGUA(1000000),
    USA(230000000),
    PERU(3000004),
    PANAMA(1500000)

}

fun main (){
       val pais1 = almacenado.COSTARICA
    println(pais1)
    println("la cantidad de habitantes es de ${pais1.habitantes}")
    }
