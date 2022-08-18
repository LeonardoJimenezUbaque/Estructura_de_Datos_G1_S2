package Taller_01

import kotlin.math.*
/*
    Ejercicio_09

    Un triángulo isosceles es un triángulo donde se tienen que dos lados son iguales, tal como se muestra en la figura
    a continuación

    Primero, escriba una función que encuentra la altura del triángulo a partir de los lados a y b. Después escriba una
    función que halle el perímetro del triángulo, y finalmente, el área a partir de los dos lados. La fórmulas que
    necesitarán son:

    1. p = b + 2a
    2. h = (a^2 - b^2/4)^1/2
    3. a = (b * (a^2 - b^2/4)^1/2)/2
 */

fun altura_00(a: Double, b: Double): Double{
    var altura = sqrt((a * a) - (b * b)/4)
    return altura
}

fun perimetro_00(a: Double, b: Double): Double{
    var perimetro = b + (2 * a)
    return perimetro
}

fun area_00(a: Double, b: Double): Double{
    var area = b * sqrt((a * a) - (b * b)/4)/2
    return area
}

fun main() {
    println("Digite el lado a del triangulo isosceles")
    var a = readLine()!!.toDouble()
    println("Digite el lado b del triangulo isosceles")
    var b = readLine()!!.toDouble()

    var altura = altura_00(a, b)
    var perimetro = perimetro_00(a, b)
    var area = area_00(a, b)
    println("La altura del triangulo isosceles es de: $altura \n" +
            "El perimetro del triangulo isosceles es de: $perimetro \n" +
            "El area del triangulo isosceles es de: $area")
}