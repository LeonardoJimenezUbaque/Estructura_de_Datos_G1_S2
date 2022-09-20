package pilas

/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad EAN (Bogotá - Colombia)
 * Departamento de Sistemas
 * Faculta de Ingeniería
 *
 * Proyecto Taller de Pilas
 * Autor: Universidad EAN - Septiembre 13, 2022
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

import ean.collections.*
import org.testng.Assert.*
import org.testng.annotations.Test

/**
 * A partir de una pila de palabras, retornar cuántas de esas
 * palabras son verbos. La pila original no debe verse modificada
 */
fun contarVerbos(palabras: IStack<String>): Int {
    var contador = 0
    var pila = palabras.copy()
    while(!pila.isEmpty){
        val palabra = pila.peek().lowercase()
        if(palabra.endsWith("ar")||palabra.endsWith("er")||palabra.endsWith("ir")){
            contador++
        }
        pila.pop()
    }

    return contador

}

/**
 * Ejercicio 02
 * Función para sumar los números pares de tres cifras que hay en una
 * pila de enteros. La pila original no debe verse modificada.
 */
fun sumarParesTresCifras(pila: IStack<Int>): Int {
    var copia = pila.copy()
    var suma = 0
    while(!copia.isEmpty){
        var numero = copia.peek()
        if(numero in 99 .. 999){
            if(numero%2==0) {
                suma += numero
            }
        }
        copia.pop()
    }
    return suma
}

/**
 * Ejercicio 03
 * Función para determinar cuál es el número más grande de dos cifras que hay
 * en una pila de números. Si no existe ningún número de dos cifras, retorne
 * null. La pila original no debe verse modificada.
 */
fun mayorDeDosCifras(pila: IStack<Int>): Int? {
    var copia = pila.copy()
    var mayor: Int? = null
    while(!copia.isEmpty){
        var numero = copia.peek()
        if(numero in 10 .. 99){
            if(mayor == null || numero>mayor!!) {
                mayor = numero
            }
        }
        copia.pop()
    }
    return mayor
}

/**
 * Ejercicio 01
 * Obtener y retornar el fondo de la pila. La pila original no debe verse
 * modificada.
 */
fun <T> obtenerFondo(pila: IStack<T>): T {
    var copia = pila.copy()
    var x:T = copia.peek()
    while(!copia.isEmpty){
        x = copia.peek()
        copia.pop()
    }
    return x
}

/**
 * Ejercicio 04
 * Hacer una función externa que permita guardar un elemento en el fondo
 * de la pila. GEnérica. La pila original debe verse modificada.
 */
fun <T> guardarEnElFondo(p: IStack<T>, elem: T) {
    val pilaAux: IStack<T> = TArrayStack()
    while(!p.isEmpty){
        var x = p.peek()
        pilaAux.push(x)
        p.pop()
    }
    p.push(elem)
    while(!pilaAux.isEmpty){
        var y = pilaAux.peek()
        p.push(y)
        pilaAux.pop()
    }
}

/**
 * Ejercicio 05
 * Función genérica para obtener el tamaño de una pila. La pila
 * original no debe verse modificada.
 */
fun <T> tamPila(p: IStack<T>) : Int {
    var pilaCopia:IStack<T>  = p.copy()
    var tam = 0
    while(!pilaCopia.isEmpty){
        pilaCopia.pop()
        tam++
    }
    return tam
}

/**
 * Ejercicio 06
 * Función genérica que permite Invertir una pila en otra.
 * Recibe la pila y retorna la pila, pero invertida.
 * Solo puede usarse las operaciones de las pilas, no listas.
 */
fun <T> invertirPila(pila: IStack<T>): IStack<T> {
    var pilaInvertida:IStack<T> = TArrayStack()
    while(!pila.isEmpty){
        var a = pila.peek()
        pilaInvertida.push(a)
        pila.pop()
    }
    return pilaInvertida
}


