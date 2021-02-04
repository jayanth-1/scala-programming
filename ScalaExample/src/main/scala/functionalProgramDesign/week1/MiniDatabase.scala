package functionalProgramDesign.week1

object books extends App {
  case class Book(title: String, authors: List[String])

  val books = Set(
    Book(title = "Structure and interpretation of Computer Program",
      authors = List("Abelson, Harald","Sussman, Gerald J.")),

    Book(title = "Introduction to functional programming",
      authors = List("Abelson, Richard","Wadler, Phil")),
    )

    val res = for (b <- books; a <- b.authors if a startsWith "Abelson") yield b.title

    for (r <- res)
      println(r)

    //print names of all authors who have written atleast two books present in the database

  for {
    b1 <- books
    b2 <- books
    if b1.title < b2.title
    a1 <- b1.authors
    a2 <- b2.authors
    if a1 == a2
  } yield a1
}
