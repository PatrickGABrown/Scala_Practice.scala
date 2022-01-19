package LearningScalaOnMyOwn

import scala.io.StdIn.{readInt, readLine}

object ProblemOne {
  def lastListItem(x:List[Int]):Unit = {
    println("This function finds the last element of a list.")
    println("The last element of the list is " + x.last)
  }

  def arrayLast[A](x:Array[A]): A = {
    x.last
  }
  def stringLast[A](x:Array[A]): A = {
    x.last
  }

  //Scala pattern matching allows us to easily check for the last item in the list
  def listLastRecursive[A](ls: List[A]): A = ls match {
    case h :: Nil  => h //if your list has only 2 elements, return the first one
    case _ :: tail => listLastRecursive(tail)
    case _         => throw new NoSuchElementException
  }

  def lastListItemLoop(x:List[Int]): Unit = {
    var b = 0
    while(b < x.length){
      if (x(b) == x(x.length-1)) {
        println("The last item in the list is " + x(b))
      }
      b+=1 //If the item is not last, go to the next item
    }
  }

  def lastArrayItem(x:Array[Int]):Unit = {
    println("This function finds the last element of a list.")
    println("The last element of the list is " + x.last)
  }

  def lastArrayItemLoop(x:Array[Int]): Unit = {
    var b = 0
    while(b < x.length){
      if (x(b) == x(x.length-1)) {
        println("The last item in the list is " + x(b))
      }
      b+=1 //If the item is not last, go to the next item
    }
  }

  def main(args: Array[String]): Unit = {
    /*
    println(
      """
        |It is time to begin the 99 problems. Choose one to look at.
        |Enter a number from 1 to 99.
        |""".stripMargin)
    val choice = readInt()
    */

    val newList = List(1, 2, 3, 4, 5, 6)
    val newArray = Array(1, 2, 3, 4, 5)
    val stringArray = Array("me", "ma", "mo", "mu")
    //We can use a last function that is built-in to Scala to print the last item in a list
    //lastListItem(newList)
    //lastArrayItem(newArray)
    //lastListItemLoop(newList)
    //lastArrayItemLoop(newArray)
    //println("The last item in the array is " + arrayLast(stringArray))
    println("The last item in the array is " + listLastRecursive(newList))


    //THERE ARE MANY WAYS TO ITERATE THROUGH A LIST:
    //#1 FOR LOOP
    /*
    for (i <- 0 to newArray.length-1)
      println(newArray(i))

     */

    //#2 WHILE LOOP
    //When a while loop doesn't satisfy the condition it ends,
    // so we can put array.length instead of length-1
    /*
    var i = 0
    while(i < newArray.length) {
      println(newArray(i))
      i+=1
    }

    var b = 0
    while(b < newArray.length){
      if (newArray(b) == newArray(newArray.length-1)) {
        println("The last item in the list is " + newArray(b))
      }
      b+=1 //If the item is not last, go to the next item
    }
    */

    /*
    var v = 0
    while(v < newList.length){
      if (newList(v) == newList(newList.length-1))
        println("The last item in the list is " + newList(v))
      else {
        println("Not there.")
      }
      v = v+1
    }
     */

  }

}
