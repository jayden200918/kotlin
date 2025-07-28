package `22_POO_Costructor1191`

class producto(var nom: String, var precio: Int, var stock : Int ) {

    init {
        if (precio < 0) {
            precio = 0
        }
        if (stock < 0)
            stock = 0
    }


    fun mostrarinfo() {
        println("su nombre es $nom , su precio es $precio, su stock es $stock")

    }

    fun haystock() {
        return if (stock > 0) {
            println("Esta disponible")

        } else {
            println("no esta disponible")
        }
    }
}
    fun main() {
        val producto1 = producto("jayden's", 3,3)
        producto1.mostrarinfo()
        producto1.haystock()

    }
