def getBigVal(input1:Int, input2:Int):String = {
  if(input1 > input2) "first"
  else if (input2 > input1) "second"
  else if (input1 == input2) "same"
  else ""
}

getBigVal(1,3)