package FileHandling

import java.io.{File, PrintWriter}
import java.util.Scanner
import scala.io.StdIn._

object ReadFile {
  def main(args: Array[String]):Unit={
    // Assign variable
    var matchFound = false;

    // Instantiate File objects. pathnames given are for the root directory
    val fileText = new File("text.txt")
    val fileNew = new File("new_text.txt")
    val filePass = new File("passwords.txt")

    val readerText = new Scanner(fileText);
    val readerPass = new Scanner(filePass);

    val writerNew = new PrintWriter(fileNew) // Instantiate PrintWriter objects
    val writerText = new PrintWriter(fileText)
    val writerPass = new PrintWriter(filePass)

    writerText.write( // Writes and creates the text.txt file so one does not need to already exist
      """Hello.
        |This
        |is my multi-line
        |text file.
        |Hopefully this text will be copied to new_text.txt
        |""".stripMargin)
    writerText.close()

    writerPass.write( // Writes and creates the passwords.txt file so one does not need to already exist
      """name,pass
        |yash,dhayal
        |justis,greatpassword
        |test,pass
        |john,1234
        |""".stripMargin)
    writerPass.close()

    // Take user input
    val u = readLine("Username?: ");
    val p = readLine("Password?: ");

    // Format username and password to match convention in passwords.txt
    val userPass = u + "," + p;

    while (readerPass.hasNextLine && !matchFound) {
      val line = readerPass.nextLine()
      if (userPass == line) matchFound = true
    }

    if (!matchFound) println("Your username and password are incorrect!")

    while (readerText.hasNextLine && matchFound) {
      val line = readerText.nextLine()
      writerNew.write(line + "\n")
    }

    writerNew.close()
  }
}