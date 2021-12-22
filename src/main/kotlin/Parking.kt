data class Parking(val vehicles : MutableSet<Vehicle>, val maxAmount: Int, var checkoutsAndEarnings: Pair<Int,Int> ){

    //Exercise 5
    fun addVehicle(vehicle: Vehicle): Boolean {
        if(vehicles.size == maxAmount) return false
        return vehicles.add(vehicle)
    }

    //Exercise 11
    fun showResults(){
        println("${checkoutsAndEarnings.first} vehicles have checked out and have earnings of $${checkoutsAndEarnings.second}")
    }
    //Exercise 12
    fun listVehicles() {
        vehicles.toList().forEach {
            println(it.plate)
        }
    }
}
