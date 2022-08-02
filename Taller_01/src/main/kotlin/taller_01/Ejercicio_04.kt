package taller_01

/*
    Ejercicio_04
    Escriba una función en Kotlin que encuentre el valor de la siguiente expresión algebraica:
    Escriba el programa que use la función anterior.
 */

fun f(x: Int, y: Int): Int {
    val j = x*x + 2*x*y + y*y
    return j
}

fun main() {
    println("Digite el valor de x")
    var x = readLine()!!.toInt()
    println("Digite el valor de y")
    var y = readLine()!!.toInt()

    var r = f(x,y)
    println("Su resultado es $r")

}