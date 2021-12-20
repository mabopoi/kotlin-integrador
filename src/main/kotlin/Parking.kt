data class Parking(val vehicles : MutableSet<Vehicle>, val maxAmount: Int, var checkoutsAndEarnings: Pair<Int,Int> ){

    fun addVehicle(vehicle: Vehicle): Boolean {
        if(vehicles.size == maxAmount) return false
        return vehicles.add(vehicle)
    }

    fun showResults(){
        println("${checkoutsAndEarnings.first} vehicles have checked out and have earnings of $${checkoutsAndEarnings.second}")
    }

    fun listVehicles() {
        vehicles.toList().forEach {
            println(it.plate)
        }
    }
}
