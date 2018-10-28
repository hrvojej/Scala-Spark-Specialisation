object session {

  def abs(x:Double) = if(x<0) - x else x

  def square(x:Double) = x * x

  def sqrtIter(guess: Double, x: Double): Double =

    if (isGoodEnough(guess, x)) guess

    else sqrtIter(improve(guess, x), x)

  def improve(guess: Double, x: Double) =

    (guess + x / guess) / 2

  def isGoodEnough(guess: Double, x: Double) =

    abs(square(guess) - x) / x < 0.001

  def sqrt(x: Double) = sqrtIter(1.0, x)

  sqrt(1e60)

}