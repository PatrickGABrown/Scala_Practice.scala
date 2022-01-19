package Classes_Methods

object Demo {

  //Everything seems to operate inside of these singletons in IntelliJ's version of Scala
  //Creating classes and objects happens inside of singletons
  //Here is an Animal class
  class Animal(var name: String = "The animal"){
    def eat(): Unit = {
      println(s"$name is eating")
    }
    def move(): Unit = {println(s"$name animal is moving.")}
    def sleep(): Unit = println(s"$name is sleeping.")
    def die(): Unit = println(s"I am sorry to inform you that $name is dead.")
  }

  class Algebra(var x: Int, var y: Int){
    def sum(): Int = {
        x + y
    }
    def diff(): Int = if (x>y) x - y else y-x
  }

  //Here is my main method
  def main(args: Array[String]): Unit = {
    //Here I create a new instance of the Animal class called dolphin
    val dolphin = new Animal("Dolphin")
    dolphin.eat()

    val m = new Algebra(5, 10)
    println("The sum is " + m.sum())
    println("The difference is " + m.diff())
  }

}
