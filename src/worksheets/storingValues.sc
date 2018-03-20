val lemon:Double = 0.30
val flour:Double = 0.90
val cider:Double = 2.50

def shopping(lemonsQty:Int, flourQty:Int, ciderQty:Int):Double = {

  val price:Double = ((lemon*lemonsQty)+(flour*flourQty)+(cider*ciderQty))
  price
}

printf("£" + shopping(5,2,6))