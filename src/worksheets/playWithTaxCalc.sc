
  def calculateTax(number: Int): Int = {
    number match {

      case a if a > 100000 => (a * 0.4).toInt
      case b if b > 50000 => (b * 0.2).toInt
      case c if c > 10000 => (c * 0.15).toInt
      case d if d > 0.1 => (d * 0.1).toInt
      case _ => 0

    }

  }


println(calculateTax(100000))