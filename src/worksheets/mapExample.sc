def addDave(input1:List[String]) : List[String]={
  input1.map(x => x + " Dave?")
}


val questions = List("How are you", "How's it going", "What time is it")
val properQuestions = addDave(questions)

properQuestions.foreach(println)