/**
 * Ejercicio 07
 * Función genérica que copia una pila en otra.
 * La función recibe la pila y retorna la copia.
 * No debe usarse el método copy de la pila ni listas.
 * La pila original no debe verse modificada.
 */
fun <T> copiarPila(pila: IStack<T>): IStack<T> {
    var pilaAuxiliar:IStack<T> = TArrayStack()
    var pilaCopia = pila.copy()
    while(!pilaCopia.isEmpty){
        var a = pilaCopia.peek()
        pilaAuxiliar.push(a)
        pilaCopia.pop()
    }
    var pilaNueva:IStack<T> = TArrayStack()
    while(!pilaAuxiliar.isEmpty){
        var a = pilaAuxiliar.peek()
        pilaNueva.push(a)
        pilaAuxiliar.pop()
    }
    return pilaNueva
}


/**
 * Ejercicio 08
 * Función genérica que recibe una pila y un elemento y que elimina de la
 * pila todas las ocurrencias del elemento que se recibe como parámetro.
 * No debe retornar nada.
 */
fun <T> eliminarElementoPila(pila: IStack<T>, elem: T) {
    var pilaAuxiliar:IStack<T> = TArrayStack()
    while(!pila.isEmpty){
        var a = pila.peek()
        pilaAuxiliar.push(a)
        if(a==elem){
            pilaAuxiliar.pop()
        }
        pila.pop()
    }
    while(!pilaAuxiliar.isEmpty){
        var b = pilaAuxiliar.peek()
        pila.push(b)
        pilaAuxiliar.pop()
    }
}

/**
 * Ejercicio 09
 * Invertir una lista de números utilizando una pila. La función no retorna,
 * debe modificar la lista
 */
fun invertirLista(list: IList<Int>) {
    var pila:IStack<Int> = TArrayStack()
    var pila2:IStack<Int> = TArrayStack()
    for(i in list){
        while(!pila.isEmpty){
            var x = pila.peek()
            pila2.push(x)
            pila.pop()
        }
        pila.push(i)
    }
    list.clear()
    while(!pila2.isEmpty){
        var y = pila2.peek()
        pila.push(y)
        list.add(y)
        pila2.pop()
    }

}


/**
 * Ejercicio 10
 * Usar una pila de letras para Determinar si una frase es palindrome o no
 */
fun palindrome(frase: String): Boolean {
    var pila:IStack<Char> = TArrayStack()
    var pila2:IStack<Char> = TArrayStack()
    var x = frase.length
    var k = 0
    while(k<x){
        pila.push(frase[k])
        k++
    }
    var pilaCopia = copiarPila(pila)
    while(!pilaCopia.isEmpty){
        var a = pilaCopia.peek()
        pila2.push(a)
        pilaCopia.pop()
    }
    return igualesPilas(pila, pila2)
}

/**
 * Ejercicio 11
 * Determinar si dos pilas son iguales.
 * Las pilas no deben ser modificadas.0
 */
fun <T> igualesPilas(pila1: IStack<T>, pila2: IStack<T>): Boolean {
    var pila1Copia = copiarPila(pila1)
    var pila2Copia = copiarPila(pila2)
    while(!pila1Copia.isEmpty && !pila2Copia.isEmpty){
        var a = pila1Copia.peek()
        var b = pila2Copia.peek()
        if(a!=b){
            return false
            break
        }
        pila1Copia.pop()
        pila2Copia.pop()
    }
    return true
}

/**
 * Escriba una función que reemplace cada aparición del elemento
 * oldItem por el elemento newItem en la pila.
 */
fun reemplazarElementoPila(pila: IStack<Int>, oldItem: Int, newItem: Int) {
    var pilaAuxiliar:IStack<Int> = TArrayStack()
    while(!pila.isEmpty){
        var a = pila.peek()
        pilaAuxiliar.push(a)
        if(a==oldItem){
            pilaAuxiliar.pop()
            pilaAuxiliar.push(newItem)
        }
        pila.pop()
    }
    while(!pilaAuxiliar.isEmpty){
        var b = pilaAuxiliar.peek()
        pila.push(b)
        pilaAuxiliar.pop()
    }
}

