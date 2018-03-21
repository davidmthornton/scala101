package scala101.example

import base.UnitSpec

class CalculateTaxSpec extends UnitSpec {
  "Calling Calculator.calculateTax()" when {

    "given a number which is less than or equal to 10000" should {
      "10% of the given value (1000)" in {
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
      "given the number -5000" should {
        "return " in {
          val result = Calculator.calculateTax(-5000)
          result shouldBe -500
        }

      }

    }
  }
}