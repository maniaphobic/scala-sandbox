object MyList {

  def main(args: Array[String]) {
    var l = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11)
    println(l + " reversed is " + reverse(l))
  }

  def reverse(l: List[Int]): List[Int] = {
//DEBUG//    println(l) //DEBUG//
    return(
      if (l.tail.isEmpty) List(l.head)
      else reverse(l.tail) ::: List(l.head)
    )
  }

}
