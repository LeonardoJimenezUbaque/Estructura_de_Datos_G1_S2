package Quiz_03

class Veterinaria(
    // Atributos
    var nombre: String
    var direccion: String
    ){
    // Atributos
    // Animal 1
    val animal1 = Animal("Pedro", 2010, 3, "perro")

    // Animal 2
    val animal2 = Animal("Julian", 2008, 3, "gato")

    // Animal 3
    val animal3 = Animal("Andres", 2012, 3, "perro")

    // Animal 4
    val animal4 = Animal("Toby", 2017, 3, "gato")

    fun esPerro(nombreAnimal: Animal): Boolean{
        if (Animal.tipo == "perro") {
            return true
        }
        else {
            return false
        }
    }

    fun totalPagar(nombreAnimal: Animal): Int {
        var cantidadPagar = 0.0
        if (animal1.tipo == "perro"){
            cantidadPagar = animal1.diasHospitalizado * 1000 + (10000 * animal1.edad)
        }
        if (animal1.tipo == "gato"){
            cantidadPagar = animal1.diasHospitalizado * 3000 + (5000 * animal1.edad)
        }
        else{
            cantidadPagar = 300 * ani
        }

    }
}