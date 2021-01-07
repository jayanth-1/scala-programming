package example

object Currying extends App {

  def add(x:Int, y:Int) = x + y

  //curried function
  def add2(x: Int) = (y: Int) => x + y

  //default scala gives signature for curried functions
  def add3(x: Int) (y: Int) = x + y

  println(add(10,20))
  println(add2(20)(10))

  //partial application
  val res1 = add2(20)
  println(res1(10))

  println(add3(20)(10))

  //partial application
  val res2 = add3(20)_
  println(res2(10))
}
