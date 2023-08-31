import java.io.File

fun readLocationInfo() : Map<Int, Location> {

    val locations = mutableMapOf<Int, Location>()

    File("C:\\Users\\user\\Documents\\GitHub\\KotlinTextAdventureGame\\src\\main\\resources\\locations_big.txt").reader().forEachLine {
        val tokens = it.split("`")

        val location = Location(tokens[0].toInt(), tokens[1])
        locations[location.locationId] = location
    }

    File("C:\\Users\\user\\Documents\\GitHub\\KotlinTextAdventureGame\\src\\main\\resources\\directions_big.txt").reader().forEachLine {
        val tokens = it.split(",")

        locations[tokens[0].toInt()]?.addExit(tokens[1], tokens[2].toInt())
    }

    return locations
}