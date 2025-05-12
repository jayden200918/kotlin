package `11_estructura_condicional_when_argumento`

fun main() {
    var v2 = 0
    var v1 = 0
    var v3 = 0
    var v4 = 0
    for (i in 1 ..10){
        print("ingrse la cantidad de hijos en cada familia:")
        val hijos = readln().toInt()
        when(hijos){
            0 -> v1++
            1 -> v2++
            2 -> v3++
            else -> v4++
        }
    }
    println("las familias con 0 hijos son las:$v1")
    println("las familias con 1 hijos son las:$v2")
    println("las familias con 2 hijos son las:$v3")
    println("las familias con mas de 2 hijos son:$v4")
}