// Square root Newton method
def square(x: Double) = x * x

def abs(x: Double) = if (x >= 0) x else -x

def sqrt(x:Double)= {

   def sqrtIter(guess: Double): Double =
    if (isGoodEnough(guess)) guess
    else sqrtIter(improve(guess))

  def isGoodEnough(guess: Double) =
    abs(square(guess) - x) / x < 0.000001

  def improve(guess: Double) =
    (guess + x / guess) / 2

  sqrtIter(20.0)
}

sqrt(25.0)



