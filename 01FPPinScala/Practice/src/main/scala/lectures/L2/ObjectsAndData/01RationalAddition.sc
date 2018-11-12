//Classes

object  rationals {

  class Rational (x:Int, y:Int) {
    def numer = x
    def denom = y
  }

  //We call elements of the class type objects.
  // Creating object Rational(1,2)

  val x = new Rational(6,9)
  print(x.numer)
  print(x.denom)


  def addRational (r:Rational, s:Rational):Rational =
    new Rational(
      r.numer * s.denom + s.numer * r.denom,
      r.denom * s.denom)

  def makeString(r:Rational) =
    r.numer+"/"+r.denom


  makeString(addRational(new Rational(5,7),new Rational(2,21)))
}




