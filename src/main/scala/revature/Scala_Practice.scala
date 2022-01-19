//Patrick Brown
//1/12/21
//Scala_Practice homework

package revature
import scala.io.StdIn.{readInt, readLine}
import scala.collection.mutable.Map
import scala.collection.immutable.ListMap

object Scala_Practice {
  def question1(): Unit ={
    val donutType = "Vanilla Donut"
    val quantityPurchased: String = "10"
    val price = 2
    println(
      s""" "donut_name": $donutType
         | "quantity_purchased": $quantityPurchased
         | "price": $price
         |""".stripMargin)
  }

  def question2(): Unit ={
    val name = readLine("What's your name? ")
    println("What is your age?")
    val age = readInt()
    println(Console.BOLD + "Name: " + Console.UNDERLINED + name + Console.RESET)
    println(Console.BOLD + "Age: " + Console.UNDERLINED + age + Console.RESET)
  }

  def question3(): Unit ={
    val string = "http://allaboutscala"
    println (s"The eighth character in the string $string is " + string.charAt(8))
  }

  def question4(): Unit ={
    val numOfDonuts = 10
    val donutPrice = 2.50
    //val cost = totalCost(numOfDonuts, donutPrice)
    val cost = numOfDonuts*donutPrice
    //println("The total cost for buying 10 Glazed donuts is $" + f"$cost%1.2f")
    println(f"The total cost for buying $numOfDonuts Glazed donuts is $$$cost%1.2f")
  }

  def question5(): Unit = {
    val favMovie = readLine("What is your favorite movie of all time? ")
  }

  def question6(): Unit ={
    val favMovie = readLine("What is your favorite movie? ")
    val firstName = readLine("What is your first name? ")
    val lastName = readLine("What is your last name? ")
    println(
      s"""
         |First Name: $firstName
         |Last Name: $lastName
         |Favorite Movie: $favMovie
         |""".stripMargin)
  }
  def question7(): Unit = {
    val string = "Vanilla Donut 10 2.25"
    val split = string.split(" ")
    val donutType = split(0)
    val donutName = split(1)
    val quantity = split(2).toInt
    val price = split(3).toDouble
    println(
      s"""
         |Donut Name: $donutType $donutName
         |Donut Price: $$$price
         |Donut Purchased: $quantity
         |""".stripMargin)

  }
  def question8(): Unit ={
    val ages = Map("Tommy" -> 11, "Jonny" -> 8, "Cindy" -> 13, "Bill" -> 9)
    val backwardsMap = ListMap(ages.toSeq.sortWith(_._1 > _._1):_*)
    println("Children to ages in reverse order by their names = " + backwardsMap.mkString(", ") )
  }

  def question9(): Unit ={
    val basket1 = Array("Cake", "Milk", "Cheese", "Toilet Paper")
    val basket2 = Array("Bread", "Water", "Juice", "Milk", "Cheese")
    val common = basket1.intersect(basket2)
    //val common = basket1 intersect basket2
    println(
      s"""
         |Shopping Basket One = ${basket1.mkString(" - ")}
         |Shopping Basket Two = ${basket2.mkString(" - ")}
         |Common items are:
         |""".stripMargin)
    common.foreach(item => println(item.toUpperCase()))
  }

  def question10(): Unit ={
    val sequence = 100 to 110
    print("Number range from 100 to 110 inclusive = ")
    sequence.foreach(int => print(s"$int "))
    /*
    for(i <- 100 until 111)
      print(i + " ");
    // to print new line
    println();
    */
  }

  def printSolution(): Unit = {
    print("Which question do you want to see the solution for? ")
    val solution = readInt()
    if (solution == 1) {
      println(
        """
          |Create a Scala program to output the following basic JSON notation.
          |Output:
          |{
          |"donut_name":"Vanilla Donut",
          |"quantity_purchased":"10",
          |"price":2.5
          |}
          |""".stripMargin)
      println("MY SOLUTION: ")
      question1()
    }
    else if (solution == 2) {
      println(
        """
          |Create a Scala program to prompt customers for their name and age.
          |The format for the name and age labels should be in bold. And, the name literal should be underlined
          |""".stripMargin)
      println("MY SOLUTION: ")
      question2()
    }
    else if (solution == 3) {
      println(
        """
          |Create a Scala program to find the 8th character in the String: "http://allaboutscala".
          |""".stripMargin)
      println("MY SOLUTION: ")
      question3()
    }
    else if (solution == 4) {
      println(
        """
          |Create a Scala program to calculate the total cost for a customer who is buying 10 Glazed donuts. You can assume that the
          |price of each Glazed donut item is at $2.50. Notice the format of the $25.00 total cost literal, which is essentially at 2
          |decimal places
          |""".stripMargin)
      println("MY SOLUTION: ")
      question4()
    }
    else if (solution == 5) {
      println(
        """
          |Create a Scala program that will ask the following question to a customer: "What is your favorite movie of all times?".
          |
          |""".stripMargin)
      println("MY SOLUTION: ")
      question5()
    }
    else if (solution == 6){
      println(
        """
          |Create a Scala program to output your name and favorite movie.
          |Output:
          |First Name: Nadim
          |Last Name: Bahadoor
          |Favorite Movie: The Matrix
          |""".stripMargin)
      println("MY SOLUTION: ")
      question6()
    }
    else if (solution == 7) {
      println(
        """
          |Create a Scala program to parse the corresponding values from the given String "Vanilla Donut 10 2.25", where
          |the literal Vanilla Donut is a particular donut, the 10 literal is the quantity purchased, and 2.25 is the
          |unit price of each Vanilla Donut. You further need to cast each token from the input String to their
          |corresponding types, such as, an Int, Double or String.
          |""".stripMargin)
      println("MY SOLUTION: ")
      question7()
    }
    else if (solution == 8) {
      println(
        """
          |Create a Scala program and use an appropriate data structure to present the following key and value pairs of
          | children and their ages: Bill is 9 years old, Jonny is 8 years old, Tommy is 11 years old, and Cindy is 13
          | years old. Sort out the corresponding child to age in reverse alphabet order.
          |""".stripMargin)
      println("MY SOLUTION: ")
      question8()
    }
    else if (solution == 9) {
      println(
        """
          |Let us assume that you two shopping baskets with a bunch of items in each one. The first contains elements:
          |"Cake", "Milk", "Cheese", "Toilet Paper", and the second one has the following items: "Bread", "Water",
          |"Juice", "Milk", "Cheese". Write a Scala program to find the common items between the two shopping baskets.
          |You can use whichever data structure that you feel is appropriate for this particular problem.
          |""".stripMargin)
      println("MY SOLUTION: ")
      question9()
    }
    else if (solution == 10) {
      println(
        """
          |Create a Scala program that defines a sequence of numbers from 100 to 110.
          |The sequence should include the 100 starting number literal, and ends with the 110 number literal.
          |""".stripMargin)
      println("MY SOLUTION: ")
      question10()
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
