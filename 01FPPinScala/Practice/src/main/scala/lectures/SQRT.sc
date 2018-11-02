def sqrt(x:Double):Double = {

  def square(x:Double) = x*x
  def abs(x:Double) = if(x>=0) x else -x

  def sqrtIter(guess:Double, x:Double) :Double =
    if (isGoodEnough(guess)) guess
    else sqrtIter(improve(guess), x)

  def isGoodEnough(guess:Double):Boolean =
    abs(square(guess) - x)/ 2 <0.000001

  def improve(guess:Double):Double =
    (guess + x/guess)/ 2

  sqrtIter(5, x)

}

sqrt(81)