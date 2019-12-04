fun main() {
    (ClassLoader.getSystemResourceAsStream("input.txt") ?: throw RuntimeException("read error"))
        .bufferedReader()
        .useLines { lines ->
            lines.map { fuelrec(it.toInt()) }
                .sum()
                .let(::println)
        }
}

fun fuel(mass: Int): Int = mass / 3 - 2

tailrec fun fuelrec(fuelMass: Int, total: Int = 0): Int {
    val fuel = fuel(fuelMass)
    if (fuel <= 0) return total
    return fuelrec(fuel, total + fuel)
}