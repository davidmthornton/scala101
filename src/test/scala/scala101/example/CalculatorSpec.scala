package scala101.example

import base.UnitSpec

class CalculatorSpec extends UnitSpec {
  "Calling Calculator.add()" when {

    "no parameters are specified" should {
      "return 0" in {
        val result = Calculator.add()
        result shouldBe 0
      }
    }

    "two positive values are passed in" should {
      "return the sum of the two parameters" in {
        val result = Calculator.add(0, 0)
        result shouldBe 0
      }
    }

    "a positive and a negative parameter are passed in" should {
      "subtract the negative value from the positive" in {
        val result = Calculator.add(100, -1)
        result shouldBe 99
      }
    }

    "passing in parameters in any order" should {
      "return the same result" in {
        val ab = Calculator.add(1, -1)
        val ba = Calculator.add(-1, 1)
        ab shouldBe ba
      }
    }

  }
}
