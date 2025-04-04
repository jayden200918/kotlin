package `5_estructura_condicionales_aninadas`

/*
Un postulante a un empleo, realiza un test de capacitación, se obtuvo la
 siguiente información: cantidad total de preguntas que se le realizaron
 y la cantidad de preguntas que contestó correctamente. Se pide confeccionar un
 programa que ingrese los dos datos por teclado e informe el nivel del mismo según el
  porcentaje de respuestas correctas que ha obtenido, y sabiendo que:

	Nivel máximo: Porcentaje >= 90%.
	Nivel medio: Porcentaje >= 75% y < 90%.
	Nivel regular:	Porcentaje >= 50% y 75%.
	Fuera de nivel:Porcentaje < 50%.


 */
fun main() {
    print("ingrese la cantidad total de preguntas")
    val preguntas = readln().toInt()
    print("ingrese las preguntas correctas")
    val correctas = readln(). toDouble()
    val porcentajes= (correctas / preguntas) * 100
    print ("el porcentaje es: $porcentajes")
    if (porcentajes >= 90 )
        print("nivel maximo")
    else if (porcentajes >= 75)
        print("nivel bueno")
     else if (porcentajes >= 50)
        print("nivel regular")
    else
        print(" fuera de nivel  ")

        }





