package Parcial_00

import kotlin.math.PI
import kotlin.math.pow

class Circulo (var radio: Double) {
    fun area (): Double {
        var areaCirculo = PI * radio.pow(2)
        return areaCirculo
        }
}
