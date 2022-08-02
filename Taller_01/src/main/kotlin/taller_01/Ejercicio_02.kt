package taller_01

/*
    Ejercicio_02
    Escriba un programa que pregunte las notas que obtuvo un estudiante en el primer corte, segundo corte y pruebas objetivas de una unidad de estudios
    de ciclo, y que imprima la nota definitiva del estudiante en esa unidad de estudio, teniendo en cuenta que el primero corte pesa el 40% de la nota
    definitiva, el segundo corte pesa el 50% y las pruebas objetivas pesan el 10%.
 */
fun main() {
    println("Digite la nota del primer corte")
    var nota_primer_corte: Double = readLine()!!.toDouble()
    println("Digite la nota del segundo corte")
    var nota_segundo_corte: Double = readLine()!!.toDouble()
    println("Digite la nota de la prueba objetiva")
    var nota_pruebas_objetivas: Double = readLine()!!.toDouble()

    var nota_definitiva = nota_primer_corte * 0.4 + nota_segundo_corte * 0.5 + nota_pruebas_objetivas * 0.1
    println(nota_definitiva)
}