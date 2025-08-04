package `24_POO_colaboraciones_clases`

class cliente(var nombre: String,var monto: Float){
    fun depositar(monto : Float){
        this.monto+= monto
    }
    fun extraer(monto : Float){
        this.monto -= monto
    }
    fun imprimir(){
        println("$nombre tiene depositado la suma de $monto")

    }
}
class Banco{
    val Cliente1: cliente = cliente("ana" , 0f)
    var Cliente2: cliente = cliente("juan", 0f)
    var Cliente3: cliente= cliente("jose", 0f)
    fun operar(){
        Cliente1.depositar(100f)
        Cliente2.depositar(150f)
        Cliente3.depositar(200f)
        Cliente3.extraer(150f)
    }
    fun depositostotales(){
        val total = Cliente1.monto + Cliente2.monto+ Cliente3.monto
        println("el total de dinero del banco es : $total")
        Cliente1.imprimir()
        Cliente2.imprimir()
        Cliente3.imprimir()
    }
}
fun main(){
    val banco1 = Banco()
    banco1.operar()
    banco1.depositostotales()
}