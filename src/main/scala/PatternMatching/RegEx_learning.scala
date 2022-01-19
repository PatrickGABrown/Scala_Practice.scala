package PatternMatching

//you have to import a class for Regexes
import scala.util.matching.Regex

object RegEx_learning {

  def main (args: Array[String]): Unit = {
    val a = "Hi there".r
    val phoneN = """\(d\d\d\) \d\d\d-\d\d\d\d""".r
    val intRegEx = """([+-]?(\d+))""".r
    val numbers = "1, -2, 34, 46, 5, 6"

    val nums:Iterator[String] = for(s <- intRegEx.findAllIn(numbers)) yield s
    //nums.foreach(println)

    val myText = "High in the Hi there mountains, Hi there there was an ibex."
    val dict:Iterator[String] = for(hold <- a.findAllIn(myText)) yield hold
    var placeHolder = 0
    dict.foreach(i => print(placeHolder))


    //FindFirstIn is a method built in to the RegEx class that checks for the first
    //item in the string that matches the pattern. It returns that item as a Sting.
    //All of the other built-in RegEx methods return the results as iterator values.
    //So you have to use an iterator to print them.
    val p = "([0-9])".r
    val y = "The year is now 2022"
    //val tester = p.findAllIn(s)
    //val tester = p.findFirstIn("It's the remix yal! 2022!! Let's go!!!")
    //println(tester)
    //println(p.findFirstIn("It's the remix! 2022!! Let's go!!!"))
    //findAllIn returns the items as iterators, so you have to print them like this:
    val store:Iterator[String] = for(index <- p.findAllIn(y)) yield index
    //store.foreach(println)


    //val polishPostalCode = new Regex("([0-9]{2})\\-([0-9]{3})")
    //val postCode = polishPostalCode.findFirstIn("Warsaw 01-011, Jerusalem Avenue")
    //println(postCode)
    //assertEquals("01-011", postCode)
  }
}
