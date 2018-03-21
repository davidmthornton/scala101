val oneToEleven:Seq[Int] = Seq(1,2,3,4,5,6,7,8,9,10,11)

val s:Seq[String] = Seq("Dave T", "Funkmaster", "YellowBird")

val flowersAndColours:Map[String, String] = Map("rose"->"red", "sunflower"->"yellow", "violet"->"blue")

val colourOfRose = flowersAndColours.get("rose")

val doubledVals = oneToEleven.map{
  _ *  2
}

val containsLowerCaselY = s.filter{
  !_.contains("y")
}

val hasGreaterThan5 = oneToEleven.exists{
  _ > 5
}