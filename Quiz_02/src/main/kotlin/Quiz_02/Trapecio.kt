package Quiz_02

class Trapecio(val B:Double, val b_:Double, val h:Double) {
    fun area_00(): Double{
        var area = ((B + b_) / 2) * h
        return area
    }
}