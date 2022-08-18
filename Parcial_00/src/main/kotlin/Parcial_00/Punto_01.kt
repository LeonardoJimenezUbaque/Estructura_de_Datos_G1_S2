package Parcial_00

import org.testng.Assert.assertEquals
import org.testng.annotations.Test


fun Nota(notaCorte1: Double, notaCorte2: Double, nivelEstudiante: String) {
    var notaFinal = (notaCorte1 * 0.6) + (notaCorte2 * 0.4)
    if (notaFinal >= 60.0 && nivelEstudiante == "pregrado"){
        return println("Usted aprobo la unidad de estudio con una nota de: $notaFinal")
    }
    else if (notaFinal < 60.0 && nivelEstudiante == "pregrado") {
        return println("Usted no aprobo la unidad de estudio con una nota de: $notaFinal")
    }
    else if (notaFinal >= 70.0 && nivelEstudiante == "postgrado") {
        return println("Usted aprobo la unidad de estudio con una nota de: $notaFinal")
    }
    else if (notaFinal < 70.0 && nivelEstudiante == "postgrado") {
        return println("Usted no aprobo la unidad de estudio con una nota de: $notaFinal")
    }
}



fun main() {
    Nota(40.0, 100.0, "pregrado")
    Nota(40.0, 100.0, "postgrado")
}


