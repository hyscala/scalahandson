/*
Create a sealed class Car
Create a trait Engine that has one method def cc:Int
Create a trait Tyres that has one method def tyres: Int
Create a trait Color that has one method def color: String
Create a trait BlueColor that has extends Color and overrides color method to return blue
Create a class Audi that is Car and has Engine of 2000cc, 4 Tyres and is BlueColor
 */
sealed abstract class Car
trait Engine{
  def cc:Int
}
trait Tyres{
  def tyres: Int
}
trait Color{
  def color:String
}
trait BlueColor extends Color{
  override def color = "blue"
}
class Audi extends Car with Engine with Tyres with BlueColor{
  override def cc: Int = 2000

  override def tyres: Int = 4
}

