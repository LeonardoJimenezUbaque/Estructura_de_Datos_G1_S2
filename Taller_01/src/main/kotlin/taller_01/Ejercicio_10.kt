package Taller_01

import kotlin.math.PI
/*
    Ejercicio_10

    Escriba una función que halle el área de un círculo de acuerdo a la siguiente fórmula:

    1. PI * r^2

    Ahora escriba una función que halle el área de la corona circular (región en verde en la siguiente figura) a
    partir de la resta de las áreas del círculo grande (con radio R) y el círculo pequeño (con radio r). En esta
    segunda función debe usar la primera. Además escriba un programa que lea el valor de los dos radios y, usando
    la función anterior, calcule y halle el área de la corona circular.
 */

fun circulo_00(r: Double):Double{
    var area = PI * (r * r)
    return area
}

fun corona_00(r: Double, R: Double): Double{
    var area_corona = circulo_00(R) - circulo_00(r)
    return area_corona
}

fun main() {
    println("Digite el radio R del circulo grande")
    var r_00 = readLine()!!.toDouble()
    println("Digite el radio r del circulo pequeno")
    var r_01 = readLine()!!.toDouble()

    var solucion_00 = corona_00(r_01,r_00)
    println("El area de la corona corresponde a: $solucion_00")
}
