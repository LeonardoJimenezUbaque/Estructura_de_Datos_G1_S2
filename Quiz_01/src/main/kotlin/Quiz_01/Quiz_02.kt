package Quiz_01

import kotlin.math.*

fun area_00(r: Double):Double{
    var area = PI * (r * r)
    return area
}
fun area_sombreada(d: Double, D: Double): Double {
    var radioCirculoGrande = (d + D) / 2.0
    var area_inicial = area_00(radioCirculoGrande)
    var area_00 = area_00(d/2)
    var area_01 = area_00(D/2)
    var area_final = area_inicial - (area_00 + area_01)
    return area_final
}

fun main() {
    println("Digite el diametro del circulo pequeno")
    var d = readLine()!!.toDouble()
    println("Digite cantidad del producto C")
    var D = readLine()!!.toDouble()
    var r = (d + D)/2
    var respuesta = area_sombreada(r, d, d)
    println(respuesta)
}