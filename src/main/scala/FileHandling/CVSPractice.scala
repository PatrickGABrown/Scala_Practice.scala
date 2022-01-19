package FileHandling

import scala.collection.mutable.ArrayBuffer
import scala.io.Source
import scala.io.Source._
import scala.io.StdIn.{readInt, readLine}

object CVSPractice {
  def printFromFile(fileName: String, filter: Int): Unit = {
    var usedPlatforms = ArrayBuffer(" ")

    for (line <- fromFile(fileName).getLines) {
      val lineString = line.split(",")
      filter match{
        case 1 => println(lineString(0))
        case 2 => {
          if(!usedPlatforms.contains(lineString(1))) {
            println(lineString(1))
            usedPlatforms+=lineString(1)
          }
        }
        case _ => println("Nope")
      }
      //val gameName = lineString(0)
      //println(gameName)
    }
  }

  def main (args: Array[String]): Unit = {
    //printFromFile("src/datasets/Video_Games_Sales_as_at_22_Dec_2016.csv", 2)
    /*
    val x = "/Users/patrickbrown/Desktop/Video_Games_Sales_as_at_22_Dec_2016.csv"
    val fileName = readLine("Enter a file name: ")
    val bufferedSource = io.Source.fromFile(fileName)
    for (line <- bufferedSource.getLines) {
      val cols = line.split(",").map(_.trim)
      // do whatever you want with the columns here
      println(s"${cols(0)}|${cols(1)}|${cols(2)}|${cols(3)}")
    }
    bufferedSource.close

     */

    var usedPlatforms = ArrayBuffer("")
    val filename = readLine("Enter a file name: ")
    //val x = io.Source.fromFile(filename)
    /*
    for (line <- fromFile(s"$filename").getLines){
      println(line)
    }
    */

    for (line <- Source.fromFile(s"$filename").getLines){
      val lineString = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)")  // ? = Once or more,
      1 match {
        case 1 => println(lineString(0))
        case 2 => {
          if (!usedPlatforms.contains(lineString(1)))
            println(lineString(1))
          usedPlatforms+=lineString(1)
        }
        case _ => println("Nope")
      }
    }


  }


}
