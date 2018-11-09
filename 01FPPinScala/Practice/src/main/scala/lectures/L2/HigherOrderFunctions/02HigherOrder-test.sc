// Sum of ints between a and b

def sumInts(a:Int, b:Int):Int =
  if(a>b) 0 else a+sumInts(a+1,b)

// Sum of cubes of ints between a and b

def cube(x:Int) = x*x*x

def sumOfCubes(a:Int, b:Int):Int =
  if(a>b) 0 else  cube(a)+sumOfCubes(a+1,b)

sumInts(3,5)
sumOfCubes(3,5)

