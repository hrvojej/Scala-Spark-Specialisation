def square(x:Double)= x*x
square(2)
square(square(2))
def sumOfSquares(x:Double, y:Double)=square(x)+square(y)
sumOfSquares(2,3)
sumOfSquares((1+3),(4+5))


// Call by Value and Call by Name
def constAdd (x:Int,y: =>Int) = x+y //x is CBV y is CBN

//Conditional Expressions
def abs(x:Int)= if (x>=0) x else -x
abs(-34)
def loop:Boolean= loop

def and(x:Boolean,y: => Boolean) = if (x) y else false
and(true, false)
and(true, true)
and(false, loop)