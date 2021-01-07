package example

object Intsets {

}

abstract class IntSet {
  def incl(i: Int): IntSet
  def contains(i: Int): Boolean
}

class Empty extends IntSet {
  def contains(i: Int): Boolean = false

  def incl(i: Int): IntSet = new NonEmpty(i, new Empty, new Empty)
}

class NonEmpty(elem: Int, left: IntSet, right: IntSet) extends IntSet {
  def contains(x: Int) =
    if(x < elem) left contains x
    else if (x > elem) right contains x
    else true

  def incl(x: Int): IntSet =
    if(x < elem) new NonEmpty(elem, left incl x, right)
    else if(x > elem) new NonEmpty(elem, left, right incl x)
    else this
}
