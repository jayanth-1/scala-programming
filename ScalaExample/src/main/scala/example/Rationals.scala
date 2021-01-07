package example

object Rationals extends App {

  val x = new Rational(1,2)

  println(x.numer)

  val y = new Rational(2,3)
  val z = new Rational(4, 5)
  println(x.add(y))
  println(x.sub(y).sub(z))
  println(x.less(y))
  println(x.max(y))

  //throws illegal argument exception
//  val a = new Rational(1,0)
}

class Rational(x: Int, y: Int) {
  require(y != 0, "denominator must me non zero")
  private def gcd(a: Int, b: Int): Int = if (b==0) a else gcd(b, a%b)
  private val g = gcd(x, y)

  def numer = x/g
  def denom = y/g

  def add(that: Rational) = {
    new Rational(numer*that.denom + denom*that.numer, denom*that.denom)
  }

  def neg: Rational = new Rational(-numer, denom)

  def sub(that: Rational) = add(that.neg)

  def less(that: Rational) = numer*that.denom < that.numer*denom

  def max(that: Rational) = if(this.less(that)) that else this

  override def toString = numer + "/" + denom
}
