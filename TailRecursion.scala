object TailRecursion {

  class Factorial {
    def not_tail_recursive(n: Int): Int = {
      println("n=" + n)//DEBUG//
      if (n == 0) 1
      else n * not_tail_recursive(n-1)
    }
    def tail_recursive(n: Int): Int = {
      def accum_product(next: Int, p: Int): Int = {
        println("n=" + n + ", p=" + p)//DEBUG//
        if (next == 0) p
        else accum_product(next-1, p*next)
      }
      accum_product(n, 1)
    }
  }

  def main(args: Array[String]) {
    val number = args(0).toInt
    val factorial = new Factorial
    println("Not tail recursive: " + factorial.not_tail_recursive(number))
    println("Tail recursive: " + factorial.tail_recursive(number))
  }

}
