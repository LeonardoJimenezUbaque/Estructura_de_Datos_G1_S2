package Taller_01
/*
    Ejercicio_04

    Escriba una función en Kotlin que encuentre el valor de la siguiente expresión algebraica:
    f(x,y) = x^2 + 2xy + y^2
    Escriba el programa que use la función anterior.
*/
fun funcion_00(x: Int, y: Int): Int {
    val resultado = x*x + 2*x*y + y*y
    return resultado
}
fun main() {
    println("Digite el valor de x")
    var x = readLine()!!.toInt()
    println("Digite el valor de y")
    var y = readLine()!!.toInt()

    var Resultado = funcion_00(x,y)
    println("Su resultado es: $Resultado")
}