package assignments

object Main {
  def main(args: Array[String]) {
    println("Change")
    countChange(4, List(1, 2, 5))
  }

  def countChange(money: Int, coins: List[Int]): Int = {
    if (money < 0) 0
    else if (coins.isEmpty)
      if (money == 0) 1 else 0
    else
      countChange(money, coins.tail) + countChange(money - coins.head, coins)
  }
}










