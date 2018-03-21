val s:Seq[String] = Seq("Dave T", "Funkmaster")

s.foreach(println)

val m:Map[Int,String] = Map(1->"red", 2->"yellow", 3->"blue", 4->"refrigerator")
println(m(1))

val numbers:Seq[Int] = Seq(1,2,3,4,5,6,7,8)

numbers.map{
  _ + 1
}


numbers.filter{
  _ % 2 != 0
}

s.exists{
  _.contains("t")
}