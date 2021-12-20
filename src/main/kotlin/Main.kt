import java.util.*

fun main(args: Array<String>) {
    println("Integrador Kotlin")


    val car = Vehicle("AA111AA",VehicleType.CAR, Calendar.getInstance(),"DISCOUNT_CARD_001")
    val moto = Vehicle("AA222AA",VehicleType.MOTORCYCLE, Calendar.getInstance())
    val minibus  = Vehicle("AA333AA",VehicleType.MINIBUS, Calendar.getInstance())
    val bus = Vehicle("AA444AA",VehicleType.BUS, Calendar.getInstance(),"DISCOUNT_CARD_002")

    val parking = Parking(mutableSetOf(car,moto,minibus,bus))

    println(parking.vehicle.contains(car))
    println(parking.vehicle.contains(moto))
    println(parking.vehicle.contains(minibus))
    println(parking.vehicle.contains(bus))


    val car2 = Vehicle("AA111AA",VehicleType.CAR, Calendar.getInstance(),"DISCOUNT_CARD_001")

    val isCard2Inserted = parking.vehicle.add(car2)
    println(isCard2Inserted)



    //Consigna 1
    //Se define Vehicles como un set porque esta estructura no permite repetir dentro de su collecion
}