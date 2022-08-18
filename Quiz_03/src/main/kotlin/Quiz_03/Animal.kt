package Quiz_03;

class Animal(
    var nombreAnimal: String,
    var anioNacimiento: Int,
    var diasHospitalizado: Int,
    var tipo: String
    ){

    fun edad(): Int{
        var anioActual = 2022
        var edadAnimal = 0
        if (tipo == gato){
            edadAnimal = (anioActual - anioNacimiento) * 4
        }
        else if (Animal.tipo == perro){
            edadAnimal = (anioActual - anioNacimiento) * 7
        }
        else {
            edadAnimal = (anioActual - anioNacimiento) * 10
        }
    return edadAnimal
    }
}