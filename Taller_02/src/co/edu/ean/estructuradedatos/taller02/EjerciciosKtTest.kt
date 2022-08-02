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
    fun pruebaEjercicio2() {
        assertEquals(18, ejercicio2(20))
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
}