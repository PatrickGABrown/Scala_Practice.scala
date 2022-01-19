package revature

import scala.io.StdIn.{readLine, readInt}

object Practice_Code {

  def largerNum(i: Int, i1: Int): Int = {
    if (i > i1)
      i
    else
      i1
  }

  def main(args: Array[String]): Unit = {
    /*
    //#1)
    val name = readLine("What is your name? ")
    println(s"My name is $name!")

     */

    /*
    //#2
    println("This program finds the largest number between two numbers you enter.")
    println("Enter the first number: ")
    val num1 = readInt()
    println("Enter the second number: ")
    val num2 = readInt()
    if (num1 > num2)
      println(s"The largest number between the two numbers is $num1")
    else
      println(s"The largest number between the two numbers is $num2")

     */

    /*
    //#3
    println("This program tells you if a number you enter is positive or negative")
    println("Enter a number")
    val int = readInt()
    if (int < 0)
      println("The number is negative")
    else if (int > 0)
      println("The number is positive")
    else
      println("The number is 0")
     */

    /*
    //#4
    val string = "You are reading SCALA programming language."
    println("Value of text is: " + string)
     */

    /*
    //#5
    var (name: String, age: Int) = ("Patrick", 22)
    println("Name: " + name)
    println("Age: " + age)

    //declaration without specifying data type
    var (address,mobile)=("New Delhi, India",1234567890);
    //print values
    println("Address:   "+address);
    println("Mobile:    "+mobile);
     */

    /*
    //#6
    //basic for loop
    for(i<- 1 to 5)
      println(i)

    //big for loop
    for(i <- 1 to 100)
      print(i + " ");
    // to print new line
    println();
     */

    /*
    //#7
    for(i <- 1 until 101)
      print(i + " ");
    // to print new line
    println();
     */

    /*
    //#8
    //declare integer list
    val numbers = List(100,200,300,400);
    //to print all numbers using for loop
    for(i <- numbers)
      println(i)

    val list = List("Tom", "Dick", "Harry")
    for (i <- list)
      println(i)
     */

    /*
    //#9
    println("Enter the first number: ")
    val val1 = readInt()
    println("Enter the second number: ")
    val val2 = readInt()
    println(s"The larger number from $val1 and $val2 is " + largerNum(val1, val2))
     */

    //#10
    val array = Array(1, 2, 3, 4, 5)
    var sum = 0
    for (i <- array) {
      println(i)
      sum += i
    }
    println("The sum of the values in the array is " + sum)


  }


}
