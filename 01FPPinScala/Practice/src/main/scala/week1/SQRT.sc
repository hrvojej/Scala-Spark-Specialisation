def square(x:Double)= x*x
def abs (x:Double)= if (x>=0) x else -x

def sqrt(x:Double):Double = {

  def sqrIter (guess:Double):Double =
    if (isGoodGuess(guess)) guess
    else sqrIter(improve(guess))

  def isGoodGuess(guess:Double):Boolean =
    abs(square(guess) - x)/x < 0.0001

  def improve(guess:Double) =
             (guess - x/guess)/2

  sqrIter(20.0)

}

sqrt(20.0)