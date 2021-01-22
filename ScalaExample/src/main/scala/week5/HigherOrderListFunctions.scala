package week5

object HigherOrderListFunctions extends App {

  def squareList(xs: List[Int]): List[Int] = xs match {
      case Nil => ???
      case y :: ys => y*y :: squareList(ys)
  }

  // using map
//  def squareList(xs: List[Int]): List[Int] =
//    xs map (x => x*x)

  def posElements(xs: List[Int]): List[Int] = xs match {
      case Nil => xs
      case y :: ys => if(y > 0) y :: posElements(ys) else posElements(ys)
  }

  val nums = List(2, -4, 5, 7, 1)
  val fruits = List("apple", "pineapple", "orange")

  println(nums filter(x => x > 0))
  println(nums filterNot(x => x > 0))
  println(nums partition(x => x > 0))

  println(nums takeWhile(x => x > 0))
  println(nums dropWhile(x => x > 0))
  println(nums span (x => x > 0))

  val data = List("a", "a", "a", "a", "b", "c", "c", "a")
  //function to pack consecutive duplicates of list elements into sublists
  def pack[T](xs: List[T]): List[List[T]] = xs match {
      case Nil => Nil
      case x :: xs1 =>
        val (first, rest) = xs span(y => y == x)
        first :: pack(rest)
  }

  println(pack(data))

  def encode[T](xs: List[T]): List[(T, Int)] =
    pack(xs) map(x => (x.head, x.length))

  println(encode(data))
}
