package util


class Fraction(val numerator: Int, val denominator: Int) {
  println(s"Numerator is: $numerator")
  println(s"Denominator is: $denominator")
  println(s"Fraction: $numerator/$denominator. Decimal: ${numerator/(denominator*1.0)}")


  def getFraction: Double = numerator/(denominator*1.0)

  /**
    * + takes input argument as Fraction and returns another Fraction object after adding this and that
    * @param other
    * @return
    */
  def + (other: Fraction): Fraction = {
    val num = (numerator * other.denominator) + (denominator * other.numerator)
    val den = denominator * other.denominator
    new Fraction(num, den)
  }

  /**
    * - takes input argument as Fraction and returns another Fraction object after subtracting this and that
    * @return
    */
  def - (other: Fraction): Fraction = {
    val num = (numerator * other.denominator) - (denominator * other.numerator)
    val den = denominator * other.denominator
    new Fraction(num, den)
  }


  /**
    * / takes input argument as Fraction and returns another Fraction object after dividing this and that
    * @return
    */
  def / (other: Fraction): Fraction = {
    val num = numerator * other.denominator
    val den = denominator * other.numerator
    new Fraction(num, den)
  }

  /**
    * * takes input argument as Fraction and returns another Fraction object after multiplying this and that

    * @return
    */

  def * (other:Fraction): Fraction = {
    new Fraction(numerator * other.numerator, denominator * other.denominator)
  }

  override def toString: String = "Fraction: "+numerator+"/"+denominator

}
