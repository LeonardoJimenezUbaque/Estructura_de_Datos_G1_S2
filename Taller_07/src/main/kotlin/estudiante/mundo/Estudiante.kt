/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad Ean (Bogotá - Colombia)
 * Programa de Ingeniería de Sistemas
 * Licenciado bajo el esquema Academic Free License version 2.1
 * <p>
 * Etructura de Datos - Taller 07
 * Ejercicio: El Estudiante
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package estudiante.mundo

/**
 * Estudiante que tiene 4 cursos.
 */
class Estudiante(
    val codigo: Int = 1001001001,       // Código del estudiante.
    val nombre: String = "Juliana",     // Nombre del estudiante.
    val apellido: String = "Ramírez"    // Apellido del estudiante.
) {
    // -----------------------------------------------------------------
    // Atributos Adicionales
    // -----------------------------------------------------------------

    val curso1 = Curso("VFP0012", "Algoritmos", "Sistemas", 3);
    val curso2 = Curso("AFP0012", "Calculo", "Matematica", 3);
    val curso3 = Curso("EST0110", "Bioestadistica", "Biologia", 4);
    val curso4 = Curso("ALG1100", "Fisica 1", "Fisica", 3);

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Calcula el promedio ponderado del estudiante de los cursos que tienen nota asignada.
     * Para hallar el promedio ponderado debe sumarse la multiplicacion de la nota por
     * los creditos y dividirlo por la suma de los créditos. Ojo: SOLO LOS QUE TIENEN NOTA
     */
    fun calcularPromedioEstudiante(): Double {
        var promedio: Double
        var creditosTotales = 0
        var nota1 = 0.0
        var nota2 = 0.0
        var nota3 = 0.0
        var nota4 = 0.0
        if (curso1.estaCalificado()) {
            nota1 = curso1.darNota() * curso1.creditos
            creditosTotales += curso1.creditos
        }
        if (curso2.estaCalificado()) {
            nota2 = curso2.darNota() * curso2.creditos
            creditosTotales += curso2.creditos
        }
        if (curso3.estaCalificado()) {
            nota3 = curso3.darNota() * curso3.creditos
            creditosTotales += curso3.creditos
        }
        if (curso4.estaCalificado()) {
            nota4 = curso4.darNota() * curso4.creditos
            creditosTotales += curso4.creditos
        }
        promedio = (nota1 + nota2 + nota3 + nota4) / creditosTotales
        return promedio
    }

    /**
     * Indica si el estudiante se encuentra en prueba académica (promedio < 65.0).
     * @return Retorna true si se encuentra en prueba, false de lo contrario.
     */
    fun estaEnPrueba(): Boolean {
        var enPrueba = false
        if(calcularPromedioEstudiante() < 65){
            enPrueba = true
        }
        return enPrueba
    }

    /**
     * Indica si el estudiante es candidato a una beca. (promedio > 95.0)
     * Retorna true si es candidato a beca, false de lo contrario.
     */
    fun esCandidatoBeca(): Boolean {
        var candidatoBeca = false
        if(calcularPromedioEstudiante() >= 95){
            candidatoBeca = true
        }
        return candidatoBeca
    }

    /**
     * Buscar un curso dado su código.
     * Retorna el Curso buscado, null en caso de no encontrarlo.
     */
    fun buscarCurso(codigoCurso: String): Curso? {
        if (curso1.codigo == codigoCurso){
            return curso1
        }
        if (curso2.codigo == codigoCurso) {
            return curso2
        }
        if (curso3.codigo == codigoCurso) {
            return curso3
        }
        if (curso4.codigo == codigoCurso) {
            return curso4
        }
    return null
    }

    /**
     * Asigna la nota al curso dado por parámetro.
     * Retorna true si pudo asignar la nota, false de lo contrario.
     */
    fun asignarNotaCurso(codigoCurso: String, nota: Double): Boolean {
        var notaAsignada = false
        var curso = buscarCurso(codigoCurso)
        if(codigoCurso == curso?.codigo){
            curso.asignarNota(nota)
            notaAsignada = true
        }
        return notaAsignada
    }

    /**
     * Cambia el curso con el código dado por parámetro a un nuevo curso
     * con los valores dados por parámetro. Si ya existe un curso con el
     * código que se desea asignar, no se cambiar la información del curso.
     * Retorna true si se cambió el curso, false si no se cambió porque
     * ya existía un curso con el código que se deseaba asignar.
     */
    fun cambiarCurso(codigoActual: String, nuevoCodigo: String, nuevoNombre: String, nuevoCreditos: Int, carrera: String): Boolean {
        var curso = buscarCurso(codigoActual)
        if(nuevoCodigo != curso1.codigo && nuevoCodigo != curso2.codigo && nuevoCodigo != curso3.codigo && nuevoCodigo != curso4.codigo){
            if (codigoActual == curso?.codigo){
                curso.codigo = nuevoCodigo
                curso.nombre = nuevoNombre
                curso.creditos = nuevoCreditos
                curso.carrera = carrera
                return true
            }
        }
        return false
    }

    /**
     * Retorna el curso con la mejor nota de los 4 cursos que tiene el estudiante
     */
    fun mejorNota(): Curso? {
        var mejorNota = curso1
        if (curso2.darNota() > mejorNota.darNota()){
            mejorNota = curso2
        }
        if (curso3.darNota() > mejorNota.darNota()){
            mejorNota = curso3
        }
        if (curso4.darNota() > mejorNota.darNota()){
            mejorNota = curso4
        }
        return mejorNota
    }

    /**
     * Retorna la cantidad de cursos reprobados por el estudiantes
     */
    fun cursosReprobados(): Int {
        var contador =0
        if (!curso1.aproboCurso()){
            contador++
        }
        if (!curso2.aproboCurso()){
            contador++
        }
        if (!curso3.aproboCurso()){
            contador++
        }
        if (!curso4.aproboCurso()){
            contador++
        }
        return contador
    }
}