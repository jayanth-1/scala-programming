package example

object HigherOrderFunctions extends App {

  //sum of integers between a and b
  def sumInts(a: Int, b: Int): Int =
    if(a > b) 0 else a + sumInts(a+1,b)

  //function to calculate cube
  def cube(i: Int): Int =
    i*i*i

  def id(i: Int): Int = i

  //sum of cubes between a and b
  def sumCubes(a: Int, b: Int): Int =
    if(a > b) 0 else cube(a) + sumCubes(a+1, b)

  def sum(f: Int => Int, a: Int, b: Int): Int =
    if (a>b) 0 else f(a) + sum(f,a+1,b)

  //sum of integers using higher order function
  var res1 = sum(id,5,10)

  //sum of cubes using higher order function
  var res2 = sum(cube,5, 10)

  println(res1,res2)

  //with anonymous functions
  res1 = sum(i => i, 5, 10)
  res2 = sum(i => i*i*i, 5, 10)

  println(res1,res2)

  //currying
  def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int =
    if(a > b) zero
    else combine(f(a), mapReduce(f, combine, zero)(a + 1, b))

  def product(f: Int => Int)(a: Int, b: Int): Int = mapReduce(f, (x,y) => x*y, 1)(a,b)

  var res3 = product(x => x*x)(3, 4)
  println(res3)
}
