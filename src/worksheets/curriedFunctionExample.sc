def addTwoNumbers(num1:Int)(num2:Int):Int = {
  num1 + num2
}

val x = addTwoNumbers(5)(_)

val y = x(16)

//note: only one implicit of a type allowed in scope at any time