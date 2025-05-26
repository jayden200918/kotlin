package `18_funciones_internas`
fun mayores(){
    fun mayor (num1: Int, num2:Int,): Int{
        var mayor = 0
        if (num1 > num2)
            mayor += num1
        if(num1 < num2)
            mayor += num2
        return mayor
    }
    for (i in 1 .. 5) {
        println("Digite el primer valor:")
        val num1 = readln().toInt()
        println("Digite el segundo valor:")
        val num2 = readln().toInt()
        val n = mayor(num1, num2)
        if (num1 > num2){
            println("El número mayor entre $num1 y $num2 es: $n")
        }else if (num1 < num2) {
            println("El número mayor entre $num1 y $num2 es: $n")
        }else{
            println("Los números son iguales")
        }
    }
}
fun main(){
    mayores()
}