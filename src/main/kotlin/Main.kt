import java.util.*

fun main(args: Array<String>) {
    println("Integrador Kotlin")

    //Exercise 1
    //Se define Vehicles como un set porque esta estructura no permite repetir dentro de su collecion

    val car = Vehicle("AA111AA",VehicleType.CAR, Calendar.getInstance())
    val car2 = Vehicle("AA111AA1",VehicleType.CAR, Calendar.getInstance(),"DISCOUNT_CARD_001")
    val moto = Vehicle("AA222AA",VehicleType.MOTORCYCLE, Calendar.getInstance())
    val minibus  = Vehicle("AA333AA",VehicleType.MINIBUS, Calendar.getInstance())
    val bus = Vehicle("AA444AAA",VehicleType.BUS, Calendar.getInstance(),"DISCOUNT_CARD_002")
    val bus2 = Vehicle("AA444AAB",VehicleType.BUS, Calendar.getInstance(),"DISCOUNT_CARD_002")
    val bus3 = Vehicle("AA444AAC",VehicleType.BUS, Calendar.getInstance(),"DISCOUNT_CARD_002")
    val bus4 = Vehicle("AA444AAD",VehicleType.BUS, Calendar.getInstance(),"DISCOUNT_CARD_002")
    val bus5 = Vehicle("AA444AAE",VehicleType.BUS, Calendar.getInstance(),"DISCOUNT_CARD_002")
    val bus6 = Vehicle("AA444AAF",VehicleType.BUS, Calendar.getInstance(),"DISCOUNT_CARD_002")
    val bus7 = Vehicle("AA444AAG",VehicleType.BUS, Calendar.getInstance(),"DISCOUNT_CARD_002")
    val bus8 = Vehicle("AA444AAH",VehicleType.BUS, Calendar.getInstance(),"DISCOUNT_CARD_002")
    val bus9 = Vehicle("AA444AAI",VehicleType.BUS, Calendar.getInstance(),"DISCOUNT_CARD_002")
    val bus10 = Vehicle("AA444AA0",VehicleType.BUS, Calendar.getInstance(),"DISCOUNT_CARD_002")
    val bus11 = Vehicle("AA444AAJ",VehicleType.BUS, Calendar.getInstance(),"DISCOUNT_CARD_002")
    val bus12 = Vehicle("AA444AAK",VehicleType.BUS, Calendar.getInstance(),"DISCOUNT_CARD_002")
    val bus13 = Vehicle("AA444AAL",VehicleType.BUS, Calendar.getInstance(),"DISCOUNT_CARD_002")
    val bus14 = Vehicle("AA444AAM",VehicleType.BUS, Calendar.getInstance(),"DISCOUNT_CARD_002")
    val bus15 = Vehicle("AA444AAN",VehicleType.BUS, Calendar.getInstance(),"DISCOUNT_CARD_002")
    val bus16 = Vehicle("AA444AAO",VehicleType.BUS, Calendar.getInstance(),"DISCOUNT_CARD_002")
    val bus17 = Vehicle("AA444AAP",VehicleType.BUS, Calendar.getInstance(),"DISCOUNT_CARD_002")

    val parking = Parking(mutableSetOf(), 20, Pair(0,0))

    //Exercise 6
    val vehiclesList = listOf(car,car2,moto, minibus, bus, bus2, bus3, bus4, bus5, bus6,bus7,bus8, bus9,
        bus10, bus11, bus12, bus13, bus14, bus15, bus16, bus17)

    vehiclesList.forEach {
        val result = parking.addVehicle(it)
        if(result) println("Welcome to AlkeParking!")
        else println("Sorry, the check-in failed")
    }

    val parkingSpace = ParkingSpace(car, parking)
    parkingSpace.checkOutVehicle("AA111AA")

    parking.showResults()
    parking.listVehicles()
}