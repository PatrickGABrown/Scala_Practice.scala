package LearningScalaOnMyOwn

import scala.io.StdIn.{readInt, readLine}

object Functions {
  //this is a recursive function
  def factorial(n:Int):Int = if(n==0) 1 else n*factorial(n-1)

  def main(args: Array[String]): Unit = {

    val longMovie =
      """
        |Night of the Day of the Dawn of the Son of the Bride of the Return of the Revenge of the Terror of the Attack
        |of the Evil Mutant Hellbound Flesh Eating Crawling Alien Zombified Subhumanoid Living Dead
        |""".stripMargin

    println("The number of chars in this movie is " + longMovie.length)

    //val x = 2.23F
    //val x = -1
    //if (x<1) println("x < 1") else 0

    //val a = (1, 2, 3.4, "WOW")
    //println(a._4)

    //var s1 = Set(1, 2, 3, 4, 5)
    //s1 += 6




    /*
    val animals = Seq("Rat", "Cat", "Bat", "Frog")
    animals.foreach(animal => animal.toUpperCase())
    animals.foreach(animal => println(s"$animal"))

     */

    /*
    for (i <- 1 to 5)
      println("Looped " + i + " times")

     */

    /*
    for (i <- 1 to 3; j <- 1 to 3)
      println("Looped " + i + " times")

     */

    /*
    val testArray = Array(1, 2, 3, "me")
    println(testArray(2))
    testArray(2) = 4
    println(testArray(2))
    //for i <- testArray do println(i)

    for (i <- 0 to testArray.length-1)
      println(testArray(i))

     */

    /*
    val ints = List(1, 2, 4, 3)
    for (i <- ints)
      println(i)

    //Using yield after for expressions returns output with a return type as a result
    //instead of using print statement and returning a unit
    val tester = for (i <- ints) yield i*2
    println(tester)

     */


    /*
    println("Enter a number to find the factorial of: ")
    val value = readInt()
    println(s"$value! = " + factorial(value))

     */
  }

}
