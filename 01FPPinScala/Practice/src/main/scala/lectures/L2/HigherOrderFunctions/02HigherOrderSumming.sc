def sum(f:Int=>Int, a:Int,b:Int):Int =
  if (a>b) 0
  else f(a) + sum(f,a+1,b)

def sumRange(a:Int, b:Int) = sum(sumInt,a,b)
def sumCubes(a:Int, b:Int)= sum(cube,a,b)
def sumFact(a:Int, b:Int):Int = sum(fact,a,b)

def sumInt(x:Int):Int = x
def cube(x:Int):Int = x*x*x
def fact(x:Int):Int = if (x == 0) 1 else x*fact(x-1)

sumRange(3,5)
sumCubes(2,3)
sumFact(1,3)