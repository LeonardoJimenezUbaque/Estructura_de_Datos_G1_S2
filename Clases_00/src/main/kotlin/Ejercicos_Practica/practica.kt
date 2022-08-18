package Ejercicos_Practica

import kotlin.math.PI
import kotlin.math.pow

class circulo(val diametro:Double){
    fun area()=(diametro/2).pow(2)* PI
}
class rectangulo(val base:Double, val altura:Double){
    fun area1()=base*altura
}
class trapecio(val basemayor:Double, val basemenor:Double, val altura:Double){
    fun area2()=(basemayor+basemenor)/2*altura
}

fun areaterreno(x:Double, y:Double, w:Double, z:Double):Double{
    val mediocirculo=circulo(diametro=y)
    val centro=rectangulo(base=y, altura = x)
    val parteInferior=trapecio(basemayor = z, basemenor = y, altura = w)
    return (mediocirculo.area())/2+centro.area1()+parteInferior.area2()
}