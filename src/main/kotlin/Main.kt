
fun main() {

    val locations = readLocationInfo()
    var loc = 64

    while (true) {
        val location  = locations[loc]?: Location(0, "Sorry, " +
                "something went wrong, and the game will terminate")

        println(location.description)

        if (location.locationId == 0)
            break

        print("Available exits are: ")
        location.exits.keys.forEach {
            print("$it, ")
        }

        val direction = readLine()?.uppercase() ?: "z"
        if (location.exits.containsKey(direction)) {
            loc = location.exits[direction]!!
        } else {
            println("You can't go in that direction")
        }
    }
}