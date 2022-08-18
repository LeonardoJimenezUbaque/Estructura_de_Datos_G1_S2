package Quiz_01

fun total_vendido(Cantidad_A: Int, Cantidad_C: Int, Cantidad_Z: Int): Int {
    val A = 1000
    val C = 2500
    val Z = 3000
    var vendido = (Cantidad_A * A) + (Cantidad_C * C) + (Cantidad_Z * Z)

    return vendido
}

fun main() {
    println("Digite cantidad del producto A")
    var a = readLine()!!.toInt()
    println("Digite cantidad del producto C")
    var c = readLine()!!.toInt()
    println("Digite cantidad del producto Z")
    var z = readLine()!!.toInt()

    var respuesta = total_vendido(a, c, z)
    println("El total vendido en el dia es de: $respuesta")
}