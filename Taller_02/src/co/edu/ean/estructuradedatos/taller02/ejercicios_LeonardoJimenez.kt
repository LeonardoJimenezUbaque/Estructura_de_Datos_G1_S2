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

import kotlin.math.ceil
import kotlin.math.round

/**
 * Ejercicio 1:
 * Una tienda de licores compra a su distribuidor cajas de vino que luego vende
 * por botellas. Dado una caja de vino que tiene un costo c y contiene n botellas,
 * se desea calcular el precio p al que se debe vender cada botella, de manera tal
 * que se obtenga un 30% de utilidad sobre el costo total de las cajas.
 */
fun ejercicio1(c: Double, n: Int): Double {
    var p = (c/n)*(1.3)
    return p
}

/**
 * Ejercicio 2:
 * Se sabe que un profesor universitario contratado como catedrático, dedica
 * una hora a preparar una clase de dos horas y por cada diez horas de clase
 * desarrolladas hace una evaluación, la cual le toma 4 horas calificar.
 * Si al docente se le asigna un curso de n horas al semestre, ¿cuántas horas
 * trabajará en total durante el semestre?
 */
fun ejercicio2(n: Int): Int {
    var h = n + n / 2 + (n / 10) * 4
    return h
}

/**
 * Ejercicio 3
 * Un profesor diseña un examen con n preguntas, estima que para calificar
 * cada pregunta requiere m minutos. Si el examen se aplica a k estudiantes,
 * ¿cuánto tiempo (horas y minutos) necesita para calificar todos los exámenes?.
 */
fun ejercicio3(n: Int, m: Int, k: Int): Pair<Int, Int> {
    var horas = (n * m * k)/60
    var minutos = (n * m * k)%60
    return horas to minutos
}

/**
 * Ejercicio 4:
 * Tres personas deciden invertir su dinero para fundar una empresa. Cada una
 * de ellas invierte una cantidad distinta. Obtener el porcentaje que cada cual
 * invierte con respecto a la cantidad total invertida.
 */
fun ejercicio4(persona1: Double, persona2: Double, persona3: Double): Triple<Double, Double, Double> {
    var cantidadTotal = persona1 + persona2 + persona3
    var ppersona1 = (persona1/cantidadTotal)
    var ppersona2 = (persona2/cantidadTotal)
    var ppersona3 = (persona3/cantidadTotal)
    return Triple(ppersona1, ppersona2, ppersona3)
}

/**
 * Ejercicio 5:
 * Dado un número de 3 dígitos, retornar cada uno de sus tres dígitos :
 * miles, centenas, decenas y unidades.
 */
fun ejercicio5(numero: Int): Triple<Int, Int, Int> {
    var unidades = (numero/1)%10
    var decenas = (numero/10)%10
    var centenas = (numero/100)%10
    return Triple(centenas, decenas, unidades)
}

/**
 * Ejercicio 6:
 * Un estudiante desea saber cuál será su calificación final en Programación.
 * Dicha calificación se compone del promedio de tres notas parciales. Cada
 * nota parcial se obtiene a partir de un taller, una evaluación teórica y
 * una evaluación práctica. Los talleres equivalen al 25% de la nota del
 * parcial, las evaluaciones teóricas al 35% y las evaluaciones prácticas al 40%.
 */
fun ejercicio6(taller_01: Double, evaluacionTeorica_01: Double, evaluacionPractica_01: Double,taller_02: Double, evaluacionTeorica_02: Double, evaluacionPractica_02: Double, taller_03: Double, evaluacionTeorica_03: Double, evaluacionPractica_03: Double): Double {
    var notaParcial1 = taller_01 * 0.25 + evaluacionTeorica_01 * 0.35 + evaluacionPractica_01 * 0.4
    var notaParcial2 = taller_02 * 0.25 + evaluacionTeorica_02 * 0.35 + evaluacionPractica_02 * 0.4
    var notaParcial3 = taller_03 * 0.25 + evaluacionTeorica_03 * 0.35 + evaluacionPractica_03 * 0.4
    var promedioNotas = (notaParcial1 + notaParcial2 + notaParcial3) / 3
    return round(promedioNotas)
}

/**
 * Ejercicio 7:
 * Las utilidades de una empresa se distribuyen entre tres socios así: socio
 * A = 40%, socio B = 25% y socio C = 35%. Dada una cantidad de dinero
 * ¿cuánto corresponderá a cada uno?
 */
fun ejercicio7(cantidadDinero: Double): Triple<Double, Double, Double> {
    var socioA = cantidadDinero * 0.4
    var socioB = cantidadDinero * 0.25
    var socioC = cantidadDinero * 0.35
    return Triple(socioA, socioB, socioC)
}

/**
 * Ejercicio 8:
 * Un vendedor recibe un 10% de comisión sobre sus ventas. Si en un mes
 * cualquiera hace tres ventas por valores diferentes ¿cuánto recibirá
 * por comisión en cada una de las ventas? y ¿cuánto en total?
 */
fun ejercicio8(venta1: Double, venta2: Double, venta3: Double): Pair<Triple<Double, Double, Double>, Double> {
    var cventa1 = venta1 * 0.1
    var cventa2 = venta2 * 0.1
    var cventa3 = venta3 * 0.1
    var comisionTotal = cventa1 + cventa2 + cventa3
    return Pair(Triple(cventa1, cventa2, cventa3), comisionTotal)
}

/**
 * Ejercicio 9:
 * En el nuevo edificio de la universidad, cada piso tendrá el mismo
 * número de salones y suponga que todos los salones del nuevo edificio
 * tendrán el mismo número de sillas, conocida esta como la capacidad del
 * salón. Calcule el número de salones y el número de pisos que tendrá
 * el nuevo edificio a partir de la capacidad del salón, el número
 * de salones que habrá en cada piso y el número de
 * estudiantes que van a la universidad.
 */
fun ejercicio9(capacidadSalon: Int, numeroSalonesPiso: Int, numeroEstudiantes: Int): Pair<Double, Double> {
    var cantidadSalones: Double = ceil(numeroEstudiantes.toDouble() / capacidadSalon)
    var numeroPisos: Double = ceil((cantidadSalones / numeroSalonesPiso))
    return cantidadSalones to numeroPisos
}

/**
 * Ejercicio 10:
 * Un año es bisiesto si es múltiplo de 4 pero no de 100, también se
 * es bisiesto cuando es múltiplo de 400. Escriba una función que reciba
 * un año (un número entero) y que retorne si ese año es bisiesto o no.
 * Ejemplo: 2024 es bisiesto, pero 1900 no lo fue.
 */
fun ejercicio10(anio: Int): Boolean {
    val condicion1 = anio%4
    val condicion2 = anio%100
    val condicion3 = anio%400
    var bisiestro:Boolean = true
    bisiestro = condicion1 == 0 && condicion2!=0 || condicion3 == 0
    return bisiestro
}