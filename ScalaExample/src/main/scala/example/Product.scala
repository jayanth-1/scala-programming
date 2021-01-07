package example

object Product extends App {

  def product(f: Int => Int)(a: Int, b: Int): Int =
    if(a > b) 1 else f(a)*product(f)(a+1,b)

  product(x=> x)(3,4)

  def fact(i: Int) = product(i => i)(1,i)
  fact(5)


}
