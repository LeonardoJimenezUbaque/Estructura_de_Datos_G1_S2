package Taller_01
/*
    Ejercicio_03

    Juancho ha calculado que le toma 38 segundos caminar 100 metros, y quiere que le escribamos un programa donde
    dado el número de metros que hay entre su casa y la tienda, le muestre cuánto tiempo le tomaría ir y regresar
    a la tienda.
*/
fun main() {
    println("¿Cuantos metros hay en el recorrido de su casa a la tienda?")
    var cantidad_metros: Double = readLine()!!.toDouble()

    var tiempo = ((38 * cantidad_metros)/100) * 2
    println("El tiempo que Juancho gastaria en ir y volver a la tienda dada la distancia ingresada es: $tiempo segundos")
}
