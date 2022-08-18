package Taller_01
/*
    Ejercicio_05

    Escriba una función en Kotlin que halle el área y el perímetro de un rectángulo a partir de la base y la altura
    del rectángulo(OJO: Una sola función). Escriba un programa que lea la base y la altura y que imprima el área y
    el perímetro, usando la función anterior.
*/
fun datos_00(base: Double, altura: Double): Pair <Double, Double> {
    val area = base * altura
    val perimetro = 2 * base + 2 * altura
    return area to perimetro
}

fun main() {
    println("Digite la base del rectangulo")
    var base = readLine()!!.toDouble()
    println("Digite la altura de su rectangulo")
    var altura = readLine()!!.toDouble()

    var (resultado_a, resultado_p) = datos_00(base, altura)
    println("El area de su rectangulo es: $resultado_a, el perimetro de su rectangulo es: $resultado_p ")
}