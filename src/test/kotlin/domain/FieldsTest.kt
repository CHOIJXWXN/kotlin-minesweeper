package domain

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

internal class FieldsTest : BehaviorSpec({
    Given("주어진 Fields에 ") {
        val coordinate = Coordinate(0, 0)
        val fields = Fields(mapOf(coordinate to Land()))

        When("좌표에 해당하는 Field가 있다면 ") {
            val field = fields.getField(coordinate)

            Then("반환한다.") {
                field::class shouldBe Land::class
            }
        }

        When("좌표에 해당하는 Field가 없다면 ") {
            Then("예외를 던진다.") {
                shouldThrow<IllegalArgumentException> {
                    fields.getField(Coordinate(0, 1))
                }
            }
        }
    }
})
