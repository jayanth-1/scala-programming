package week5

object Maps extends App {
  val romanNumerals = Map("I" -> 1, "V" -> 5, "X" -> 10)

  println(romanNumerals("I"))
  println(romanNumerals.get("II"))
  println(romanNumerals.get("I"))
}
