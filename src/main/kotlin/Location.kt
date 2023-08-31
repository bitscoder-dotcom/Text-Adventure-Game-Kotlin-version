

data class Location(val locationId: Int, val description: String) {

    val exits = mutableMapOf<String, Int>()

    init {
        exits["Q"] = 0
    }

    fun addExit (direction: String, destinationID: Int) {
        exits[direction] = destinationID
    }
}