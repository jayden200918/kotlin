package `27_POO_DATA_class`

data class Butaca(val num: Int, var ocupada: Boolean)


fun main() {
    val butaca1 = Butaca(1, false)
    val butaca2 = Butaca(2, false)
    val butaca3 = Butaca(3, false)
    val butaca4 = Butaca(4, false)
    val butaca5 = Butaca(5, false)

    val butacas = listOf(butaca1, butaca2, butaca3, butaca4, butaca5)

    val copiaAntesDeVender = listOf(
        Butaca(1,butaca1.ocupada),
        Butaca(2, butaca2.ocupada),
        Butaca(3, butaca3.ocupada),
        Butaca(4, butaca4.ocupada),
        Butaca(5, butaca5.ocupada)
    )

    var num1 = ((Math.random()*5)+1).toInt()
    var num2 = ((Math.random()*5)+1).toInt()
    while (num2 == num1) {
        num2 = ((Math.random()*5)+1).toInt()
    }

    for (butaca in butacas) {
        if (butaca.num == num1 || butaca.num == num2) {
            butaca.ocupada = true
        }
    }

    println("Lista de butacas")
    println(butacas)

    println("Estado de cada butaca:")
    for (butaca in butacas) {
        val estado = if (butaca.ocupada) "ocupada" else "libre"
        println(" $butaca esta = $estado")
    }

}
