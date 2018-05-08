val s:Seq[String] = Seq("Dave T", "Bam", "Funkmaster", "YellowBird")

println(s.reduceLeft((x, y) => if(x < y)x else y))

println(s.reduceRight((x, y) => if(x < y)x else y))

val numbers:Seq[Int] = Seq(1,2,3,4,5)

numbers.reduceLeft(_+_)
numbers.reduceLeft(_-_)

numbers.reduceRight(_+_)
numbers.reduceRight(_-_)