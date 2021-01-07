package example

object Conditionals extends App {
  def and(x: Boolean, y: => Boolean) =
    if(x) y else false

  def or(x: Boolean, y: Boolean) =
    if(x) true else y

  //and operator
  println(and(false, true))

  //or operator
  println(or(false, true))
}



