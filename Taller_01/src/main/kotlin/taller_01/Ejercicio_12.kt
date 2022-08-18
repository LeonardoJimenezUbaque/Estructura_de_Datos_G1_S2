package Taller_01

import kotlin.math.*
/*
    Ejercicio_12

    Todo punto del eje cartesiano está descrito por dos elementos: la coordenada x (o «abscisa») y su coordenada y
    (que también se llama la «ordenada»). Suponga que tenemos las coordenadas (x, y) de dos puntos: x1 y y1 para el
    primer punto, y también x2y y2 para el segundo punto. Vamos a construir funciones y un programa que nos ayude a
    resolver los siguientes interrogantes:

    1. Escriba una función que halle la distancia entre dos puntos de acuerdo a la siguiente fórmula:
    d = sqrt((y2 - y1)^2 + (x2 - x1)^2)

    2. Escriba una función que reciba las coordenadas de dos puntos y que retorne la pendiente de la recta que une
    esos dos puntos. Recordemos que la pendiente se obtiene con la fórmula:
    m = y2 - y1/x2 - x1

    3. Escriba una función que reciba las coordenadas de dos puntos y que retorne las coordenadas del punto medio
    que se encuentra entre ellos. Las dos coordenadas se hallan a partir de la siguiente fórmula:
    xm = x1 + x2/2
    ym = y1 + y2/2

    Ahora escriba un programa que lea las dos coordenadas de dos puntos, y que imprima, usando las funciones
    anteriores, la distancia entre esos puntos, la pendiente de la recta que une esos dos puntos y el punto medio.
 */

fun distancia_00(x1: Double, y1: Double, x2: Double, y2: Double): Double{
    var distancia = sqrt(((y2-y1) * (y2-y1)) + ((x2-x1) * (x2-x1)))
    return distancia
}

fun pendiente_00(x1: Double, y1: Double, x2: Double, y2: Double): Double{
    var pendiente = (y2-y1)/(x2-x1)
    return pendiente
}

fun puntos_medios_00(x1: Double, y1: Double, x2: Double, y2: Double): Pair <Double, Double>{
    var punto_medio_x = (x1+x2)/2
    var punto_medio_Y = (y1+y2)/2
    return punto_medio_x to punto_medio_Y
}

fun main() {
    println("Digite el valor de x1")
    var x_01 = readLine()!!.toDouble()
    println("Digite el valor de y1")
    var y_01 = readLine()!!.toDouble()
    println("Digite el valor de x2")
    var x_02 = readLine()!!.toDouble()
    println("Digite el valor de y2")
    var y_02 = readLine()!!.toDouble()

    var distancia = distancia_00(x_01, y_01, x_02, y_02)
    var pendiente = pendiente_00(x_01, y_01, x_02, y_02)
    var (puntom_x, puntom_y) = puntos_medios_00(x_01, y_01, x_02, y_02)

    println("La distancia entre los dos puntos es de: $distancia \n" +
            "La pendiente de la recta es de. $pendiente \n" +
            "El punto medio de x es de. $puntom_x y el punto medio de y es de: $puntom_y")
}