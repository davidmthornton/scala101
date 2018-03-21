implicit  val batman = "sdafsd"

def printNumberAndString(num:Int)(implicit str:String): Unit ={
  println(str + num)
}

printNumberAndString(22)