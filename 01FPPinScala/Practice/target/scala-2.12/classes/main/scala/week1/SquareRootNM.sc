def sqrtIter(guess:Double, x:Double):Double =
    if (isGoodEnough(guess,x)) guess
    else sqrtIter(improve(guess, x), x)

def sqare(x:Double) = x*x
def abs(x:Double) = if (x>=0) x else -x

def isGoodEnough(guess: Double, x: Double) =
    abs(sqare(guess) - x)/x <5e-10

def improve(guess:Double, x:Double) =
  (guess + x/guess)/2

def sqrt(x:Double) = sqrtIter(10.0, x)

 sqrt(1.0E50)