package week5

object ListUtilityMethods extends App {

  val fruits = List("apple", "banana", "pineapple")
  val sp = List("cricket")

  //length
  println(fruits.length)

  //last element
  println(fruits.last)

  //init (except last element)
  println(fruits.init)

  //first n elements
  println(fruits.take(1))

  //rest of the collection after taking n elements
  println(fruits.drop(1))

  //element at index n
  println(fruits(1))

  //concatenation
  println(fruits ++ sp)

  //reverse
  println(fruits.reverse)

  //updation
  println(fruits.updated(1, "grapes"))

  //index
  println(fruits.indexOf("apple"))

  //contains
  println(fruits.contains("apple"))
}
