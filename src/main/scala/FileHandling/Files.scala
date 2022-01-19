package FileHandling

import java.io.{File, PrintWriter}

object Files {
  def main(args: Array[String]): Unit = {
    //To create a new file to write to, we create a new instance of the PrintWriter
    //and pass a new file object into it.
    val writer=new PrintWriter(new File("demo1.txt"))
    //Now to write to the file, we call the method write() on the object we created.
    writer.write("This is a demo.")
    //To see these changes reflected in the file, we need to close it with Scale.
    writer.close()
    //Now check the file
  }
}
