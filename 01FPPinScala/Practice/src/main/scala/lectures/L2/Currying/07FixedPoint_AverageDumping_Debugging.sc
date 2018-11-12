/* Average Dumping */

import math.abs

object pero {

  val tolerance = 0.0001

  def isCloseEnough (x:Double, y:Double) =
    abs((x-y)/x)/x<tolerance

  def fixedPoint(f:Double=>Double)(guessInit:Double)  = {
    def iterate (guess:Double):Double = {
      /*Debuging */
      println("guess = " + guess)
      val next = f(guess)
      if (isCloseEnough(guess, next)) guess
      else iterate(next)
    }
    iterate(guessInit)
  }
  fixedPoint(x=>1/x + 56)(45)

  /* Average Dumping */
  def sqrt(x:Double) = fixedPoint(y=>(y+x/y)/2)(1)
  sqrt(2)


}