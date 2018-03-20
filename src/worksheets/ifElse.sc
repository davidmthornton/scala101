def checkAllowableFilms(age:Int): Unit ={

  val films = List[String]("U","PG","12A","15","18")

  if(age >=4){
    print("You can watch " + films(0))
    if(age >=12){
      print(" and " + films(1))
      if(age >=15)
        print(" and " + films(2))
        if(age>=18)
          print(" and " + films(3))
    }

    print(" rated films")

  }else{
    println("You can't watch any films!")
  }


}

checkAllowableFilms(2)



