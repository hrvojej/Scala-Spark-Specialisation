def sqrtIter(guess:Double, x:Double):Double =
  if (isGoodEnough(guess, x)) guess
  else sqrtIter(improve(guess, x), x)

def square(x:Double) = x*x
def abs(x:Double) = if (x>=0) x else -x

def isGoodEnough(guess: Double, x: Double) =
  abs(square(guess) - x)/x <0.001

def improve(guess: Double, x: Double) =
  (guess + guess/x)/2

def sqrt(x:Double) = sqrtIter(2.0, x)

sqrt(1e20)