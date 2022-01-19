package Currying

object String {
  //Learning about currying
  //The basic way of creating functions
  def basicSum(a: Int, b: Int): Int = {
    a + b
  }

  //Using currying to break a function into one that takes single arguments
  def sum2(a: Int)(b: Int): Int = a + b
  //def sum2: Int => Int => a + b

  //Passing functions as arguments in other function parameter lists
  //Because functions are first class citizens in Scala, they can be treated like values
  def sum(f: Int => Int, a: Int, b: Int): Int = if (a > b) 0 else f(a) + sum(f, a + 1, b)

  def add2(a: Int): Int = {
    a + 2
  }

  //Another example of higher order functions
  def textStuff(func: String => String, a: String): String = {
    func(a)
  }

  def more(s: String): String = {
    s + " I am adding more to this string."
  }

  //Basic higher order function
  def oncePerSecond(callback: () => Unit) {
    callback()
  }

  def runAFunction(f: Int => Unit): Unit = {
    f(42)
  }

  // the function we'll pass in to oncePerSecond.
  // this can be any function that takes no args and doesn't
  // return anything.
  def timeFlies() {
    println("time flies like an arrow ...")
  }

  def printAnInt(i: Int): Unit = {
    println(i + 1)
  }

  def sum(x: Int, y: Int): Int = x + y

  def square(x: Int): Int = x * x

  //def curriedSum: Int => Int => Int = sum

  //MAIN METHOD
  def main(args: Array[String]): Unit = {
    //val p = "patrick"
    //println(more(p))
    val a = 2
    val b = 4
    //val sum40 = sum2(40)
    //println(sum40(50))
    //println(s"The sum of $a and $b is " + sum2(a)(b))
    //println(textStuff(more, "patrick"))
    //println(sum(add2, 5, 6))
    //oncePerSecond(timeFlies)
    //runAFunction(printAnInt)
    val x = Seq("me", "ma", "mo", "mu")
    val sq = x.map(_.toUpperCase())
    println(sq)


  }

}
