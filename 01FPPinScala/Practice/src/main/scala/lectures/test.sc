
def square(x:Double) = x*x

def abs(x:Double) = if (x>=0) x else -x

def sqrt(x:Double):Double = {

  def sqrtIter(guess:Double):Double =
    if (isGoodEnough(guess)) guess
    else sqrtIter(improve(guess))

  def isGoodEnough(guess: Double):Boolean =
    abs(square(guess) - x)/x < 0.0000001

  def improve(guess: Double):Double =
    (guess + x/guess) / 2

  sqrtIter(45)
  }

sqrt(25)
