package Taller_01

import kotlin.math.ceil

fun buses_00(asientos: Double, gordos: Double, flacos: Double): Double {
    val numero_buses = ((gordos * 2) + flacos) / asientos
    return ceil(numero_buses)
}

fun main() {
    println("Digite el numero de asientos del bus")
    var numero_asientos = readLine()!!.toDouble()
    println("Digite el numero de estudiantes gordos")
    var numero_gordos = readLine()!!.toDouble()
    println("Digite el numero de estudiantes flacos")
    var numero_flacos = readLine()!!.toDouble()

    var Resultado = buses_00(numero_asientos,numero_gordos,numero_flacos)
    println("El numero de buses que se necesitan para el paseo es: $Resultado")
}