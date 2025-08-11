package `25_POO_Modificadores_private_y_public`

class bancaria {
    private var saldo: Int = 1000


    fun depositar(monto: Int) {
        consultarsaldo()
        montovalido(100)
        saldo = monto + saldo
        val suma = saldo + monto

        val resta = saldo - monto
        println("si deposita tendra $suma y si retira tendra $resta")
    }

    fun retirar(monto: Int) {
        puederetirar(monto)
        saldo = monto - saldo
    }
    fun consultarsaldo(){
        println("el saldo actual es $saldo" )
    }
    fun montovalido (monto : Int) {
        if (saldo  > 0){
            true
        println("Deposito aceptado")
    }else{
            false
            println("error")
            }


    }
    fun puederetirar (monto: Int){
        if (saldo > 0) {
            println("puede retirar")
        }else{
            println("no puede retirar")
        }
    }
}
fun main(){
    val refistraroperacion = bancaria()
    refistraroperacion.depositar(100)

}
