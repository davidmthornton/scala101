package scala101.example

object Calculator {
  def add(number1: Int = 0, number2: Int = 0): BigInt = number1 + number2

  //  def calculateTax(number: Int): Int = {
  //    if (number > 100000) (number * 0.4).toInt
  //    else if (number > 50000) (number * 0.2).toInt
  //    else if (number > 10000) (number * 0.15).toInt
  //    else (number * 0.1).toInt
  //  }

  def calculateTax(number: Int): Int = {
    number match {

      case a if a > 100000 => (a * 0.4).toInt
      case b if b > 50000 => (b * 0.2).toInt
      case c if c > 10000 => (c * 0.15).toInt
      case d if d > 0.1 => (d * 0.1).toInt
      case _ => 0

    }

  }
}