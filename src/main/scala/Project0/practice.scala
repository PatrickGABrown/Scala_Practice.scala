package Project0

import scala.io.StdIn.{readInt, readLine}

object practice {
  def genrePicker(): Int = {
    println(
      """
        |Choose which genre you want to watch.
        |Enter a number to make a selection:
        |1) Drama
        |2) Action
        |3) Comedy
        |4) Horror
        |5) Sci-Fi
        |6) Thriller
        |7) Western
        |8) Romance
        |9) Adventure
        |10) Crime
        |11) Musical
        |12) Fantasy
        |13) Biopic
        |14) Documentary
        |""".stripMargin)

    val choice = readInt()
    choice
  }

  def laMovieGenrePicker(): Unit = {
    var choice = genrePicker()
    if (choice==1){
      println("Live-Action Drama Movies.")
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        laMovieGenrePicker()
      }
      else{
        0
      }
    }
    else if(choice==2){
      println("Live-Action Action Movies.")
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        laMovieGenrePicker()
      }
      else{
        0
      }
    }
    else if(choice==3){
      println("Live-Action Comedy Movies.")
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        laMovieGenrePicker()
      }
      else{
        0
      }
    }
    else if(choice==4){
      println("Live-Action Horror Movies.")
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        laMovieGenrePicker()
      }
      else{
        0
      }
    }
    else if(choice==5){
      println("Live-Action Sci-Fi Movies.")
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        laMovieGenrePicker()
      }
      else{
        0
      }
    }
    else if(choice==6){
      println("Live-Action Thriller Movies.")
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        laMovieGenrePicker()
      }
      else{
        0
      }
    }
    else if(choice==7){
      println("Live-Action Western Movies.")
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        laMovieGenrePicker()
      }
      else{
        0
      }
    }
    else if(choice==8){
      println("Live-Action Romance Movies.")
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        laMovieGenrePicker()
      }
      else{
        0
      }
    }
    else if(choice==9){
      println("Live-Action Adventure Movies.")
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        laMovieGenrePicker()
      }
      else{
        0
      }
    }
    else if(choice==10){
      println("Live-Action Crime Movies.")
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        laMovieGenrePicker()
      }
      else{
        0
      }
    }
    else if(choice==11){
      println("Live-Action Musical Movies.")
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        laMovieGenrePicker()
      }
      else{
        0
      }
    }
    else if(choice==12){
      println("Live-Action Fantasy Movies.")
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        laMovieGenrePicker()
      }
      else{
        0
      }
    }
    else if(choice==13){
      println("Live-Action Biopic Movies.")
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        laMovieGenrePicker()
      }
      else{
        0
      }
    }
    else if(choice==14){
      println("Live-Action Documentary Movies.")
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        laMovieGenrePicker()
      }
      else{
        0
      }
    }
    else{
      println("Enter a valid number (1-14).")
      laMovieGenrePicker()
    }

  }

  def animatedMovieGenrePicker(): Unit = {
    var choice = genrePicker()
    if (choice==1){
      println("Animated Drama Movies.")
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        animatedMovieGenrePicker()
      }
      else{
        0
      }
    }
    else if(choice==2){
      println("Animated Action Movies.")
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        animatedMovieGenrePicker()
      }
      else{
        0
      }
    }
    else if(choice==3){
      println("Animated Comedy Movies.")
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        animatedMovieGenrePicker()
      }
      else{
        0
      }
    }
    else if(choice==4){
      println("Animated Horror Movies.")
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        animatedMovieGenrePicker()
      }
      else{
        0
      }
    }
    else if(choice==5){
      println("Animated Sci-Fi Movies.")
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        animatedMovieGenrePicker()
      }
      else{
        0
      }
    }
    else if(choice==6){
      println("Animated Thriller Movies.")
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        animatedMovieGenrePicker()
      }
      else{
        0
      }
    }
    else if(choice==7){
      println("Animated Western Movies.")
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        animatedMovieGenrePicker()
      }
      else{
        0
      }
    }
    else if(choice==8){
      println("Animated Romance Movies.")
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        animatedMovieGenrePicker()
      }
      else{
        0
      }
    }
    else if(choice==9){
      println("Animated Adventure Movies.")
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        animatedMovieGenrePicker()
      }
      else{
        0
      }
    }
    else if(choice==10){
      println("Animated Crime Movies.")
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        animatedMovieGenrePicker()
      }
      else{
        0
      }
    }
    else if(choice==11){
      println("Animated Musical Movies.")
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        animatedMovieGenrePicker()
      }
      else{
        0
      }
    }
    else if(choice==12){
      println("Animated Fantasy Movies.")
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        animatedMovieGenrePicker()
      }
      else{
        0
      }
    }
    else if(choice==13){
      println("Animated Biopic Movies.")
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        animatedMovieGenrePicker()
      }
      else{
        0
      }
    }
    else if(choice==14){
      println("Animated Documentary Movies.")
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        animatedMovieGenrePicker()
      }
      else{
        0
      }
    }
    else{
      println("Enter a valid number (1-14).")
      animatedMovieGenrePicker()
    }
  }

  def laShowGenrePicker(): Unit = {
    var choice = genrePicker()
    if (choice==1){
      println("Live-Action Drama Shows.")
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        laShowGenrePicker()
      }
      else{
        0
      }
    }
    else if(choice==2){
      println("Live-Action Action Shows.")
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        laShowGenrePicker()
      }
      else{
        0
      }
    }
    else if(choice==3){
      println("Live-Action Comedy Shows.")
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        laShowGenrePicker()
      }
      else{
        0
      }
    }
    else if(choice==4){
      println("Live-Action Horror Shows.")
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        laShowGenrePicker()
      }
      else{
        0
      }
    }
    else if(choice==5){
      println("Live-Action Sci-Fi Shows.")
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        laShowGenrePicker()
      }
      else{
        0
      }
    }
    else if(choice==6){
      println("Live-Action Thriller Shows.")
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        laShowGenrePicker()
      }
      else{
        0
      }
    }
    else if(choice==7){
      println("Live-Action Western Shows.")
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        laShowGenrePicker()
      }
      else{
        0
      }
    }
    else if(choice==8){
      println("Live-Action Romance Shows.")
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        laShowGenrePicker()
      }
      else{
        0
      }
    }
    else if(choice==9){
      println("Live-Action Adventure Shows.")
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        laShowGenrePicker()
      }
      else{
        0
      }
    }
    else if(choice==10){
      println("Live-Action Crime Shows.")
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        laShowGenrePicker()
      }
      else{
        0
      }
    }
    else if(choice==11){
      println("Live-Action Musical Shows.")
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        laShowGenrePicker()
      }
      else{
        0
      }
    }
    else if(choice==12){
      println("Live-Action Fantasy Shows.")
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        laShowGenrePicker()
      }
      else{
        0
      }
    }
    else if(choice==13){
      println("Live-Action Biopic Shows.")
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        laShowGenrePicker()
      }
      else{
        0
      }
    }
    else if(choice==14){
      println("Live-Action Documentary Shows.")
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        laShowGenrePicker()
      }
      else{
        0
      }
    }
    else{
      println("Enter a valid number (1-14).")
      laShowGenrePicker()
    }
  }

  def animatedShowGenrePicker(): Unit = {
    var choice = genrePicker()
    if (choice==1){
      println("Animated Drama Shows.")
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        animatedShowGenrePicker()
      }
      else{
        0
      }
    }
    else if(choice==2){
      println("Animated Action Shows.")
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        animatedShowGenrePicker()
      }
      else{
        0
      }
    }
    else if(choice==3){
      println("Animated Comedy Shows.")
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        animatedShowGenrePicker()
      }
      else{
        0
      }
    }
    else if(choice==4){
      println("Animated Horror Shows.")
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        animatedShowGenrePicker()
      }
      else{
        0
      }
    }
    else if(choice==5){
      println("Animated Sci-Fi Shows.")
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        animatedShowGenrePicker()
      }
      else{
        0
      }
    }
    else if(choice==6){
      println("Animated Thriller Shows.")
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        animatedShowGenrePicker()
      }
      else{
        0
      }
    }
    else if(choice==7){
      println("Animated Western Shows.")
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        animatedShowGenrePicker()
      }
      else{
        0
      }
    }
    else if(choice==8){
      println("Animated Romance Shows.")
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        animatedShowGenrePicker()
      }
      else{
        0
      }
    }
    else if(choice==9){
      println("Animated Adventure Shows.")
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        animatedShowGenrePicker()
      }
      else{
        0
      }
    }
    else if(choice==10){
      println("Animated Crime Shows.")
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        animatedShowGenrePicker()
      }
      else{
        0
      }
    }
    else if(choice==11){
      println("Animated Musical Shows.")
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        animatedShowGenrePicker()
      }
      else{
        0
      }
    }
    else if(choice==12){
      println("Animated Fantasy Shows.")
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        animatedShowGenrePicker()
      }
      else{
        0
      }
    }
    else if(choice==13){
      println("Animated Biopic Shows.")
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        animatedShowGenrePicker()
      }
      else{
        0
      }
    }
    else if(choice==14){
      println("Animated Documentary Shows.")
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        animatedShowGenrePicker()
      }
      else{
        0
      }
    }
    else{
      println("Enter a valid number (1-14).")
      animatedShowGenrePicker()
    }
  }

  def aniOrLAMovie(): Unit={
    println(
      """
        |Do you want to watch an animated film or a live-action film?
        |Enter a number to select an option:
        |1) Live-Action
        |2) Animated
        |""".stripMargin)
    val choice = readInt()
    if (choice == 1){
      laMovieGenrePicker()
    }
    else if(choice == 2){
      animatedMovieGenrePicker()
    }
  }

  def aniOrLAShow(): Unit = {
    println(
      """
        |Do you want to watch an animated series or a live-action series?
        |Enter a number to select an option:
        |1) Live-Action
        |2) Animated
        |""".stripMargin)
    val choice = readInt()
    if (choice == 1){
      laShowGenrePicker()
    }
    else if(choice == 2){
      animatedShowGenrePicker()
    }

  }

  def movieOrShow(): Unit = {
    println(
      """
        |Do you want to watch a movie or a series?
        |Enter a number to select an option:
        |1) Movie
        |2) Series
        |""".stripMargin)
    val choice = readInt()

    if (choice == 1 ){
      aniOrLAMovie()
    }
    else if (choice == 2){
      aniOrLAShow()
    }
    else{
      println("Enter a valid number (1 or 2).")
      movieOrShow()
    }

  }

  def possibilities(): Unit = {
    println(
      """
        |Welcome to the Screen Servant!
        |Enter a number to select a category:
        |1) View my watchlist
        |2) View my watched list
        |3) I do not know what to watch
        |""".stripMargin)
    val choice = readInt()
    if (choice == 1) {
      println("Here is your watchlist.")
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        possibilities()
      }
      else{
        0
      }

    }
    else if (choice == 2){
      println("Here is your watched list.")
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        possibilities()
      }
      else{
        0
      }
    }
    else if(choice == 3){
      movieOrShow()
    }
    else{
      println("Enter a valid number (1-3).")
      possibilities()
    }
  }

  def main (args: Array[String]): Unit = {
    possibilities()
  }

}
