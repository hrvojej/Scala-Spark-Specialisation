def sum(f:Int=>Int, a:Int, b:Int) = {

  def loop(a:Int, acc:Int):Int =
    if (a>b) acc
    else loop(a+1, f(a)+acc)
  loop(1,0)
}

sum (x=>x*x, 2,3)