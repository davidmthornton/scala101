def checkAllowableFilms(age:Int): Unit ={

  age match {
    case a if 4 until 7 contains a => println("You can watch U rated films")
    case b if 8 until 11 contains b => println("You can watch U rated and PG rated films")
    case c if 12 until 14 contains c => println("You can watch U rated, PG and 12A rated films")
    case d if 15 until 17 contains d => println("You can watch U rated, PG, 12A and 15 rated films")
    case e if e >= 18 => println("You can watch U, PG, 12A, 15 and 18 rated films")
    case _ => println("You can't watch any films yet...")
  }


}

checkAllowableFilms(18)



