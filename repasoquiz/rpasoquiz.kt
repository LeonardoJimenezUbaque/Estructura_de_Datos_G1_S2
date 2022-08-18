import java.util.Date

class Silla(val categoria:String,
            val nSilla:Int,
            val ubicacion:String,
            val ocupada:Boolean,
            val persona:triple<Int,String,java.util.Date>
            //val cedula:Int,
            //val nombre:String,
            //val anionacimiento:Date){
    fun darPasajero(){
        var solucion:""
        if (this.ocupada==true)
            solucion=this.persona
        return solucion
    }
}