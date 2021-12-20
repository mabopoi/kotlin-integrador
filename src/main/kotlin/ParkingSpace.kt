import java.util.*

data class ParkingSpace(var vehicle : Vehicle){

    val MINUTE_INT_MILISECONDS = 60000

    val parkedTime: Long
        get() = (Calendar.getInstance().timeInMillis - vehicle.checkInTime.timeInMillis) / MINUTE_INT_MILISECONDS

}
