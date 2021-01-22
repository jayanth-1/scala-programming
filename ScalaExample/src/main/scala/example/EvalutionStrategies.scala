package example

object EvalutionStrategies extends App {

  //call by value evalutes function argument only once

  //call by name function argument is not evaluted if corresponding parameter is unused

  def test (x: Int, y: Int) = x*x

  //already evaluated here both have same number of computations
  println(test(2, 3))

  //call by value is fast
  println(test(3+4, 8))

  //call by name is fast
  println(test(7, 2*4))

  //if function parameter starts with => it uses call by name
  def constOne(x: Int, y: => Int) = 1

}
