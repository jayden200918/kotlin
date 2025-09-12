package `29_POO_objeto_nombrado`

fun main(){
    val datos = object {
        val arreglo = IntArray(5 )
        fun generar(){
            for (i in arreglo.indices)
                arreglo[i] = ((Math.random()* 6) + 1).toInt()

        }
        fun imprimir(){
            for (elemento in arreglo)
                println("$elemento - ")
            println();
        }
        fun mayor(): Int{
            var mayor = arreglo[0]
            for (i in arreglo.indices)
                if(arreglo[i] > mayor)
                    mayor= arreglo[i]
            return mayor
        }

    }
    datos.generar()
    datos.imprimir()
    println("mayo valor:")
    println(datos.mayor())
}