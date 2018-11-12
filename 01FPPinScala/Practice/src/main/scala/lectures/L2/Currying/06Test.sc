import math.abs

object findme {

  val tolerance = 0.0001

  def isCloseEnough (x:Double, y:Double) =
    abs((x-y)/x)/x<tolerance

  def fixedPoint(f:Double=>Double)(guessInit:Double) = {
    def iterate (guess:Double):Double = {
      val next = f(guess)
      if (isCloseEnough(guess, next)) guess
      else iterate(next)
    }
    iterate(guessInit)
  }
  fixedPoint(x=>1/x + 56)(45)
  def sqrt(x:Double) = fixedPoint(y=>x/y)(1)
  sqrt(2)
}