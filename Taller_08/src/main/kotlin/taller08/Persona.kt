/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad EAN (Bogotá - Colombia)
 * Departamento de Tecnología - Facultad de Ingeniería
 * Licenciado bajo el esquema Academic Free License version 2.1
 *
 * Ejercicio: Instrucciones Repetitivas
 * Autor: Universidad EAN - 23 de agosto de 2022
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package taller08

import ean.collections.IList

/**
 * Información que mantenemos de una persona
 */
data class Persona(
    val cedula: Int,
    val edad: Int,
    val genero: String,
    val hijos: Int,
    val nivelEducativo: String,
    val estrato: Int,
    val ingresos: Int,
    val peso: Int,
    val altura: Int,
    val fuma: Boolean,
    val tieneLentes: Boolean,
    val tieneCasa: Boolean,
    val tieneAutomovil: Boolean
)

//-----------------------------------------------------------------------------
// Operaciones a llevar a cabo
//-----------------------------------------------------------------------------

fun contarMujeresConAutomovil(personas: IList<Persona>): Int {
    var contador = 0
    for (i in personas.indices) {
        val p = personas[i]
        if (p.genero == "F" && p.tieneAutomovil) {
            contador++
        }
    }
    return contador
}

/**
 * Contar el número de personas que pesan entre 60 y 80 kilos
 */
fun ejercicio1a(personas: IList<Persona>): Int {
    var contador = 0
    for (i in personas.indices){
        val p = personas[i]
        if (p.peso >= 60 && p.peso <= 80){
            contador++
        }
    }
    return contador
}

/**
 * Determinar si la cantidad de mujeres es superior a la cantidad de hombres
 * El método deberá retornar true si hay más mujeres que hombres y false
 * en caso contrario.
 */
fun ejercicio1b(personas: IList<Persona>): Boolean {
    var contadorHombres = 0
    var contadorMujeres = 0
    for (i in personas.indices){
        val p = personas[i]
        if (p.genero == "F"){
            contadorMujeres++
        }
        if (p.genero == "M"){
            contadorHombres++
        }
    }
    if (contadorMujeres > contadorHombres){
        return true
    }
    return false
}

/**
 * Encontrar la suma de los ingresos de aquellas personas
 * que no fuman y que sean mayores de 50 años de edad
 */
fun ejercicio2a(personas: IList<Persona>): Int {
    var sumatoriaIngresos = 0
    for (i in personas.indices){
        val p = personas[i]
        if (p.fuma == false && p.edad > 50){
            sumatoriaIngresos += p.ingresos
        }
    }
    return sumatoriaIngresos
}

/**
 * Escriba una función que retorne la suma de los pesos
 * de las personas de genero femenino, cuyo cédula es par
 * y no tiene hijos
 */
fun ejercicio2b(personas: IList<Persona>): Int {
    var sumatoriaPesos = 0
    for (i in personas.indices){
        val p = personas[i]
        if (p.genero == "F" && p.cedula % 2 == 0 && p.hijos == 0){
            sumatoriaPesos += p.peso
        }
    }
    return  sumatoriaPesos
}

/**
 * Escriba una función que retorne el promedio de edad
 * de los hombres que se ganan entre 2 y 3 millones
 */
fun ejercicio3a(personas: IList<Persona>): Double {
    var contador = 0
    var sumatoriaEdad = 0
    for (i in personas.indices){
        val p = personas[i]
        if (p.genero == "M" && p.ingresos >= 2000000 && p.ingresos <= 3000000){
            contador++
            sumatoriaEdad += p.edad
        }
    }
    return sumatoriaEdad / contador.toDouble()
}

/**
 * ¿Cual es el promedio de ingresos de aquellas personas que tienen una
 * altura inferior a 170 centímetros, y que pesan entre 80 y 90 kilos
 * y no fuman ni usan lentes y cuyo nivel educativo sea igual al que
 * se pasa como parámetro
 */
