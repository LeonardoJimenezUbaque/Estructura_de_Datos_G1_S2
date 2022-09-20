/**
 *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad EAN (Bogotá - Colombia)
 * Departamento de Sistemas
 * Faculta de Ingeniería
 *
 * Proyecto EAN Collections
 * @author UniversidadEAN
 * Fecha: Ago 30, 2022
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package universidadean.taller10

/**
 * Implementación de la interface IList pero utilizando
 * nodos sencillamente encadenados. Esta lista consiste
 * en una secuencia de nodos, en los que se guardan
 * campos de datos arbitrarios y una referencia, enlaces
 * o punteros al nodo posterior.
 */
class LinkedList<T>() : IList<T> {
    //---------------------------------------------------------
    // Definición de un Nodo
    //---------------------------------------------------------
    class Nodo<T>(var info: T, var sig: Nodo<T>?=null)

    //---------------------------------------------------------
    // Atributos
    //---------------------------------------------------------
    /**
     * El número de elementos que tiene actualmente la lista
     */
    private var tam: Int = 0

    /**
     * primero referencia o apunta al primer nodo de la lista
     */
    private var primero: Nodo<T>? = null

    //---------------------------------------------------------
    // Métodos a implementar
    //---------------------------------------------------------

    /**
     * Retorna `true` si la lista está vacía (no contiene elementos),
     * retorna `false` si tiene al menos un elemento
     */
    override fun isEmpty(): Boolean = tam == 0


    /**
     * Retona el número de elementos que hacen parte de la lista
     */
    override fun size(): Int = tam
    /**
     * Agrega un nuevo elemento al principio de la lista
     */
    override fun addToHead(element: T) {
        // Crear nodo
        val n = Nodo(element)
        if (primero != null){
            n.sig = primero
        }
        primero = n
        tam++
    }

    /**
     * Agrega un elemento al final de la lista
     */
    override fun add(element: T) {
        val n = Nodo(element)
        if (primero == null) {
            primero == n
        }
        else {
            var p = primero
            while (p!!.sig != null) {
                p = p.sig
            }
            p!!.sig = n
        }
        tam++
    }

    /**
     * Agrega un elemento en la posición específica de la lista
     */
    override fun add(position: Int, element: T) {
        require(position in  0 until tam)
        if (position == 0) {
            addToHead(element)
        }
        else if (position == tam - 1) {
            add(element)
        }
        else {
            val n = Nodo(element)
            var p = primero
            var i = 0
            while (i != position - 1) {
                p = p!!.sig
                i++
            }
            p!!.sig = n
        }
        tam++
    }

    /**
     * Elimina el primer elemento de la lista
     */
    override fun removeFirst() {
        primero = primero!!.sig
        tam--
    }

    /**
     * Elimina el último elemento de la lista
     */
    override fun removeLast() {
        if (tam == 1) {
            primero = null
        }
        else {
            var q = primero
            var p: Nodo<T>? = null
            while (q!!.sig != null) {
                p = q
                q = q!!.sig
            }
            p!!.sig = null
        }
        tam--
    }

    /**
     * Elimina el elemento que se encuentra en la posición indicada
     */
    override fun remove(position: Int) {
        require(position in  0 until tam)
        if (position == 0){
            removeFirst()
        }
        else if (position == tam-1){
            removeLast()
        }
        else{
            var p = primero
            var q: Nodo<T>? = null
            var r: Nodo<T>? = null
            var i = 0
            while (i != position-1){
                p = p!!.sig
                i++
            }
            q = p!!.sig
            r = q!!.sig
            p!!.sig = r
            tam--
        }
    }

    /**
     * Elimina todos los elementos de esta lista
     */
    override fun clear() {
        tam = 0
        primero = null
    }

    /**
     * Retorna el elemento que se encuentra una determinada posición de la lista
     */
    override fun get(position: Int): T {
        require(position in 0 until tam)
        var p = primero
        var i = 0
        while (i != position) {
            p = p!!.sig
            i++
        }
        return p!!.info
    }

    /**
     * Retorna la posición de la primer vez que encuentra el elemento
     * especificado en la lista, o -1 si el elemento dado no
     * existe en la lista
     */
    override fun indexOf(element: T): Int {
        var p = primero
        var i = 0
        while (p != null) {
            if (p!!.info == element){
                return i
            }
            p = p!!.sig
            i++
        }
        return -1
    }

    /**
     * Reemplaza el elemento en la posición especificada en la lista
     * por elemento dado.
     */
    override fun set(position: Int, element: T) {
        val n = Nodo(element)
        var p = primero
        var i = 0
        while (i != position-1){
            p = p!!.sig
            i++
        }
        p!!.sig = n
    }
}