package `20_funciones_tipo_arreglo`

//*Problema 1
//Desarrollar un programa que permita ingresar un arreglo de n elementos, ingresar n por teclado.
//Elaborar dos funciones una donde se lo cree y cargue al arreglo y otra que sume todos sus elementos
// y retorne dicho valor a la main donde se lo imprima.
fun cargar() : IntArray {
    print("ingresar elemento que quiere cargar:")
    val v1= readln().toInt()
    val v2 = IntArray(v1)
    for(i in v2.indices){
        print("ingrese elemento:")
        v2[i]= readln().toInt()

}
return v2
}
fun suma(sumas:IntArray) : Int {
    var suma = 0
    for (i in sumas.indices) {
        suma += sumas[i]
    }
    return suma
}
    fun main() {
        val cargar = cargar()
        val suma = suma(cargar)
        println("la suma de los calculos ingresados es:$suma")
    }