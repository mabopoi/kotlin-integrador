import java.util.*

//Exercise 3 (ckeckInTime,discountCard)
data class Vehicle(val plate: String, val type : VehicleType, val checkInTime : Calendar, var discountCard : String? = null){


    override fun equals(other: Any?): Boolean {

        if(other is Vehicle){
            return this.plate == other.plate
        }
        return super.equals(other)
    }


    override fun hashCode() : Int = this.plate.hashCode()

}
