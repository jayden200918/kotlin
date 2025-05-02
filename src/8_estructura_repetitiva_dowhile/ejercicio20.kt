package `8_estructura_repetitiva_dowhile`

fun main() {
    var cant1 = 0
    var cant2 = 0
    var cant3 = 0
    do{
        print("ingrese un peso de la pieza (0 para finalizar:")
        val peso = readln().toInt()
        if (peso >10.2)
            cant1++
        else
            if (peso >= 9.8)
                cant2++
            else
                if(peso > 0)
                    cant3 ++
    } while (peso != 0.0.toInt())
    println("piezas aptas: $cant2")
    println("piezas cun un peso superior a 10.2: $cant1")
    println("piezas con un peso inferior a 9.8: $cant3")
    val suma = cant1 + cant2 + cant3
    println("cantidad total de piezas procesadas: $suma")
}