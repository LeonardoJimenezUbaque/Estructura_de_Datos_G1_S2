package Parcial_00

import org.testng.Assert.assertEquals
import org.testng.annotations.Test

fun AreaFigura (x: Double): Double {
    var areaCirculo = Circulo(x / 2).area()
    var areaSemicirculo = areaCirculo / 2
    var areaTriangulo = Triangulo(x, x+3).area()
    var areaFigura = areaSemicirculo + areaTriangulo
    return areaFigura
}

fun main() {
    println(AreaFigura(10.0))
}
