/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad Ean (Bogotá - Colombia)
 * Programa de Ingeniería de Sistemas
 * Licenciado bajo el esquema Academic Free License version 2.1
 * <p>
 * Etructura de Datos - Taller 06
 * Ejercicio: Empresa de Transporte
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package empresaTransporte.mundo

/**
 * Empresa de transporte.
 */
class EmpresaTransporte() {

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------
    /**
     * Camión 1 de la empresa.
     */
    val camion1 = Camion("BAC213", 150, 85.0)

    /**
     * Camión 2 de la empresa.
     */
    val camion2 = Camion("CAP384", 190, 70.0)

    /**
     * Camión 3 de la empresa.
     */
    val camion3 = Camion("GER273", 280, 100.0)

    /**
     * Camión 4 de la empresa.
     */
    val camion4 = Camion("JKV232", 215, 110.0)

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Carga el camión que posee la matrícula dada con la carga dada por parámetro.
     * Retorna true si pudo realizar la carga, false en caso contrario.
     */
    fun cargarCamion(matriculaCamion: String, pesoCargar: Int): Boolean {
        return when (matriculaCamion) {
            camion1.matricula -> return camion1.cargar(pesoCargar)
            camion2.matricula -> return camion2.cargar(pesoCargar)
            camion3.matricula -> return camion3.cargar(pesoCargar)
            camion4.matricula -> return camion4.cargar(pesoCargar)
            else -> false
        }
    }


    /**
     * Descarga el camión que posee la matrícula dada por parámetro.
     */
    fun descargarCamion(matriculaCamion: String): Unit {
        if (camion1.matricula == matriculaCamion) {
            return camion1.descargar()
        }
        if (camion2.matricula == matriculaCamion) {
            return camion2.descargar()
        }
        if (camion3.matricula == matriculaCamion) {
            return camion3.descargar()
        }
        if (camion4.matricula == matriculaCamion) {
            return camion4.descargar()
        }
    }

    /**
     * Retorna la capacidad total de carga de todos los camiones. Es decir,
     * la suma de las capacidades de los 4 camiones.
     */
    fun darCapacidadTotal(): Int {
        return camion1.capacidad + camion2.capacidad + camion3.capacidad + camion4.capacidad
    }

    /**
     * Retorna la carga total de los camiones.
     */
    fun darCargaTotal(): Int {
        return camion1.cargaActual + camion2.cargaActual + camion3.cargaActual + camion4.cargaActual

    }

    /**
     * Retorna la carga promedio por camión.
     * O sea, la carga total dividida por el número de camiones.
     */
    fun calcularCargaPromedio(): Double {
        return darCargaTotal() /4.0
    }

    /**
     * Retorna el mejor camión para transportar la carga especificada.
     * El mejor camión es aquel que tiene la capacidad para cargar la
     * carga dada y además tiene un menor consumo de gasolina.
     * Si ningún camión es apto para la carga retorna null.
     */
    fun darMejorCamion(pesoCarga: Int): Camion? {
        var mejorCamion: Camion? = null
        var menorConsumo = Double.MAX_VALUE

        if (camion1.capacidad >= pesoCarga && camion1.consumo < menorConsumo) {
            // El camion 1 es el mejor camion
            mejorCamion = camion1
            menorConsumo = camion1.consumo
        }
        if (camion2.capacidad >= pesoCarga && camion2.consumo < menorConsumo) {
            // El camion 2 es el mejor camion
            mejorCamion = camion2
            menorConsumo = camion2.consumo
        }
        if (camion3.capacidad >= pesoCarga && camion3.consumo < menorConsumo) {
            // El camion 3 es el mejor camion
            mejorCamion = camion3
            menorConsumo = camion3.consumo
        }
        if (camion4.capacidad >= pesoCarga && camion4.consumo < menorConsumo) {
            // El camion 4 es el mejor camion
            mejorCamion = camion4
            menorConsumo = camion4.consumo
        }
        return mejorCamion
    }

    /**
     * Retorna la matrícula de aquel camión de los cuatro camiones de la
     * empresa de transporte que tiene la carga actual más grande.
     */
    fun matriculaCamionMasCargado(): String {
        var camionMasCargado = camion1

        if (camion2.cargaActual > camionMasCargado.cargaActual) {
            // El camion 2 es el camion más cargado
            camionMasCargado = camion2
        }
        if (camion3.cargaActual > camionMasCargado.cargaActual) {
            // El camion 3 es el camion más cargado
            camionMasCargado = camion3
        }
        if (camion4.cargaActual > camionMasCargado.cargaActual) {
            // El camion 4 es el camion más cargado
            camionMasCargado = camion4
        }
        return camionMasCargado.matricula
    }

    /**
     * Obtiene y retorna cuántos camiones están descargados.
     */
    fun cantidadCamionesDescargados(): Int {
        var conVacios = 0

        if (camion1.cargaActual == 0){
            conVacios++
        }
        if (camion2.cargaActual == 0){
            conVacios++
        }
        if (camion3.cargaActual == 0){
            conVacios++
        }
        if (camion4.cargaActual == 0){
            conVacios++
        }
        return conVacios
    }
}