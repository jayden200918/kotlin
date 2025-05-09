package `10_estructura_condicional_when`

fun main() {
    var total = 0
    for(i in 1..10){
        print("ingrese sueldo del operador:")
        val sueldo = readln().toInt()
        total += when {
            sueldo > 5000-> {
                println("sueldo alto")
                sueldo
            }
            sueldo> 2000 -> {
                println("Sueldo medio")
                0
            }
            else -> {
                println("sueldo bajo")
                0
            }
        }
    }
    print("Gastos totales en sueldos altos")
}
