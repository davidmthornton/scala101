def nameLength(firstName: String, surname: String): Int ={
  if(firstName.length > surname.length) firstName.length
  else if(surname.length > firstName.length) surname.length
  else 0
}

nameLength("Arnold", "Schwarzenegger")
nameLength("Bruce", "Lee")
nameLength("Ethan", "Hawke")


