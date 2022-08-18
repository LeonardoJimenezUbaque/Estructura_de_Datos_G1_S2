package Parcial_00

class Tienda (var nombre: String, var direccion: String, var telefono: Int) {
    fun buscarPorTitulo(titulo: String): Libro?{
        when(titulo){
            libro1.titulo -> return libro1
            libro2.titulo -> return libro2
            libro3.titulo -> return libro3
            libro4.titulo -> return libro4
            libro5.titulo -> return libro5
        }
        return null

    }

    fun buscarPorISBN(isbn: String): String{
        when(isbn){
            libro1.isbn -> return libro1.titulo
            libro2.isbn -> return libro2.titulo
            libro3.isbn -> return libro3.titulo
            libro4.isbn -> return libro4.titulo
            libro5.isbn -> return libro5.titulo
        }
        return ""
    }

    fun comprarLibro(isbn: String, cantidad: Int, precio: Double){
        var titulo = buscarPorISBN(isbn)
        var libro = buscarPorTitulo(titulo)
        libro?.comprar(cantidad,precio)
    }

    fun venderLibro(isbn: String, cantidad: Int){
        var titulo = buscarPorISBN(isbn)
        var libro = buscarPorTitulo(titulo)
        libro?.vender(cantidad)
    }

    fun libroMasCostos(): Libro{
        var libroMasCostoso = libro1
        if(libro2.precio > libroMasCostoso.precio){
            libroMasCostoso = libro2
        }
        if(libro3.precio>libroMasCostoso.precio){
            libroMasCostoso = libro3
        }
        if(libro4.precio>libroMasCostoso.precio){
            libroMasCostoso = libro4
        }
        if(libro5.precio>libroMasCostoso.precio){
            libroMasCostoso = libro5
        }
        return libroMasCostoso
        }
    }

    fun libroMasVendido(): Libro?{
        var libroMasVendido = libro1
        if(libro2.cantidadVendidaAnioLibro > libroMasVendido.precio){
            libroMasVendido = libro2
        }
        if(libro3.cantidadVendidaAnioLibro>libroMasVendido.precio){
            libroMasVendido = libro3
        }
        if(libro4.cantidadVendidaAnioLibro>libroMasVendido.precio){
            libroMasVendido = libro4
        }
        if(libro5.cantidadVendidaAnioLibro>libroMasVendido.precio){
            libroMasVendido = libro5
        }
        return libroMasVendido
    }

    fun cuantosLibrosNoVendidos(){

    }

    fun promedioPrecioVenta(){

    }

    fun esRentable() Boolean{
        return libro1.cantidadVendidaAnioLibro>=5 && libro2.cantidadVendidaAnioLibro>=5 && libro3.cantidadVendidaAnioLibro>=5 && libro4.cantidadVendidaAnioLibro>=5 && libro5.cantidadVendidaAnioLibro>=5

    }


class Libro (var isbn: String, var titulo: String, var precio: Double, var cantidadVendidaAnioLibro: Int, var cantidadActualEjemplares: Int) {
    fun comprar(cantidad: Int, precio: Double){
        this.cantidadActualEjemplares += cantidad
        this.precio = precio
    }

    fun vender(cantidad: Int): Boolean {
        if (cantidad > this.cantidadActualEjemplares) {
            return false
        }
        else if (cantidad <= this.cantidadActualEjemplares){
            this.cantidadActualEjemplares -= cantidad
            this.cantidadVendidaAnioLibro += cantidad
            return true
        }
    }
}

 val libro1 = Libro("AAAA", "Libro 1", 15.000, 15, 30)
 val libro2 = Libro("BBBB", "Libro 2", 10.000, 0, 10)
 val libro3 = Libro("CCCC", "Libro 3", 5.000, 10, 15)
 val libro4 = Libro("DDDD", "Libro 4", 25.000, 5, 3)
 val libro5 = Libro("EEEE", "Libro 5", 25.000, 20, 5)