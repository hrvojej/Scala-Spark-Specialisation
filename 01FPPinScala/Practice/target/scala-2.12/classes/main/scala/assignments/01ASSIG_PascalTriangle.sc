import scala.compat.Platform.EOL

object Main {
  def main(args: Array[String]): Unit = {
    println("Printing Pascal Triangle")
    for (row <- 1 to 10)
      for (col <- 1 to row)
        print(pascal(col, row) + " ")
    println(EOL)
  }

  def pascal(col:Int, row:Int):Int =
    if (col == 0 || col == row) 1 else
      pascal(col, row-1) + pascal(col-1, row-1)
}

Main.main(Array("Print Pascal triangle buddy!"))
