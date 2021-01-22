package example

object TailRecursion extends App {

  //gcd tail recursive
  def gcd(a: Int, b: Int): Int =
    if (b==0) a else gcd(b, a%b)

  //factorial not a tail recursive
  def factorial(n: Int): Int =
    if(n==0) 1 else n*factorial(n-1)

  //reformulated to tail recursion
  def factorialModified(n: Int): Int = {
    def loop(acc: Int, n: Int): Int =
      if (n ==0) acc
      else loop(acc*n, n-1)
    loop(1,n)
  }
  println(factorial(4))
}
