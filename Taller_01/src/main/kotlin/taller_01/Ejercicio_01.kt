package Taller_01
/*
    Ejercicio_01

    El programa debe preguntar el nombre de una persona e imprimir "Hola" seguido de un
    espacio y luego el nombre de la persona.
*/
fun main() {
    println("¿Cual es tu nombre?")
    var nombre: String = readLine()!!
    print("Hola $nombre")
}