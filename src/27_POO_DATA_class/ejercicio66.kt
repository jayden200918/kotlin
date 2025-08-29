package `27_POO_DATA_class`

data class articulo(var codigo: Int, var descripcion:String, var precio: Float)
fun main(){
    val articulo1 = articulo(1,"papas", 14f)
    var articulo2 = articulo(2,"manzanas",24f)

    println(articulo1)
    println(articulo2)
    val puntero = articulo1
    puntero.precio = 100f
    println(articulo1)

    var articulo3 = articulo1.copy()
    articulo1.precio = 200f
    println(articulo1)
    println(articulo3)
    if (articulo1 == articulo3)
        println("son iguales  $articulo1 y $articulo3")
    else
        println("son distintos $articulo1 y $articulo3")
    articulo3.precio = 200f
    if (articulo1 == articulo3)
        println("son iguales  $articulo1 y $articulo3")
    else
        println("son distintos $articulo1 y $articulo3")


}