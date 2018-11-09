def mapReduce(f:Int=>Int, combine:(Int,Int), zero:Int)(a:Int,b:Int):Int=
  if (a>b) 1
  else combine(f(a), mapReduce(f,combine,zero)(a+1,b))

mapReduce(f, )



