package `20_funciones_tipo_arreglo`

//*Problema 2
//Cargar un arreglo de n elementos. Imprimir el menor elemento y un mensaje si se repite dentro del arreglo.
fun elemento(): IntArray{
    print("Cuantos elementos quiere ingresar:")
    val contar = readln().toInt()
    val elementos = IntArray (contar)
    for (i in elementos.indices){
        print("Ingrese elemento:")
        elementos[i] = readln().toInt()
    }
    return elementos
}
fun main(){
    val element = elemento()
    var suma = 0
    var Notabaja: Int = 100
    for (i in element.indices){
        if(Notabaja > element[i]) {
            Notabaja = element[i]
        }
    }
    println("El número menor es: $Notabaja")
    for (i in element.indices){
        if (Notabaja == element[i]){
            suma ++
        }
    }
    if (suma >= 1){
        println("El número menor se repite")
    }


}