// Una clase que representa perros
data class Perro(var nombre: String, var edad: Int)

/**
 * Escriba una función que reciba una pila de perros y que retorne
 * una lista con los nombres de aquellos perros que tengan un nombre
 * que termine en vocal y cuya edad sea inferior a la edad que se
 * pasa como parámetro. La pila original no debe verse modificada.
 */
fun perrosMenoresEdad(perros: IStack<Perro>, edad: Int): IList<String> {
    val pilaAuxiliar = perros.copy()
    var listaPerros: IList<String> = TArrayList()
    while (!pilaAuxiliar.isEmpty) {
        var vocal = pilaAuxiliar.peek().nombre.lowercase()
        var edadPerros = pilaAuxiliar.peek().edad
        if (vocal.endsWith("a") || vocal.endsWith("e") || vocal.endsWith("i") || vocal.endsWith("o") || vocal.endsWith("u")) {
            var a = pilaAuxiliar.peek().nombre
            if (edadPerros < edad) {
                listaPerros.add(a)
            }
        }
    pilaAuxiliar.pop()
    }
    return listaPerros
}

//------------------------------------------------------------------------------------------------

class ProbarPila {
    @Test
    fun pruebaEjercicio01() {
        val pila: IStack<Int> = TLinkedStack()

        pila.push(1)
        pila.push(2)
        pila.push(3)
        pila.push(4)
        pila.push(5)
        pila.push(6)

        println("La pila es $pila")
        println("El tope es ${pila.peek()}")
        println("El fondo es ${obtenerFondo(pila)}")

        assertEquals(1, obtenerFondo(pila))
        println("Prueba Superada ✔")
    }

    @Test
    fun pruebaEjercicio02() {
        val p: IStack<Int> = TLinkedStack()

        p.push(2)
        p.push(25)
        p.push(250)
        p.push(2500)
        p.push(100)
        p.push(125)
        p.push(81)

        assertEquals(350, sumarParesTresCifras(p))
        println("Prueba Superada ✔")
    }

    @Test
    fun pruebaEjercicio03() {
        var p: IStack<Int> = TLinkedStack()

        p.push(2)
        p.push(25)
        p.push(250)
        p.push(50)
        p.push(100)
        p.push(95)
        p.push(81)

        assertEquals(mayorDeDosCifras(p), 95)
        println("Primera Prueba Superada ✔")

        p.clear()
        p.push(3)
        p.push(4)
        p.push(5)

        assertNull(mayorDeDosCifras(p))
        println("Prueba Superada ✔")

    }

    @Test
    fun pruebaEjercicio04() {
        val pila: IStack<Int> = TLinkedStack()

        pila.push(1)
        pila.push(2)
        pila.push(3)
        pila.push(4)
        pila.push(5)
        pila.push(6)

        assertEquals(1, obtenerFondo(pila))

        guardarEnElFondo(pila, 10)

        assertEquals(10, obtenerFondo(pila))
        println("Prueba superada!")
    }


    @Test
    fun pruebaEjercicio05() {
        val pila: IStack<String> = TLinkedStack()

        assertEquals(0, tamPila(pila))

        pila.push("Hola")
        pila.push("nano")
        pila.push("shell")
        pila.push("rojo")

        assertEquals(4, tamPila(pila))
        println("Prueba Superada ✔")
    }

    @Test
    fun pruebaEjercicio06() {
        val pila: IStack<String> = TLinkedStack()
        val lista = TList("uno", "dos", "tres", "cuatro", "cinco")

        for (elem in lista) {
            pila.push(elem)
        }

        val inv = invertirPila(pila)
        for (elem in lista) {
            assertEquals(elem, inv.peek())
            inv.pop()
        }
        println("Prueba Superada ✔")
    }

