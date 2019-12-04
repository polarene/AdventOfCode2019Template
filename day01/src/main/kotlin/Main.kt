import java.lang.RuntimeException

fun main() {
    (ClassLoader.getSystemResourceAsStream("input.txt") ?: throw RuntimeException("read error"))
        .bufferedReader()
        .useLines { lines ->
            lines.map { fuel(it.toInt()) }
                .sum()
                .let(::println)
        }
}

fun fuel(mass: Int): Int = mass / 3 - 2