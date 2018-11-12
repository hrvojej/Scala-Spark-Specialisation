object rationalisation {

  class Rational(x:Int, y:Int) {
    def numer:Int = x
    def denum:Int = y
  }

  def addRationals (r:Rational, s:Rational):Rational = {
    new Rational(
      s.denum*r.numer + s.numer*r.denum,
      s.denum*r.denum
    )
  }

  def makeOutput(r:Rational):String=
    r.numer+"/"+r.denum

  makeOutput(addRationals(new Rational(2,3), new Rational(4,5)))

}