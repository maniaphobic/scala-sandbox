class Complex(real: Double, imaginary: Double) {
  def re = real
  def im = imaginary
  override def toString()  =
    "" + re + (if (im > 0) "+" else "") + im + "i"
}

object ComplexDriver {
  def main(args: Array[String]) {
    val c = new Complex(args(0).toDouble, args(1).toDouble)
    println(c)
  }
}