fun ejercicio3b(personas: IList<Persona>, nivel: String): Double {
    var contador = 0
    var sumatoriaIngresos = 0
    for (i in personas.indices){
        val p =personas[i]
        if (p.altura < 170 && p.peso >= 80 && p.peso <= 90 && p.fuma == false && p.tieneLentes == false && p.nivelEducativo == nivel){
            contador++
            sumatoriaIngresos += p.ingresos
        }
    }
    return sumatoriaIngresos / contador.toDouble()
}

/**
 * Cuál es el porcentaje de mujeres que viven en estrato 1, 2 o 3 y que tienen casa
 */
fun ejercicio3c(personas: IList<Persona>): Double {
    var contador = 0
    var contadorEstrato = 0
    for (i in personas.indices){
        val p = personas[i]
        contador++
        if (p.genero == "F" && p.estrato >= 1 && p.estrato <= 3 && p.tieneCasa == true){
            contadorEstrato++
        }
    }
    return (contadorEstrato / contador.toDouble()) * 100
}

/**
 * Hallar el indice de masa corporal de una persona
 * Este indice se halla p / h^2, donde p es el peso en kilos, y h es la altura
 * en centímetros.
 */
fun imc(persona: Persona): Double {
    var indiceMasaCorporal = (persona.peso / ((persona.altura * 0.01) * (persona.altura * 0.01)))
    return indiceMasaCorporal
}

/**
 * El nivel de peso de una persona depende del imc de esa persona
 * de acuerdo a la siguiente:
 * nivel = "Bajo peso" cuando el imc está por debajo de 18.5
 * nivel = "Normal" cuando el imc está entre 18.5 y 24.9
 * nivel = "Sobrepeso" cuando el imc está entre 25.0 y 29.9
 * nivel = "Obesidad" cuando el imc es 30.0 o superior
 * Escriba una función que halle el nivel de peso de una persona
 * USE LA FUNCIÓN IMC HECHA ANTERIORMENTE
 */
fun nivelPeso(p: Persona): String {
    if (imc(p) < 18.5){
        return "Bajo peso"
    }
    if (imc(p) >= 18.5 && imc(p) < 25.0){
        return "Normal"
    }
    if (imc(p) >= 25.0 && imc(p) < 30){
        return "Sobrepeso"
    }
    return "Obesidad"
}

/**
 * Halle el promedio de edad de los hombres obesos
 */
fun ejercicio3d(personas: IList<Persona>): Double {
    var contador = 0
    var sumatoriaEdad = 0
    for (i in personas.indices){
        val p =personas[i]
        if (p.genero == "M" && nivelPeso(p) == "Obesidad") {
            contador++
            sumatoriaEdad += p.edad

        }
    }
    return sumatoriaEdad / contador.toDouble()
}

/**
 * Hallar la cédula de la mujer más alta
 */
fun ejercicio4a(personas: IList<Persona>): Int {
    var cedulaMujer = 0
    var alturaMujerMasAlta = Int.MIN_VALUE
    for (i in personas.indices) {
        val p = personas[i]
        if (p.genero == "F") {
            if (p.altura > alturaMujerMasAlta) {
                alturaMujerMasAlta = p.altura
                cedulaMujer = p.cedula
            }
        }
    }
    return cedulaMujer
}


/**
 * Escriba una función que retorne la cédula del hombre
 * mayor de 30 años que tiene los ingresos más bajos
 */
fun ejercicio4b(personas: IList<Persona>): Int {
    var ingresosMasBajos = Int.MAX_VALUE
    var cedulaHombre = 0
    for (i in personas.indices){
        val p = personas[i]
        if (p.genero == "M" && p.edad > 30){
            if (p.ingresos < ingresosMasBajos){
                ingresosMasBajos = p.ingresos
                cedulaHombre = p.cedula
            }
        }
    }
    return cedulaHombre
}