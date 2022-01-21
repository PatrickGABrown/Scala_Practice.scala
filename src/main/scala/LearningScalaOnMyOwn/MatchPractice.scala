package LearningScalaOnMyOwn

import scala.io.StdIn.readInt

object MatchPractice {
  //Match Expression Practice
  def main(args: Array[String]): Unit = {
    println("Enter a number to make a choice: ")
    //The user enters a number
    val i = readInt()
    //We are seeing if any of the options "match" with the value of i
    i match {
      //If the user types the number 1, we print January
      case 1 => println("January")
      //If the user types the number 2, we print February
      case 2 => println("February")
      //If the user types the number 3, we print March
      case 3 => println("March")
      //If the user types the number 4, we print April
      case 4 => println("April")
      //If the user types the number 5, we print May
      case 5 => println("May")
      //If the user types the number 6, we print June
      case 6 => println("June")
      //If the user types the number 7, we print July
      case 7 => println("July")
      //If the user types the number 8, we print August
      case 8 => println("August")
      //If the user types the number 9, we print September
      case 9 => println("September")
      //If the user types the number 10, we print October
      case 10 => println("October")
      //If the user types the number 11, we print November
      case 11 => println("November")
      //If the user types the number 12, we print December
      case 12 => println("December")
      // catch the default with a variable so you can print it
      case whoa => println("Unexpected case: " + whoa.toString)
    }
  }
}
