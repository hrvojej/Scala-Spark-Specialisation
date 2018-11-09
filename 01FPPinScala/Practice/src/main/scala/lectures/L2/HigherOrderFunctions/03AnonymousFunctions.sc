def sum(f:Int=>Int, a:Int,b:Int):Int =
  if (a>b) 0
  else f(a) + sum(f,a+1,b)

def sumInts(a:Int,b:Int) = sum(x=>x, a,b)
def sumCube(a:Int, b:Int) = sum(x=>x*x*x,a,b)
def sumFact(a:Int, b:Int) = sum(x=>x*(x-1),a,b)

sumInts(2,3)
sumCube(2,3)
sumFact(1,4)


