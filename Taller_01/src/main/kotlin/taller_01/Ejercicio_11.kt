package Taller_01

import kotlin.math.*
/*
    Ejercicio_11

    Una empresa inmobiliaria vende terrenos con la forma a continuación:

    Escriba funciones que nos ayuden a encontrar el área y el perímetro del terreno.
    1. Escriba una función que halle el área de un rectángulo a partir de su base y su altura
    2. Escriba una función que halle la hipotenusa de un triángulo rectángulo a partir de los catetos del triángulo.
    3. Encuentre el área de un triángulo a partir de su base y su altura
    4. Encuentre el perímetro del terreno a partir de los lados A, B, C (hay que encontrar la hipotenusa).
    5. El programa debe leer las dimensiones de los 3 lados y hallar el área y el perímetro del terreno usando las
    funciones anteriores.
 */

fun area_rectangulo(base: Double, altura: Double): Double{
    var area = base * altura
    return area
}

fun hipotenusa_triangulo(cateto_a: Double, cateto_b: Double): Double{
    var hipotenusa = sqrt((cateto_b * cateto_b) + (cateto_a * cateto_a))
    return hipotenusa
}

fun area_triangulo(base: Double, altura: Double): Double{
    var area = (base * altura)/2
    return area
}

fun main() {
    println("Ingrese el lado a del terreno")
    var a = readLine()!!.toDouble()
    println("Ingrese el lado b del terreno")
    var b = readLine()!!.toDouble()
    println("Ingrese el lado c del terreno")
    var c = readLine()!!.toDouble()

    var area_r = area_rectangulo(b, c)
    var area_t = area_triangulo(b, a-c)
    var area_terreno = area_r + area_t

    var hipotenusa_t = hipotenusa_triangulo(a-c, b)
    var perimetro_terreno = a + b + c + hipotenusa_t

    println("El area del terreno corresponde a: $area_terreno \n" +
            "El perimetro del terreno corresponde a: $perimetro_terreno")
}