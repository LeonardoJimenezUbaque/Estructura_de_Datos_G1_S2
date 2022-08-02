package taller_01

fun main() {
    /* Ejercicio_01
    El programa debe preguntar el nombre de una persona e imprimir "Hola" seguido de un especio y luego el nombre de la persona. */

    println("¿Cual es tu nombre?")
    var nombre: String = readLine()!!
    print("Hola $nombre")
}