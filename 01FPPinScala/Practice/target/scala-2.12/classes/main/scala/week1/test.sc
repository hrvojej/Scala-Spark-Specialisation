import scala.compat.Platform.EOL

object Main {
  def main(args:Array[String]) = {
    println("Creating Pascal Triangle")
    for (row <- 1 to 10)
      for (col <- 1 to row)
        print(pascal(row, col) + " ")
      println(EOL)
  }

  def pascal(row:Int, col:Int):Int =
    if (col == 0 || col == row) 1
    else pascal(row-1, col) + pascal(row-1, col-1)
 }

Main.main(Array("Create Pascal tree!"))