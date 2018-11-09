def sum(f:Int=>Int):(Int,Int)=>Int = {
  def sumF(a:Int, b:Int):Int =
    if (a>b) 0
    else f(a) + sumF(a+1,b)
  sumF
}

def sumInts = sum(x=>x)
def sumCubes = sum(x=>x*x*x)
def sumFact=sum(fact)

def fact(x:Int):Int = if (x == 0) 1 else x*fact(x-1)

sumCubes(1,10) +sumFact(2,9)
