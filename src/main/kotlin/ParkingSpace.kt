import java.util.*
import kotlin.math.ceil

data class ParkingSpace(var vehicle : Vehicle, val parking: Parking){

    val MINUTES_IN_MILISECONDS = 60000

    //Exercise 4
    val parkedTime: Long
        get() = (Calendar.getInstance().timeInMillis - vehicle.checkInTime.timeInMillis) / MINUTES_IN_MILISECONDS
    //Exercise 7
    fun checkOutVehicle(plate: String){

        if(vehicle.plate == plate){

            val foundVehicle = parking.vehicles.firstOrNull { it.plate == plate }
            foundVehicle?.let {
                val hasDiscountCard = it.discountCard?.let { true } ?: false
                val amount = calculateFee(it.type, parkedTime.toInt(), hasDiscountCard)
                onSuccess(amount)
                parking.vehicles.remove(it)
                val checkoutVehicles = parking.checkoutsAndEarnings.first + 1
                val earnings = parking.checkoutsAndEarnings.second + amount
                parking.checkoutsAndEarnings = Pair(checkoutVehicles, earnings)
            } ?: run { onError() }

        } else { onError()}

    }

    fun onSuccess(amountToPay: Int){
        println("Your fee is $amountToPay. Come back soon")
    }
    fun onError(){
        println("Sorry, the check-out failed")
    }

    //Exercise 8
    fun calculateFee(type: VehicleType, parkedTime: Int, hasDiscountCard: Boolean): Int{
        var fee = type.cost
        if (parkedTime > 120){
            val minutesLeft = parkedTime - 120
            val amountToCharge = ceil((minutesLeft.toFloat() / 15f)).toInt()
            fee += 5 * amountToCharge
        }

        //Exercise 9
        if(hasDiscountCard) fee -= fee * 15 / 100
        return fee
    }
}
