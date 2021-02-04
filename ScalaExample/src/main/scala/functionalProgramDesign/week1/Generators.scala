package functionalProgramDesign.week1

import java.util.Random
import scala.collection.Iterable.single

object Generators extends App {

  trait Generator[T] {
    def generate: T
  }

  val integers = new Generator[Int] {
    val rand = new Random()
    def generate = rand.nextInt()
  }

//  for (i <- integers) println(i)

  val booleans = new Generator[Boolean] {
    def generate = integers.generate > 0
  }

  val pairs = new Generator[(Int, Int)] {
    def generate = (integers.generate, integers.generate)
  }

  //can we avoid new Generator boiler plate code
//  val booleanss = for (x <- integers) yield x > 0
//
//  def pairss[T, U](t: Generator[T], u: Generator[T]) = for {
//    x <- t
//    y <- u
//  } yield (x, y)
//
//  //random integer between low, high
//  def choose(low: Int, high: Int): Generator[Int] =
//    for (x <- integers) yield low + x % (high - low)
//
//  //pick any one of element in collection
//  def oneOf[T](xs: T*): Generator[T] =
//    for ( idx <- choose(0, xs.length)) yield xs(idx)
//
//  //list generator
//  //not understand
//  def lists: Generator[List[Int]] = for {
//    isEmpty <- booleans
//    list <- if(isEmpty) emptyLists else nonEmptyLists
//  } yield list
//
//  def emptyLists = single(Nil)
//
//  def nonEmptyLists = for {
//    head <- integers
//    tail <- lists
//  } yield head :: tail
}
