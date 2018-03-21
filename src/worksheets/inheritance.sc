class Boat(val length:Int, val width:Int, val topSpeed:Int, override val floatiness:String) extends Floatiness {
  def isFasterThan(boat:Boat): Boolean ={
    if(topSpeed > boat.topSpeed){
      true
    }else{
      false
    }
  }
}

//SailBoats

trait Artillery{
  val numGuns:Int
  val range:Int
}

trait RenownedDesigner{
  val name:String
  val location:String
}

trait Floatiness{
  val floatiness:String
}

class SailBoat(val numSails:Int,
               val hasOars:Boolean,
               val canTack:Boolean,
               override val length:Int,
               override val width:Int,
               override val topSpeed:Int,
               override val floatiness:String)
  extends Boat(length, width, topSpeed, floatiness)

class LuxurySailBoat(val hasJacuzzi:Boolean,
                     val hasBooze:Boolean,
                     override val numSails:Int,
                     override val hasOars:Boolean,
                     override val canTack:Boolean,
                     override val length:Int,
                     override val width:Int,
                     override val topSpeed:Int,
                     override val numGuns:Int,
                     override val range:Int,
                     override val name:String,
                     override val location:String,
                     override val floatiness:String) extends SailBoat(numSails, hasOars, canTack, length, width, topSpeed, floatiness) with Artillery with RenownedDesigner

// Motorboats
class MotorBoat(val engineSize:Int, val fuelType:String, override val length:Int, override val width:Int,
                override val topSpeed:Int, override val floatiness:String) extends Boat(length, width, topSpeed, floatiness)

class WarShip(val country:String,
              override val engineSize:Int,
              override val fuelType:String,
              override val length:Int,
              override val width:Int,
              override val topSpeed:Int,
              override val numGuns:Int,
              override val range:Int,
              override val floatiness:String) extends MotorBoat(engineSize, fuelType, length, width, topSpeed, floatiness) with Artillery{
  def canOutGun(ws:WarShip): Boolean ={
    numGuns > ws.numGuns

  }
}

val annhihilator: WarShip = new WarShip("United Kingdom", 2000, "Diesel", 1000, 400, 100, 20, 1000, "Floaty")
val mermaid: LuxurySailBoat = new LuxurySailBoat(true, true, 5, true, true, 1000, 400, 150, 20, 1000, "Mermaid", "United Kingdom", "Extremely floaty")

val faster = annhihilator.isFasterThan(mermaid)

val monsterWarShip:WarShip = new WarShip("United Kingdom", 2000, "Diesel", 40000, 30000, 20000, 88, 2000, "Floats like butterfly")
val babyWarShip:WarShip = new WarShip("United Kingdom", 2000, "Diesel", 40000, 30000, 20000, 2, 2000, "Floats like a stone")

monsterWarShip.canOutGun(babyWarShip)

mermaid.floatiness
annhihilator.floatiness
babyWarShip.floatiness
monsterWarShip.floatiness
