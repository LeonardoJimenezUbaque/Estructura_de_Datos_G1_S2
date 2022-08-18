package Quiz_03

class Animal(val nombre:String, val añoNacimiento:Int, val diasHospitalizado:Int, val tipo:String){
    fun edad():Int{
        if (tipo=="perro"){
            return (2022-añoNacimiento)*7
        }
        if (tipo=="gato"){
            return (2022-añoNacimiento)*4
        }
        else{
            return (2022-añoNacimiento)*10
        }
    }
}
class Veterinaria(val nombre:String, val direccion:String, val animal1:Animal,val animal2:Animal,val animal3:Animal,val animal4:Animal){
    fun esPerro(nombreAnimal:String):Boolean{
        var x=false
        if(animal1.nombre==nombreAnimal && animal1.tipo=="perro"){
            x=true
            return x
        }
        if(animal2.nombre==nombreAnimal && animal2.tipo=="perro"){
            x=true
            return x
        }
        if(animal3.nombre==nombreAnimal && animal3.tipo=="perro"){
            x=true
            return x
        }
        if(animal4.nombre==nombreAnimal && animal4.tipo=="perro"){
            x=true
            return x
        }
        return x
    }
    fun totalPagar(nombreAnimal: String):Int{
        var totalpagar=0
        if(esPerro(nombreAnimal)==true){
            if (nombreAnimal==animal1.nombre){
                totalpagar=(animal1.diasHospitalizado*1000)+(animal1.edad()*10000)
            }
            if (nombreAnimal==animal2.nombre){
                totalpagar=(animal2.diasHospitalizado*1000)+(animal2.edad()*10000)
            }
            if (nombreAnimal==animal3.nombre){
                totalpagar=(animal3.diasHospitalizado*1000)+(animal3.edad()*10000)
            }
            if (nombreAnimal==animal4.nombre){
                totalpagar=(animal4.diasHospitalizado*1000)+(animal4.edad()*10000)
            }
        }
        if(animal1.tipo=="gato"){
            totalpagar=(animal1.diasHospitalizado*3000)+(animal1.edad()*5000)
        }
        if(animal2.tipo=="gato"){
            totalpagar=(animal2.diasHospitalizado*3000)+(animal2.edad()*5000)
        }
        if(animal3.tipo=="gato"){
            totalpagar=(animal3.diasHospitalizado*3000)+(animal3.edad()*5000)
        }
        if(animal4.tipo=="gato"){
            totalpagar=(animal1.diasHospitalizado*3000)+(animal1.edad()*5000)
        }
        if(animal1.tipo!="gato" && animal1.tipo!="perro"){
            totalpagar=(animal1.diasHospitalizado*300)
        }
        if(animal2.tipo!="gato" && animal1.tipo!="perro"){
            totalpagar=(animal2.diasHospitalizado*300)
        }
        if(animal3.tipo!="gato" && animal1.tipo!="perro"){
            totalpagar=(animal3.diasHospitalizado*300)
        }
        if(animal4.tipo!="gato" && animal1.tipo!="perro"){
            totalpagar=(animal1.diasHospitalizado*300)
        }
        return totalpagar
    }
}