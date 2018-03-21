/*def getBigVal(input1:Int, input2:Int):String = {
  if(input1 > input2) "first"
  else if (input2 > input1) "second"
  else if (input1 == input2) "same"
  else ""
}*/

def getBigVal(input1:Int, input2:Int):String = {

  input1 match {
    case a if (input1 > input2) => "first"
    case b if (input2 > input1) => "second"
    case c if (input1 == input2) => "same"
    case _ => ""

  }
}



getBigVal(1,1)