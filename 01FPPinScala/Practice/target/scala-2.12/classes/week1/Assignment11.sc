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
    val l = if (col > row / 2) col else row - col

    def go(i: Int, acc: Int): Int = {
      if (i == l + 1) acc
      else go(i + 1, acc * (row - l + i) / i)
    }
    return go(1, 1);
  }
}

