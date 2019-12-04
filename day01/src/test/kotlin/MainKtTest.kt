import io.kotlintest.data.forall
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec
import io.kotlintest.tables.row

class MainKtTest : StringSpec({
    "fuel" {
        forall(
            row(12, 2),
            row(14, 2),
            row(1969, 654),
            row(100756, 33583)
        ) { actual, expected ->
            fuel(actual) shouldBe expected
        }
    }

    "fuel 2" {
        forall(
            row(14, 2),
            row(1969, 966),
            row(100756, 50346)
        ) { actual, expected ->
            fuelrec(actual) shouldBe expected
        }
    }
})