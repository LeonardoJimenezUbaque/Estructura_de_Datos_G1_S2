package Clases_00

import org.testng.Assert.assertEquals
import org.testng.annotations.Test

class Rectangulo(val base: Double, val altura: Double){
    fun area() = base * altura
}

class Casa(val x: Double, val y: Double, val z: Double){
    fun area(): Double {
        val parteInferior = Rectangulo(base = x, altura = y)
        val techo = Rectangulo(base = x, altura= z-y)
        return parteInferior.area() + techo.area() / 2
    }
}

class PruebaAreaACasa{
    @Test
    fun prueba(){
        var casa = Casa(x = 3.0, y = 2.0, z = 5.0)
        assertEquals(10.5,  casa.area())
        println("Prueba superada :D")

    }
}