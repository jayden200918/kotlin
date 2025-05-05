package `9_estructura_repetitiva_for`

fun main() {
    print("ingrese un valor:")
    val num = readln().toInt()
    for (i in 1..12) {
        val result = num * i
        println("numero x i : $result")
    }
}