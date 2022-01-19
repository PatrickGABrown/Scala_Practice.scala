package LearningScalaOnMyOwn

object AuxiliaryConstructors {
  // Primary constructor
  class GFG( Lname: String, Tname: String)
  {
    //var no: Int = 0;;
    var no = 0
    def show()
    {
      println("Language name: " + Lname);
      println("Topic name: " + Tname);
      println("Total number of articles: " + no);

    }

    // Auxiliary Constructor
    def this(Lname: String, Tname: String, no:Int)
    {

      // Invoking primary constructor
      this(Lname, Tname)
      this.no = no //identify the argument that isn't from another constructor
    }
  }

  //Practice working with Auxiliary classes
  class Animal{
    private var name = " "
    private var age = 0
    def this(name: String){
      this()
      this.name = name
    }
    def this(name: String, age: Int){
      this(name)
      this.age = age
    }
    def display(){
      println(s"I am a $name")
      println(s"I am $age years old.")
    }
  }

  // Creating object
  // Main method
  def main(args: Array[String])
  {

    // Creating object of GFG class
    var obj = new GFG("Scala", "Constructor", 4);
    obj.show();

    //Creating object of the Animal class
    var dolphin = new Animal("Dolphin", 5)
    dolphin.display()
  }

}
