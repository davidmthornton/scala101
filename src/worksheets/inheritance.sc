class Boat(val length:Int, val width:Int, val topSpeed:Int)

//SailBoats

trait Artillery{
  val numGuns:Int
  val range:Int
}

trait RenownedDesigner{
  val name:String
  val location:String
}

class SailBoat(val numSails:Int,
               val hasOars:Boolean,
               val canTack:Boolean,
               override val length:Int,
               override val width:Int,
               override val topSpeed:Int)
  extends Boat(length, width, topSpeed)

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
                     override val location:String) extends SailBoat(numSails, hasOars, canTack, length, width, topSpeed) with Artillery with RenownedDesigner

// Motorboats
class MotorBoat(val engineSize:Int, val fuelType:String, override val length:Int, override val width:Int,
                override val topSpeed:Int) extends Boat(length, width, topSpeed)

class WarShip(val country:String,
              override val engineSize:Int,
              override val fuelType:String,
              override val length:Int,
              override val width:Int,
              override val topSpeed:Int,
              override val numGuns:Int,
              override val range:Int) extends MotorBoat(engineSize, fuelType, length, width, topSpeed) with Artillery