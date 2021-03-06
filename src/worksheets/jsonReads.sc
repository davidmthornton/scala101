import play.api.libs.json._
import play.api.libs.json.Reads._
import play.api.libs.functional.syntax._

val json: JsValue = Json.parse("""
  {
    "name" : "Watership Down",
    "location" : {
      "lat" : 51.235685,
      "long" : -1.309197
    },
    "residents" : [ {
      "name" : "Fiver",
      "age" : 4,
      "role" : null
    }, {
      "name" : "Bigwig",
      "age" : 6,
      "role" : "Owsla"
    } ]
  }
  """)

case class Location(lat: Double, long: Double)
case class Resident(name: String, age: Int, role: Option[String])
case class Place(name: String, location: Location, residents: Seq[Resident])

implicit val locationReads: Reads[Location] = (
  (JsPath \ "lat").read[Double](min(-90.0) keepAnd max(90.0)) and
    (JsPath \ "long").read[Double](min(-180.0) keepAnd max(180.0))
  )(Location.apply _)

implicit val residentReads: Reads[Resident] = (
  (JsPath \ "name").read[String](minLength[String](2)) and
    (JsPath \ "age").read[Int](min(0) keepAnd max(150)) and
    (JsPath \ "role").readNullable[String]
  )(Resident.apply _)

implicit val placeReads: Reads[Place] = (
  (JsPath \ "name").read[String](minLength[String](2)) and
    (JsPath \ "location").read[Location] and
    (JsPath \ "residents").read[Seq[Resident]]
  )(Place.apply _)


json.validate[Place] match {
  case s: JsSuccess[Place] => {
    val place: Place = s.get
    println(place)
    // do something with place
  }
  case e: JsError => {
    // error handling flow
  }
}

//Writes

implicit val locationWrites: Writes[Location] = (
  (JsPath \ "lat").write[Double] and
    (JsPath \ "long").write[Double]
  )(unlift(Location.unapply))

implicit val residentWrites: Writes[Resident] = (
  (JsPath \ "name").write[String] and
    (JsPath \ "age").write[Int] and
    (JsPath \ "role").writeNullable[String]
  )(unlift(Resident.unapply))

implicit val placeWrites: Writes[Place] = (
  (JsPath \ "name").write[String] and
    (JsPath \ "location").write[Location] and
    (JsPath \ "residents").write[Seq[Resident]]
  )(unlift(Place.unapply))

val place = Place(
  "Watership Down",
  Location(51.235685, -1.309197),
  Seq(
    Resident("Fiver", 4, None),
    Resident("Bigwig", 6, Some("Owsla"))
  )
)

val json2 = Json.toJson(place)
println(json2)

//Creating a format (combination of reads and writes)

//implicit val locationFormat: Format[Location] =
//  Format(locationReads, locationWrites)

//If the reads and writes are symmetrical you can pass them in directly

implicit val locationFormat: Format[Location] = (
  (JsPath \ "lat").format[Double](min(-90.0) keepAnd max(90.0)) and
    (JsPath \ "long").format[Double](min(-180.0) keepAnd max(180.0))
  )(Location.apply, unlift(Location.unapply))

