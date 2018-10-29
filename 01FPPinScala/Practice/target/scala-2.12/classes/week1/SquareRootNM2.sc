
def sqrt(x:Double):Double = {

  def sqare(x:Double) = x*x
  def abs(x:Double) = if (x>=0) x else -x

  def sqrtIter(guess:Double):Double =
    if (isGoodEnough(guess)) guess
    else sqrtIter(improve(guess))

  def isGoodEnough(guess: Double) =
    abs(sqare(guess) - x)/x <5e-10

  def improve(guess:Double) =
    (guess + x/guess)/2
}

sqrt(20.0)

