def product(f:Int=>Int)(a:Int,b:Int):Int =
  if (a>b) 1
  else f(a) * product(f)(a+1,b)

// Square
product(x=>x*x)(2,3)

// Factorial
product(x=>x)(1,5)




