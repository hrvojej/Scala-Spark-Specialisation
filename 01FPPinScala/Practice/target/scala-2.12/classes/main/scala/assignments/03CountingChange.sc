/*
Exercise 3: Counting Change
  Write a recursive function that counts how many different ways you can make change for an amount,
  given a list of coin denominations. For example, there are 3 ways to give change for 4 if you have
  coins with denomination 1 and 2: 1+1+1+1, 1+1+2, 2+2.

Do this exercise by implementing the countChange function inMain.scala.
This function takes an amount to change, and a list of unique denominations for the coins.
Once again, you can make use of functions isEmpty, head and tail on the list of integers coins.

Hint: Think of the degenerate cases. How many ways can you give change for 0 CHF(swiss money)?
How many ways can you give change for >0 CHF, if you have no coins?

*/

//def countChange(money: Int, coins: List[Int]): Int

def countChange(money: Int, coins: List[Int]): Int =
  if (money < 0) 0
  else if (coins.isEmpty)
    if (money == 0) 1 else 0
  else
    countChange(money, coins.tail) + countChange(money - coins.head, coins)

countChange(4, List(1,2,5))
