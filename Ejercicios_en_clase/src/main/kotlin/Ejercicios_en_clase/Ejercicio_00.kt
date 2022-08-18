package Ejercicios_en_clase

class fraccionario(var numerador: Int, var denominador: Int)

class proyectil(val velocidad: Double, val angulo: Double){

}

fun convertir_a_decimal(frac: fraccionario): Double{
    return frac.numerador.toDouble() / frac.denominador
}

fun main() {
    val cuatro_quintos = fraccionario(4, 5)
}