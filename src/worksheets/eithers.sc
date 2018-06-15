val a, b: Either[String, Int] = {
  Right(1)
}

val c:Either[String,Int] = Left("Hi")

for {
  aa <- a.right
  bb <- c.left
}
  yield aa + bb
