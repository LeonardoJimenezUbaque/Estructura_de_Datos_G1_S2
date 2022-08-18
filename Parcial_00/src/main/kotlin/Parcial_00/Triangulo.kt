package Parcial_00

class Triangulo (var base: Double, var altura: Double) {
    fun area (): Double {
        var areaTriagulo = (base * altura) / 2
        return areaTriagulo
    }
}