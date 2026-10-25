package pre_basic

class Car(val medel:Strping, val kpl: Double) {

    init {
        require(kpl > 0) {"Efficiency must be positive"}
    }

    fun fuelNeeded(distanceKm: Double): Double {
        return distanceKm / kpl
    }

    fun compareByEfficiency(other: Car): Int {
        return kpl.compareTo(other.kpl)
    }
}