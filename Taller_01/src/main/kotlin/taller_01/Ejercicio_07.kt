package Taller_01

import kotlin.math.*
/*
    Ejercicio_07
    Escriba una función que calcule la longitud de la escalera teniendo en cuenta que conocemos la altura que tiene
    la escalera cuando está inclinada sobre la pared con un ángulo. Tenga en cuenta la siguiente figura:

    Escriba el programa que use la función anterior para hallar la longitud de la escalera a partir de los otros datos.
 */
fun calculo_00(altura: Double, angulo: Double): Double{
    var radianes = angulo * (PI/180)
    var longitud = altura/sin(radianes)
    return longitud
}

fun main() {
    println("Digite la altura de la escalera")
    var altura = readLine()!!.toDouble()
    println("Digite el angulo de inclinacion de la escalera")
    var angulo = readLine()!!.toDouble()

    var longitud = calculo_00(altura, angulo)
    println("La longitud de la escalera es de: $longitud")
}