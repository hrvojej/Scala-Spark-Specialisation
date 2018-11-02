//Sum of integers between a and b

def sumInt(a:Int, b:Int):Int =
 if (a>b) 0 else a + sumInt(a+1,b)

//Sum of cubes of intgers between a and b

def cube(x:Int) = x*x*x

def sumOfCubes (a:Int, b:Int):Int =
  if (a>b) 0 else cube(a) + sumOfCubes(a+1, b)


// factorial: product of all nums  1 to a.
def fact(a:Int):Int =
  if (a == 0) 0
  else if (a == 1) 1
  else a*fact(a-1)

fact (4)

//Sum of all factorials nums btween a and b

def sumFactorial(a:Int, b:Int):Int =
  if (a>b) 0 else fact(a) + sumFactorial(a+1,b)

//MAPPING

def sum(f:Int => Int, a:Int, b:Int): Int ={
  if (a>b) 0 else
    f(a) + sum(f,a+1,b)
}

// Literals
val str ="mali medo"
print(str)
//Insted
print("Mali medo")

//Too many auxiliary functions:

def sumInts(a:Int,b:Int) = sum(id,a,b)
def sumCubes(a:Int, b:Int) = sum(cube, a, b)
def sumFactorial(a:Int,b:Int) = sum(fact,a,b)

def id(a:Int, b:Int)= a+b
def cube(x:Int) = x*x*x
def fact(x:Int) = if (x<=0) 1 else x*fact(x-1)

// Sum(x:Int,y:Int) => Double - map int to double

// Anonymous function parameters

(x:Int) => Int
(x:Int, y:Int) => x + y

//Using anonymous functions we can write shorter:

def sumInts(a:Int, b:Int) = sum(x => x + x, a, b)
def sumCube(x:int) =sumCube(x=>x*x*x, a,b)