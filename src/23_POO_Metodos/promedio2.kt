package `23_POO_Metodos22`
class temperaturas {
    var temp1: Int = 0
    var temp2: Int = 0
    var temp3: Int = 0
    var temp4: Int = 0
    var temp5: Int = 0
    var temp6: Int = 0
    var temp7: Int = 0
    fun CargarDatos() {

        print("Ingrese la temperatura del dia 1: ")
        temp1 = readln().toInt()
        print("Ingrese la temperatura del dia 2: ")
        temp2 = readln().toInt()
        print("Ingrese la temperatura del dia 3: ")
        temp3 = readln().toInt()
        print("Ingrese la temperatura del dia 4: ")
        temp4 = readln().toInt()
        print("Ingrese la temperatura del dia 5: ")
        temp5 = readln().toInt()
        print("Ingrese la temperatura del dia 6: ")
        temp6 = readln().toInt()
        print("Ingrese la temperatura del dia 7: ")
        temp7 = readln().toInt()

        fun mostrarMaxima() {
            if (temp1 > temp2 && temp1 > temp3 && temp1 > temp4 && temp1 > temp5 && temp1 > temp6 && temp1 > temp7)
                println("El mayor es $temp1")

            if (temp2 > temp1 && temp2 > temp3 && temp2 > temp4 && temp2 > temp5 && temp2 > temp6 && temp2 > temp7)
                println("El mayor es $temp2")

            if (temp3 > temp1 && temp3 > temp2 && temp3 > temp4 && temp3 > temp5 && temp3 > temp6 && temp3 > temp7)
                println("El mayor es $temp3")

            if (temp4 > temp1 && temp4 > temp2 && temp4 > temp5 && temp4 > temp6 && temp4 > temp7)
                println("El mayor es $temp4")

            if (temp5 > temp1 && temp5 > temp2 && temp5 > temp3 && temp5 > temp6 && temp5 > temp7)
                println("El mayor es $temp5")

            if (temp6 > temp1 && temp6 > temp2 && temp6 > temp3 && temp6 > temp4 && temp6 > temp5 && temp6 > temp7)
                println("El mayor es $temp6")

            if (temp7 > temp1 && temp7 > temp2 && temp7 > temp3 && temp7 > temp4 && temp7 > temp5 && temp7 > temp6)
                println("El mayor es $temp6")

        }

        fun mostrarMinima() {
            if (temp1 < temp2 && temp1 < temp3 && temp1 < temp4 && temp1 < temp5 && temp1 < temp6 && temp1 < temp7)
                println("El menor es es $temp1")

            if (temp2 < temp1 && temp2 < temp3 && temp2 < temp4 && temp2 < temp5 && temp2 < temp6 && temp2 < temp7)
                println("El menor es $temp2")

            if (temp3 < temp1 && temp3 < temp2 && temp3 < temp4 && temp3 < temp5 && temp3 < temp6 && temp3 < temp7)
                println("El menor es $temp3")

            if (temp4 < temp1 && temp4 < temp2 && temp4 < temp5 && temp4 < temp6 && temp4 < temp7)
                println("El menor es $temp4")

            if (temp5 < temp1 && temp5 < temp2 && temp5 < temp3 && temp5 < temp6 && temp5 < temp7)
                println("El menor es $temp5")

            if (temp6 < temp1 && temp6 < temp2 && temp6 < temp3 && temp6 < temp4 && temp6 < temp5 && temp6 < temp7)
                println("El menor es $temp6")

            if (temp7 < temp1 && temp7 < temp2 && temp7 < temp3 && temp7 < temp4 && temp7 < temp5 && temp7 < temp6)
                println("El menor es $temp7")
        }
    }
}


fun main(){
    val temperatura1 = temperaturas()
    temperatura1.CargarDatos()
}