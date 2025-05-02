package `7_estructura_repetitiva_while`

fun main() {
    print("ingrese el numero de trabajadores:")
    val n = readln().toInt()
    var x = 1
    var sueldo1 = 0
    var sueldo2 = 0
    var resta= 0
    while (x <= n) {
        print("ingrese el sueldo : ")
        val sueldo = readln().toInt()
        if (sueldo >= 100 && sueldo <= 300) {
            sueldo1 = sueldo1 + 1
            resta = resta + sueldo
        } else {
            sueldo2 = sueldo2 + 1
            resta = resta + sueldo

        }
        x = x + 1
    }
        println("los sueldos entre 100 y 300 son $sueldo1")
        println("los sueldos mayores a 500 son $sueldo2")
        println("el gasto en promedio es $resta")
}