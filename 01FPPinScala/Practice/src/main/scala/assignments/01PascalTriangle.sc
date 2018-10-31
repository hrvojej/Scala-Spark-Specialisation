object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  def pascal(col: Int, row: Int): Int = {
    if (col <= 0 || col == row) 1
    else pascal(col, row-1) + pascal(col-1, row-1)
  }
}

Main.main(Array("Pascalero"))