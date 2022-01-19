//Patrick Brown
//1/12/21
//Scala_Fundamentals homework

package revature

import scala.io.StdIn.{readInt, readLine}

object Scala_Fundamentals {
  def sum(a:Int, b:Int): Unit = {
    if (a == b)
      println("Because the integers are the same, the sum multiplied by 3 is " + (a+b)*3)
    else
      println(s"The sum of $a and $b is " + (a+b))
  }

  def newString(s:String): String = {
    s.takeRight(1) + s + s.takeRight(1)
  }

  def abs(n:Int): Int = {
    if (n>51)
      return 3*((n-51).abs)
    else
      return ((n-51).abs)
  }

  def intCheck(a: Int, b: Int): Unit = {
    if (a == 30 || b == 30 || (a+b)==30)
      println("true")
    else
      println("false")
  }

  def bigRange(i:Int): Unit = {
    if ((100-i).abs == 20 || (300-i).abs == 20)
      println("true")
    else
      println("false")
  }

  def addIf(s: String): String = {
    if (s.startsWith("if "))
      s
    else
      "if " + s
  }

  def letterRemover(s: String, n: Int): String = {
    s.take(n) + s.drop(n+1)
  }

  def swapLetters(s: String): String = {
    s.charAt(s.length-1) + s.substring(1, s.length-1) + s.charAt(0)
  }

  def printSolution(): Unit = {
    print("Which question do you want to see the solution for (there are 8 questions)? ")
    val solution = readInt()
    if (solution == 1) {
      println(
        """
          |Write a Scala program to compute the sum of the two given integer values. If the two values are the same, then return triples their sum.
          |""".stripMargin)
      println("MY SOLUTION: ")
      println("Enter a number for the first value: ")
      val num1 = readInt()
      println("Enter a number for the second value: ")
      val num2 = readInt()
      sum(num1, num2)
    }
    else if (solution == 2) {
      println(
        """
          |Write a Scala program to create a new string with the last char added at the front
          |and back of a given string of length 1 or more
          |""".stripMargin)
      println("MY SOLUTION: ")
      val string = readLine("Enter a string: ")
      println("The new string is " + newString(string))

    }
    else if (solution == 3) {
      println(
        """
          |Write a Scala program to get the absolute difference between n and 51.
          |If n is greater than 51 return triple the absolute difference.
          |""".stripMargin)
      println("MY SOLUTION: ")
      println("Enter a number: ")
      val num = readInt()
      println(s"The absolute difference between $num and 51 is " + abs(num))
    }
    else if (solution == 4) {
      println(
        """
          |Write a Scala program to check two given integers, and return true if one of them is 30 or if their sum is 30.
          |""".stripMargin)
      println("MY SOLUTION: ")
      println("Enter the first integer: ")
      val int1 = readInt()
      println("Enter the second integer: ")
      val int2 = readInt()
      intCheck(int1, int2)
    }
    else if (solution == 5) {
      println(
        """
          |Write a Scala program to check a given integer and return true if it is within 20 of 100 or 300.
          |""".stripMargin)
      println("MY SOLUTION: ")
      println("Enter an integer: ")
      val int = readInt()
      bigRange(int)
    }
    else if (solution == 6){
      println(
        """
          |Write a Scala program to create a new string where 'if' is added to the front of a given string.
          |If the string already begins with 'if', return the string unchanged
          |""".stripMargin)
      println("MY SOLUTION: ")
      val string = readLine("Enter a string: ")
      println("The new string is: " + addIf(string))
    }
    else if (solution == 7) {
      println(
        """
          |Write a Scala program to remove the character in a given position of a given string.
          |The given position will be in the range 0...string length -1 inclusive.
          |""".stripMargin)
      println("MY SOLUTION: ")
      val string = readLine("Enter a string: ")
      println("Enter the number for the position of the letter you want to remove: ")
      val removeChar = readInt()
      println("The new string is:  " + letterRemover(string, removeChar))
    }
    else if (solution == 8) {
      println(
        """
          |Write a Scala program to exchange the first and last characters in a given string and return the new string.
          |""".stripMargin)
      println("MY SOLUTION: ")
      val string = readLine("Enter a string: ")
      println("The new string is: " + swapLetters(string))
    }
    else {
      println("Enter a valid solution number.")
      printSolution()
    }
  }

  def main(args: Array[String]): Unit = {
    printSolution()
  }

}
