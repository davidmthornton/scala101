var switchOn = false

lazy val switchState = {
  if (switchOn){
    "Switch is on"
  }else{
    "Switch is off"
  }
}

println(switchState)

switchOn = true

println(switchState)