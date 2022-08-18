package Taller_05

import kotlin.math.*

/**
 * Un número complejo consta de una parte real y una parte imaginaria
 */
class NumeroComplejo(var parteReal: Double, var parteImaginaria: Double) {
    // Halla el valor absoluto del número complejo
    fun valorAbsoluto(): Double {
        var vAbsoluto = sqrt(parteReal.pow(2) + parteImaginaria.pow(2))
        return vAbsoluto
    }

    // Halla la fase o argumento del número complejo
    fun argumento(): Double {
        var arg = atan(parteImaginaria / parteReal)
        return arg
    }

    // Halla el inverso o recíproco de un número complejo
    fun inverso(): NumeroComplejo {
        var inversoReal = ((parteReal / (parteReal.pow(2) + parteImaginaria.pow(2))))
        var inversoImg = ((parteImaginaria / (parteReal.pow(2) + parteImaginaria.pow(2))) * -1)
        return NumeroComplejo(inversoReal, inversoImg)
    }

    // Multiplica la parte real y la parte imaginaria por un escalar
    fun productoPorEscalar(escalar: Double) {
        this.parteReal = escalar * parteReal
        this.parteImaginaria =  escalar * parteImaginaria
    }

    // Obtiene una versión String del número complejo
    override fun toString(): String {
        return String.format("%.2f + (%.2f)i", parteReal, parteImaginaria)
    }
}

// Función externa que halla la suma de dos números complejos
fun sumarNumComplejos(num1: NumeroComplejo, num2: NumeroComplejo): NumeroComplejo {
    var sumaNumReal = num1.parteReal + num2.parteReal
    var sumaNumImg = num1.parteImaginaria + num2.parteImaginaria
    var sumaNumComp = NumeroComplejo(sumaNumReal, sumaNumImg)
    return sumaNumComp
}

// -----------------------------------------------------------------------------------

// Clase Producto
class Producto(val nombre: String,
               val tipo: String,
               var valorUnitario: Double,
               var cantidadBodega: Int,
               val cantidadMinima: Int) {
    // Retornar el IVA correspondiente al producto. Ojo: este IVA depende del tipo de producto.
    fun darIVA(): Double {
        var IVA = 0.0
        if(tipo == "supermercado"){
            IVA = 0.04
        }
        else if (tipo == "drogueria"){
            IVA = 0.12
        }
        else if (tipo == "papeleria"){
            IVA = 0.16
        }
    return IVA
    }

    //  Calcula el valor final del producto, incluyendo el IVA.
    fun calcularPrecioFinal(): Double {
        var valorFinal = valorUnitario + (valorUnitario * darIVA())
        return valorFinal
    }

    // Vende la cantidad de unidades dada por parámetro.
    fun vender(cantidad: Int) {
        this.cantidadBodega = this.cantidadBodega - cantidad
        if (this.cantidadBodega <= 0){
            this.cantidadBodega = 0
        }
    }

    // Aumenta la cantidad de unidades en bodega del producto en la cantidad que se recibe como dato de entrada.
    fun abastecer(cantidad: Int) {
        this.cantidadBodega = this.cantidadBodega + cantidad
    }

    // retorna True sin la cantidad en Bodega es menor que la cantidad mínima, y False en caso contrario.
    fun puedeAbastecer(): Boolean {
        var abastecimientoBodega = true
        if (cantidadBodega < cantidadMinima){
            abastecimientoBodega = true
        }
        else if (cantidadBodega > cantidadMinima){
            abastecimientoBodega = false
        }
    return abastecimientoBodega
    }

    // Obtener una representación visual de un producto.
    override fun toString(): String {
        return "Producto(nombre='$nombre', tipo='$tipo', valorUnitario=$valorUnitario, cantidadBodega=$cantidadBodega, cantidadMinima=$cantidadMinima)"
    }
}