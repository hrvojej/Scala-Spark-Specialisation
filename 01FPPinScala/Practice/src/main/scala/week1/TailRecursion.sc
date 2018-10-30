// Common denominator - naturally tail recursive

def gdc(a:Int, b:Int):Int =
  if (b==0) a else gdc(b, a%b)

gdc(12,120)
