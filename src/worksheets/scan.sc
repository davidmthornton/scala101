val product = (x: Int, y: Int) => {
  val result = x * y
  println(s"multiplied $x by $y to yield $result")
  result
}

val a = Array(1, 2, 3)

a.scanLeft(10)(product)