    @Test
    fun pruebaEjercicio07() {
        val pila: IStack<Int> = TLinkedStack()
        val lista = Lists.of(5, 11, 8, -3, 6, 4, 31)

        for (elem in lista) {
            pila.push(elem)
        }

        val copia = copiarPila(pila)
        for (n in lista.size - 1 downTo 0) {
            assertEquals(lista[n], copia.peek())
            copia.pop()
        }
        println("Prueba Superada ✔")
    }

    @Test
    fun pruebaEjercicio08() {
        val pila: IStack<Int> = TLinkedStack()
        val lista = Lists.of(5, 11, 8, -3, 5, 4, 31, 5)

        for (elem in lista) {
            pila.push(elem)
        }

        eliminarElementoPila(pila, 5)

        for (n in lista.size - 1 downTo 0) {
            if (lista[n] != 5) {
                assertEquals(lista[n], pila.peek())
                pila.pop()
            }
        }
        assertTrue(pila.isEmpty)
        println("Prueba Superada ✔")
    }

    @Test
    fun pruebaEjercicio09() {
        val lista = Lists.of(8, 1, 7, 6, -4, 5, 1, 31)
        val invlst = lista.copy()

        invertirLista(lista)

        for (i in 0 until lista.size) {
            assertEquals(lista[i], invlst[lista.size - i - 1])
        }
        println("Prueba Superada ✔")
    }

    @Test
    fun pruebaEjercicio10() {
        assertTrue(palindrome("nosubasabuson"))
        assertTrue(palindrome("lavanesabasenaval"))
        assertTrue(palindrome("logracasillasallisacargol"))
        assertFalse(palindrome("arrozconleche"))
        println("Prueba Superada ✔")
    }

    @Test
    fun pruebaEjercicio11() {
        val pila1: IStack<String> = TLinkedStack()
        val pila2: IStack<String> = TLinkedStack()
        val pila3: IStack<String> = TLinkedStack()
        val lista = Lists.of("uno", "dos", "tres", "cuatro", "cinco")

        for (elem in lista) {
            pila1.push(elem)
            pila2.push(elem)
            pila3.push(elem)
            pila3.push(elem)
        }

        assertTrue(igualesPilas(pila1, pila2))
        assertFalse(igualesPilas(pila3, pila2))
        println("Prueba Superada ✔")
    }

    @Test
    fun pruebaContarVerbos() {
        val palabras: IStack<String> = TArrayStack()

        palabras.push("casa")
        palabras.push("casar")
        palabras.push("yuca")
        palabras.push("camisa")
        palabras.push("lluvia")
        palabras.push("llover")
        palabras.push("vives")
        palabras.push("vivir")
        palabras.push("partir")
        palabras.push("toma")
        palabras.push("épico")
        palabras.push("abrigo")

        assertEquals(4, contarVerbos(palabras))
        println("Prueba Superada ✔")
    }

    @Test
    fun pruebaReemplazar() {
        val pila: IStack<Int> = TArrayStack()

        pila.push(4)
        pila.push(2)
        pila.push(3)
        pila.push(5)
        pila.push(2)
        pila.push(1)

        reemplazarElementoPila(pila, 2, 7)
        var n = 0
        var x = 0

        while (!pila.isEmpty) {
            n++
            if (pila.peek() == 7) {
                x++
            }
            else if (pila.peek() == 2) {
                assertEquals(7, pila.peek())
            }
            pila.pop()
        }
        assertTrue(n == 6 && x == 2)
        println("Prueba Superada ✔")

    }

    @Test
    fun probarPerros() {
        var pilaPerros: IStack<Perro> = TLinkedStack()

        with (pilaPerros) {
            push(Perro("juana", 12))
            push(Perro("lila", 6))
            push(Perro("leon", 5))
            push(Perro("dion", 7))
            push(Perro("leila", 11))
            push(Perro("angel", 3))
            push(Perro("angela", 4))
            push(Perro("terso", 5))
        }

        val res = perrosMenoresEdad(pilaPerros, 10)
        val res1 = res.sort()
        assertEquals(Lists.of("angela", "lila", "terso"), res1)
        println("Prueba superada!")
    }
}