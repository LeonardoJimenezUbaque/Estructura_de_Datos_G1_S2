package Taller_Pruebas_00

import org.testng.Assert.assertEquals
import org.testng.annotations.Test

/*
En un restaurante usan 2 libras de papa para hacer un ajiaco, asi como 3.5 litros de agua. Si una persona normal
se toma medio ajiaco y un niño se roma un cuarto de ajiaco, desarrolle una funcion en kotlin que reciba el numero
de personas normales y niños que fueron en un dia y que halle la cantidad de ajicos, los kilos de papa y la cantidad
de agua para esos.

Entradas
- Numero_Personas_Normales : Int
- Numero_Niños : Int

Salidas
- Kilo_Papa : Double
- Ajiacos : Double
- Litros_Agua : Double
 */

fun calculo_ajiacos(npersonas: Int, nninos: Int): Triple<Double, Double, Double> {
    val numAjiacos = npersonas/2 + nninos/4.0
    val kilosPapa = numAjiacos
    val litrosAgua = numAjiacos * 3.5
    return Triple(numAjiacos, kilosPapa, litrosAgua)

}

// Aca se prueba la funcion de calculo_ajiacos
class prueba_ajiacos{
    @Test
    fun prueba_ajiacos(){
        // Vamos a usar la funcion anterior
        val (numAjiacos, kilosPapa, litrosAgua) = calculo_ajiacos(10,10)
        assertEquals(15.0, numAjiacos)
        assertEquals(15.0, kilosPapa)
        assertEquals(52.5, litrosAgua)
        println("Prueba Superada :D")
    }
}