package Quiz_02

import org.testng.Assert.assertEquals
import org.testng.annotations.Test

fun AreaFigura(u: Double, x: Double, y: Double, z: Double, w: Double ): Double{
    var htrapecio_00 = x - u - y
    var rectangulo_00 = Rectangulo(z, y)
    var trapecio_00 = Trapecio(w, u, htrapecio_00)
    var rectangulo_02 = Rectangulo(u, u)
    var areaFinal = rectangulo_00.area_00() + trapecio_00.area_00() + rectangulo_02.area_00()
    return areaFinal
}


class Prueba{
    @Test
    fun PruebaQuiz(){
        assertEquals(26.5, AreaFigura(2.0, 8.0, 3.0, 4.0, 5.0))
        println("Prueba superada :D")
    }
}
