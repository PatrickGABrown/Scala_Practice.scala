package FileHandling
import scala.io.StdIn._
import scala.io.Source
import scala.collection.mutable.ArrayBuffer
import java.io._

object ReadingCSV {

  def printFromFile(fileName: String, filter: Int): Unit ={
    var usedPlatforms = ArrayBuffer("")
    val bigList = scala.collection.mutable.ListBuffer("")

    for (line <- Source.fromFile(fileName).getLines) {
      val lineString = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)") // ? = Once or more,
      filter match {
        case 1 => println(lineString(0))                    // Print each game name listed in the data.
        case 2 => {                                         // Print and collect data on the Game Developers in the data.
          bigList += line
          if (!usedPlatforms.contains(lineString(1)))
            println(lineString(1))
          usedPlatforms += lineString(1)
        }
        case 3 => {                                         // Print all the years that games were released.
          if (!usedPlatforms.contains(lineString(2)))
            println(lineString(2))
          usedPlatforms += lineString(2)
        }
        case 4 => {                                         // Print all listed Game Genres in data
          if (!usedPlatforms.contains(lineString(3)))
            println(lineString(3))
          usedPlatforms += lineString(3)
        }
        case 5 => {                                         // Print all listed Game Developers in data
          if (!usedPlatforms.contains(lineString(4)))
            println(lineString(4))
          usedPlatforms += lineString(4)
        }
        case 6 => {                                         // Print all game information
          println("Name: " + lineString(0) + " | Platform: " + lineString(1) + " | Year: " + lineString(2) + " | Genre: " + lineString(3) + " | Developer: " + lineString(4))
        }
        case _ => {                                         // User must input a number 1-7.
          println("Please choose numbers 1-6: ")
          var result = getUserInput()
          printFromFile("src/datasets/Video_Games_Sales_as_at_22_Dec_2016.csv", result)
        }
      }
    }
    //Creating a list collected from case 2 and turning it into a readable string to allow Regex to help count frequencies
    val stringList = bigList.toString()
    var increment = 0
    val matcher ="(?:Wii)".r
    for(x <- matcher.findAllIn(stringList) ) {
      increment += 1

    }
    //Writing to a File
    val file = new File("Frequencies.txt")
    val bw = new BufferedWriter(new FileWriter(file))
    bw.write("Frequency of the Wii: " + increment.toString)
    bw.close()

    // Last thing to do is check if they want to look through information again.
    if(playAgain()){
      val category = getUserInput()
      printFromFile("src/datasets/Video_Games_Sales_as_at_22_Dec_2016.csv", category)
    }else
      System.exit(0)
  }

  // Method to reduce redundancy of recieving the filter.
  def getUserInput(): Int = {
    println(
      """Please enter one of the following numbers to pick a category:
        |1 Name of Games
        |2 Type of Platforms (Frequency of Wii printed to a file)
        |3 Years of Released Games
        |4 Game Genres
        |5 Game Developers
        |6 Print all game information
        |""".stripMargin)
    var result = readInt()
    result
  }
  //Method to allow for replay ability
  def playAgain(): Boolean ={
    var result = readLine("Enter \"Yes\" if you want to play again; \"No\" if you want to quit: ")
    if (result.equals("Yes") || result.equals("yes")){
      return true
    }else
      false
  }

  def main(args: Array[String]): Unit = {

    val category = getUserInput()
    printFromFile("src/datasets/Video_Games_Sales_as_at_22_Dec_2016.csv", category)
  }
}