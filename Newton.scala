import scala.math._

object Newton {

  class Recursive(square: Double) {

    val precision = 1e-6

    def improve(guess: Double): Double =
      (square/guess + guess)/2

    def isPrecise(guess: Double): Boolean =
      abs(square - guess*guess) < precision

    def sqrt(): Double = sqrtIter(1.0)

    def sqrtIter(guess: Double): Double =
      if (isPrecise(guess)) guess
      else sqrtIter(improve(guess))

  }

  class Iterative(square: Double) {

    private val precision = 1e-6

    def avg(x: Double, y: Double): Double = (x+y)/2

    def quotient(x: Double, y: Double): Double = x/y

    def sqrt(): Double = {
      var root = 1.0
      var previous = 0.0
      while (scala.math.abs(root-previous) > precision) {
        previous = root
        root = avg(root, quotient(square, root))
//DEBUG//        println(root)//DEBUG//
      }
      root
    }

  }

  def main(args: Array[String]) {
    val square = args(0).toDouble
    val iterative = new Iterative(square)
    val recursive = new Recursive(square)
    println("Iterative sqrt of " + square + " = " + iterative.sqrt())
    println("Recursive sqrt of " + square + " = " + recursive.sqrt())
  }


}
