/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad Ean (Bogotá - Colombia)
 * Departamento de Ingeniería de Sistemas
 * Licenciado bajo el esquema Academic Free License version 2.1
 *
 * Unidad de Estudios: Estructura de Datos
 * Taller: 02
 * Fecha: 1 de agosto de 2022
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package co.edu.ean.estructuradedatos.taller02

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class EjerciciosKtTest {

    /**
     * Prueba del ejercicio 1
     */
    @Test
    fun pruebaEjercicio1() {
        assertEquals(52.0, ejercicio1(1000.0, 25))
        assertEquals(650.0, ejercicio1(50_000.0, 100))
        println("Prueba superada 🦾")
    }

    @Test
    /**
    En este ejercicio se pide las horas totales que trabajara el profesor, sin emabargo, como esta la prueba
    originalmente se esta es teniendo en cuenta unicamente las horas de preparacion de las clases y las horas
    calificando las evaluaciones, mas no las horas totales de trabajo ya que faltaria las horas que dicta las
    clases.

    Asi estaba la prueba en un inicio, la modifique para cumplir lo que pide el ejercicio.
    fun pruebaEjercicio2() {
        assertEquals(18, ejercicio2(20))
        println("Prueba superada ✔")
    }
     */
    fun pruebaEjercicio2() {
        assertEquals(38, ejercicio2(20))
        println("Prueba superada ✔")
    }

    @Test
    fun pruebaEjercicio3() {
        assertEquals(33 to 20, ejercicio3(25, 4, 20))
        println("Prueba superada ✔")
    }

    @Test
    fun pruebaEjercicio4() {
        assertEquals(Triple(0.5, 0.3, 0.2), ejercicio4(500.0, 300.0, 200.0))
        println("Prueba superada ✔")
    }

    @Test
    fun pruebaEjercicio5() {
        assertEquals(Triple(2, 7, 1), ejercicio5(271))
        println("Prueba superada ✔")
    }

    @Test
    fun pruebaEjercicio6() {
        assertEquals(88.0, ejercicio6(85.0, 100.0, 100.0,85.0, 80.0, 90.0, 80.0, 70.0, 95.0))
        println("Prueba superada ✔")
    }

    @Test
    fun pruebaEjercicio7() {
        assertEquals(Triple(800_000.0, 500_000.0, 700_000.0), ejercicio7(2_000_000.0))
        println("Prueba superada ✔")
    }

    @Test
    fun pruebaEjercicio8() {
        assertEquals(Pair(Triple(80_000.0,50_000.0, 100_000.0,), 230_000.0), ejercicio8(800_000.0, 500_000.0, 1_000_000.0))
        println("Prueba superada ✔")
    }

    @Test
    fun pruebaEjerwcicio9(){
        assertEquals(Pair(9.0 , 3.0), ejercicio9(40, 3, 350))
        println("Prueba superada ✔")
    }

    @Test
    fun pruebaEjerwcicio10(){
        assertEquals(true, ejercicio10(2040))
        assertEquals(false, ejercicio10(2022))
        println("Prueba superada ✔")
    }

}