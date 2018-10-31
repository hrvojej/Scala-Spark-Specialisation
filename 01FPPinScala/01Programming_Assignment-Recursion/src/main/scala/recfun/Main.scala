package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
    * Exercise 1
    */

  def pascal(col: Int, row: Int): Int = {
    if (col <= 0 || col == row) 1
    else pascal(col, row - 1) + pascal(col - 1, row - 1)
  }

  /**
    * Exercise 2
    */
  def checkOpen(chars: List[Char], countOpen: Int): Boolean = {
    if (chars.isEmpty) {
      countOpen == 0
    } else {
      val first = chars.head
      val count =
        if (first == '(') countOpen + 1
        else if (first == ')') countOpen - 1
        else countOpen
      if (count >= 0) checkOpen(chars.tail, count)
      else false
    }
  }

  def balance(chars: List[Char]) = {
    checkOpen(chars: List[Char], 0)
  }

  /**
    * Exercise 3
    */
  def countChange(money: Int, coins: List[Int]): Int = {
    if (money < 0) 0
    else if (coins.isEmpty)
      if (money == 0) 1 else 0
    else
      countChange(money - coins.head, coins) + countChange(money, coins.tail)
  }
}
