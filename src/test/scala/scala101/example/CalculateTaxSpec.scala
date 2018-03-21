package scala101.example

import base.UnitSpec

class CalculateTaxSpec extends UnitSpec {
  "Calling Calculator.calculateTax()" when {

    "given the number 10000" should {
      "return 1000" in {
        val result = Calculator.calculateTax(10000)
        result shouldBe 1000
      }
      "given the number 10001" should {
        "return 1500" in {
          val result = Calculator.calculateTax(10001)
          result shouldBe 1500
        }

      }
      "given the number 75000" should {
        "return 15000" in {
          val result = Calculator.calculateTax(75000)
          result shouldBe 15000
        }

      }
      "given the number 105000" should {
        "return " in {
          val result = Calculator.calculateTax(105000)
          result shouldBe 42000
        }

      }
    }
  }
}