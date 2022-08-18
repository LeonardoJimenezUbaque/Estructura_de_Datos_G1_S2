package Taller_01
/*
    Ejercicio_08
    Escriba una función y un programa en Kotlin que resuelva el siguiente problema: Pedro acabó de recibir el sueldo
    mensual. Si se gasta el 40% de ese sueldo en el arriendo y el 15% del sueldo en comida, determine cuánto dinero
    se gastó en cada uno de esos dos ítems (en arriendo y en comida) y cuanto dinero le queda al final.
 */
fun gastos_00(sueldo: Double): Triple <Double, Double, Double>{
    var arriendo = sueldo * 0.4
    var comida = sueldo * 0.15
    var dinero_final = sueldo - (arriendo + comida)
    return Triple(arriendo, comida, dinero_final)
}

fun main() {
    println("Digite su sueldo")
    var sueldo = readLine()!!.toDouble()

    var (resultado_a, resultado_c, resultado_df) = gastos_00(sueldo)
    println("De acuerdo a su sueldo de: $sueldo. Su dinero final corresponde a: $resultado_df, sus gastos en arriendo fueron de: $resultado_a y en comida de: $resultado_c")
}
